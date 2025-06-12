// Quando clicar no botão "Cadastrar"
document.getElementById('formCadastro').addEventListener('submit', function(e) {
	e.preventDefault();
	
	form.addEventListener("submit", async (event) => {
	        event.preventDefault();


	const nomeUsuario = document.getElementById('nomeUsuario').value;
	const email = document.getElementById('email').value;
    const tel = document.getElementById('tel').value;
    const cpf = document.getElementById('cpf').value;
    const dtNascimento = document.getElementById('dtNascimento').value;
    const senha = document.getElementById('senha').value

	try{ 
	// Enviar para a API
	fetch('http://localhost:8080/cadastrousuario', {
		method: 'POST',
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify(
			{ 
				nome_usuario: nomeUsuario, 
				email: email,
                tel: tel,
                cpf: cpf,
                dt_nascimento: dt_nascimento,
                senha: senha

			})
	});
	
	then(response => {
		  if (response.ok) {
	        return response.json();
		} else {
	        throw new Error('Erro ao cadastrar usuário');
	                }
	 })
	      .then(data => {
	                    alert('Usuário cadastrado com sucesso!\nNomeUsuario: ' + data.nomeUsuario);
	                    window.location.href = 'index.html';
	                })


	  if (!response.ok) {
	      throw new Error('Erro ao cadastrar pessoa');
	  }

	            const data = await response.json();

	       localStorage.setItem('pessoaId', data.idUsuario); 
	       window.location.href = './cadastroendereco.html';
	
	} catch(error){
		console.error('Erro no cadastro:', error);
		            alert('Falha ao cadastrar pessoa. Tente novamente.');
	}

});
})
