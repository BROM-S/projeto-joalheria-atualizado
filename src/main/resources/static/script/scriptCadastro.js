document.addEventListener("DOMContentLoaded", () => {

    // Pegando o formulário com o ID 'cadastroUsuarioForm' e armazenando na variável 'form'
    const form = document.getElementById("cadastroUsuarioForm");

    // Adicionando um escutador de evento para o envio do formulário
    form.addEventListener("submit", async (event) => {
        // Impede o envio tradicional do formulário (evita o recarregamento da página)
        event.preventDefault();

        // Pegando os valores preenchidos nos campos do formulário
        const nomeUsuario = document.getElementById("nomeUsuario").value;
        const cpf = document.getElementById("cpf").value;
        const email = document.getElementById("email").value;
        const senha = document.getElementById("senha").value;
        const telefone = document.getElementById("telefone").value;
        const dtNascimento = document.getElementById("dt_nascimento").value;

        try {
            // Enviando uma requisição POST para o servidor com os dados do formulário no formato JSON
            const response = await fetch("http://localhost:8080/cadastroUsuario.html", {
                method: "POST", // Método POST para envio de dados
                headers: {
                    "Content-Type": "application/json" // Definindo que estamos enviando JSON
                },
                body: JSON.stringify({
                    nomeUsuario, // Enviando os dados coletados do formulário
                    cpf,
                    telefone,
                    email,
                    senha,
                    dtNascimento,
                    tipo_usuario: { id_tipo_usuario: 2 } // Definindo o tipo de usuário
                }),
            });

            // Verificando se a resposta da API foi bem-sucedida (status 200-299)
            if (response.ok) {
                // Exibe um alerta de sucesso se o usuário foi cadastrado corretamente
                alert("Usuário cadastrado com sucesso!");
            } else {
                // Se a resposta não for bem-sucedida, mostra no console o erro e alerta o usuário
                console.log('Erro na resposta da API:', response.status, response.statusText);
                alert("Erro ao cadastrar usuário.");
            }
        } catch (error) {
            // Se ocorrer algum erro no processo de requisição, ele será capturado e exibido no console
            console.error("Erro ao cadastrar o usuário:", error);
        }
    });
});
