document.getElementById("cep").addEventListener("input", async function(){
	const cep = this.value.replace(/\D/g, "");
	
	if (cep.length === 8){
		try{
			const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
		
			if(!response.ok) throw new Error("Erro ao buscar CEP");
			
			const dados = await response.json();
			
			if(dados.erro){
				alert("CEP não encontrado")
				return;
			}
			
			document.getElementById("rua").value = dados.rua;
			document.getElementById("bairro").value = dados.bairro;
			document.getElementById("cidade").value = dados.cidade;
			document.getElementById("estado").value = dados.estado;
			document.getElementById("complemento").value = dados.complemento;
			document.getElementById("cep").value = dados.cep;
			document.getElementById("numeroCasa").value = dados.numeroCasa;
		}	catch(error){
			alert("Erro ao buscar o endereço: " + error.message);
		}
		
		
	}
})

document.addEventListener("DOMContentLoaded", () =>{
	
	const form = document.getElementById("EnderecoForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const cep = document.getElementById("cep").value;
		const estado = document.getElementById("estado").value;
		const cidade = document.getElementById("cidade").value;
		const numeroCasa = document.getElementById("numeroCasa").value;
		const bairro = document.getElementById("bairro").value;
        const rua = document.getElementById("rua").value;
		const complemento = document.getElementById("complemento").value;

		
		try {
			
			const response = await fetch ("http://localhost:8080/endereco", {
				method: "POST",
				headers:{
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					cep,
					estado,
					cidade,
					numeroCasa,
					bairro,
                    rua,
					complemento
				}),
			});
			if(!response.ok){
				throw new Error("Erro ao cadastrar endereço!");
			}
			else{
				alert("Endereço cadastrado com sucesso!");
			}
			}
			catch(error){
				alert(error.message);
			}
		
	});
});