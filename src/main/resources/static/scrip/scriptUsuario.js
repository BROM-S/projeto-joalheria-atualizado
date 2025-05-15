// Quando clicar no botão "Cadastrar"
document.getElementById('formCadastro').addEventListener('submit', function(e) {
	e.preventDefault();

	const nome_usuario = document.getElementById('nome_usuario').value;
	const email = document.getElementById('email').value;
    const tel = document.getElementById('tel').value;
    const cpf = document.getElementById('cpf').value;
    const dt_nascimento = document.getElementById('dt_nascimento').value;
    const senha = document.getElementById('senha').value

	// Enviar para a API
	fetch('http://localhost:8080/cadastrousuario', {
		method: 'POST',
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify(
			{ 
				nome_usuario: nome_usuario, 
				email: email,
                tel: tel,
                cpf: cpf,
                dt_nascimento: dt_nascimento,
                senha: senha

			})
	});

	document.getElementById('formCadastro').reset();
	location.reload();

});

// Quando a página carregar
window.onload = function() {
	
	fetch('http://localhost:8080/cadastrousuario')
		.then(res => res.json())
		.then(Jogos => {
			const tabela = document.getElementById('tabelaJogos').querySelector('tbody');
			Jogos.forEach(p => {
				const linha = tabela.insertRow();
				linha.insertCell(0).textContent = p.nomeJogo;
				linha.insertCell(1).textContent = p.anoLancamento;
                linha.insertCell(2).textContent = p.tipoJogo;
			});
		});
};