ocument.getElementById("cep").addEventListener("input", async function() {
	const cep = this.value.replace(/\D/g, "");

	if(cep.length === 8){
		try {
			const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
			
			if(!response.ok) throw new Error("Erro ao buscar CEP");
			
			const dados = await response.json();
			
			if (dados.erro) {
				alert("CEP não encontrado."); 
				return;
			}
			document.getElementById("nome-cliente").value = dados.nome;
			document.getElementById("rua").value = dados.logradouro;
			document.getElementById("numero").value = dados.numero
			document.getElementById("bairro").value = dados.bairro;
			document.getElementById("cidade").value = dados.localidade;
			document.getElementById("estado").value = dados.uf;
			document.getElementById("pais").value = dados.pais;
			document.getElementById("telefone-cliente").value = dados.telefone
			document.getElementById("email").value = dados.email;
		} catch (error) {
			alert("Erro ao buscar endereço: " + error.message);
		}
	}
});
document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroEnderecoForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const cep = document.getElementById("cep").value;
		const nome = document.getElementById("nome-cliente").value;
		const rua = document.getElementById("rua").value;
		const numCasa = document.getElementById("numero").value;
		const cidade = document.getElementById("cidade").value;
		const estado = document.getElementById("estado").value;
		const comp = document.getElementById("comp").value;
		const pais = document.getElementById("pais").value;
		const bairro = document.getElementById("bairro").value;

		try {
			const response = await fetch("http://localhost:8080/enderecoCliente", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body:JSON.stringify({
					cep,
					nome,
					rua,
					numCasa,
					cidade,
					estado,
					comp,
					pais,
					bairro
				}),
			});
			if (response.ok) {
				window.location.href = "enviado2.html";
			} else {
				alert("Falha ao cadastrar endereço");
			}
		} catch (error) {
			console.error("Erro ao cadastrar endereço: ", error);
		}
	});
});