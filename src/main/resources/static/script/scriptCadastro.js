document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastroUsuarioForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nome_usuario = document.getElementById("nome_usuario").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const senha = document.getElementById("senha").value;
		const telefone = document.getElementById("telefone").value;
		const dt_nascimento = document.getElementById("dt_nascimento").value;

		try {

			const response = await fetch("http://localhost:8080/cadastroUsuario", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nome_usuario,
					cpf,
					telefone,
					email,
					senha,
					dt_nascimento,
					tipo_usuario: {
						id_tipo_usuario: 2
					}
				}),
			});
			if (response.ok) {
				alert("Usuário cadastrado com sucesso!");
				window.location.href = "http://127.0.0.1:3000/cadastroEndereco.html";
			} else {
				console.log('Erro na resposta da API:', response.status, response.statusText);
				alert("Erro ao cadastrar usuário.");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o usuário:", error);
		}


	});
});