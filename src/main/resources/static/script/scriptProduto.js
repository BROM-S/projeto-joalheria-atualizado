document.addEventListener("DOMContentLoaded", () =>{
	
	const form = document.getElementById("ProdutoForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const nome = document.getElementById("nome").value;
		const desc_produto = document.getElementById("desc_produto").value;
		const preco = document.getElementById("preco").value;
		const quant_estoque = document.getElementById("quant_estoque").value;
		const cor = document.getElementById("cor").value;
		const categoria_produto = (document.getElementById("categoria_produto").value);
		const tipo_produto = (document.getElementById("tipo_produto").value);
		
		try {
			
			const response = await fetch ("http://localhost:8080/ProdutoForm", {
				method: "POST",
				headers:{
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nome,
					desc_produto,
					preco,
					quant_estoque,
					cor,
					categoria_produto: {
					                   id_produto: categoria_produto
					               }, 
					tipo_produto: {
					                   id_produto: tipo_produto
					               }
				}),
			});
			if (response.ok){
				alert("Produto cadastrado com sucesso!");
				window.location.href = "produto.html";
			}else{
				alert("Erro ao cadastrar produto.");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o produto:", error)
		}
		
		
	});
});