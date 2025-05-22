package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.services.UsuarioService;

@RestController
@RequestMapping("/cadastroUsuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	@GetMapping
	public List<Usuario> getAllUsuarios() {
		return usuarioService.getAllUsuarios();
	}

	/*@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		return clienteService.getClienteById(id);
	}*/
	
	@GetMapping("/{id}")
    public ResponseEntity<Object> buscarUsuarioPorId(@PathVariable Long id){
		Usuario usuario = usuarioService.buscarUsuarioPorId(id);
    
    	if(usuario != null) {
    		return ResponseEntity.ok(usuario);
    	} else {
    		return ResponseEntity.status(404).body("Usuário com ID "+id+" não foi encontrado");
    	}
    
    }
    
    @GetMapping("/cpf/{cpf}")
    public Usuario buscarUsuariosPorCpf(@PathVariable String cpf) {
    	return usuarioService.buscarUsuarioPorCpf(cpf);
    }

	@PutMapping
	public Usuario editUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable Long id) {
		usuarioService.deleteUsuario(id);
	}
	@PostMapping("/login")
	public Usuario login(@RequestBody Usuario loginRequest) {
		//Chama o método de autenticação do service passando o email e senha fornecidos no login
		//1. loginRequest.getEmail() - obtém o email enviado pelo usuário na requisição
		//2. loginRequest.getenha() - obtém a senha enviada pelo usuário na requisição
		//3. usuarioService.autenticarPeessoa(email, senha) verifica no banco se existe um usuário com este email e se a senha é válida
		//4. retorna o objeto usuário autenticado, ou null caso falhe na autenticação
		Usuario pessoa = usuarioService.autenticarPessoa(loginRequest.getEmail(), loginRequest.getSenha());
		
		//Verifica se o serviço retornou um usuário válido (autenticação bem-sucedida)
		if(pessoa != null) {
			//Se autenticado, retorna os dados do usuário
			return pessoa;
		}else {
			//Se não autenticado, retorna null indicando falha no login
			return null;
		}
	

}
}


