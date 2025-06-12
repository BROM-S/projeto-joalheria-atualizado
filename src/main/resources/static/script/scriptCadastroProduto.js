document.addEventListener("DOMContentLoaded", () =>{
	
	const form = document.getElementById("/cadastrar_produto");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const nome = document.getElementById("nome").value;
		const descProduto = document.getElementById("descProduto").value;
		const preco = document.getElementById("preco").value;
		const quantEstoque= document.getElementById("quantEstoque").value;
		const tipoProduto = (document.getElementById("tipoProduto").value);
		const ornamento =(document.getElementById("ornamento".value));
		
		try {
			
			const response = await fetch ("http://localhost:8080/ProdutoForm", {
				method: "POST",
				headers:{
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nome,
					descProduto,
					preco,
					quantEstoque,
					ornamento,
					categoria_produto: {
					                   id_produto: categoria_produto
					               }, 
					tipo_produto: {
					                   id_produto: tipoProduto
					               }
				}),
			});
			if (response.ok){
				alert("Produto cadastrado com sucesso!");
				window.location.href = "enviado.html";
			}else{
				alert("Erro ao cadastrar produto.");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o produto:", error)
		}
		
		
	});
});