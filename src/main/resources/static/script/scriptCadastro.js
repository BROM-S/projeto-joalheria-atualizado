document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastroUsuarioForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeUsuario = document.getElementById("nomeUsuario").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const senha = document.getElementById("senha").value;
		const telefone = document.getElementById("telefone").value;
		const dtNascimento = document.getElementById("dt_nascimento").value;

		try {

			const response = await fetch("http://localhost:8080/cadastroUsuario.html", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nomeUsuario,
					cpf,
					telefone,
					email,
					senha,
					dtNascimento,
					tipo_usuario: {
						id_tipo_usuario: 2
					}
				}),
			});
			if (response.ok) {
				alert("Usuário cadastrado com sucesso!");
			} else {
				console.log('Erro na resposta da API:', response.status, response.statusText);
				alert("Erro ao cadastrar usuário.");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o usuário:", error);
		}


	});
});