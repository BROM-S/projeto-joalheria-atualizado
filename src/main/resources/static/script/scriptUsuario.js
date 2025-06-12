// Quando clicar no botão "Cadastrar"
document.getElementById('formCadastro').addEventListener('submit', function(e) {
	e.preventDefault();
	
	form.addEventListener("submit", async (event) => {
	        event.preventDefault();


	const nomeUsuario = document.getElementById('nomeUsuario').value;
	const email = document.getElementById('email').value;
    const telefone = document.getElementById('telefone').value;
    const cpf = document.getElementById('cpf').value;
    const dtNascimento = document.getElementById('dtNascimento').value;
    const senha = document.getElementById('senha').value

	try{ 
	// Enviar para a API
	fetch('http://localhost:8080/cadastroUsuario', {
		method: 'POST',
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify(
			{ 
				nomeUsuario: nomeUsuario, 
				email,
                telefone,
                cpf,
                dtNascimento,
                senha,
				tipoUsuario:{
					idTipoUsuario:2
				}

			})
	});
	
	  if (!response.ok) {
	      throw new Error('Erro ao cadastrar pessoa');
	  }

	            const data = await response.json();

	       localStorage.setItem('idUsuario', data.idUsuario); 
	       window.location.href = './cadastroendereco.html';
	
	} catch(error){
		console.error('Erro no cadastro:', error);
		            alert('Falha ao cadastrar pessoa. Tente novamente.');
	}

});
})
