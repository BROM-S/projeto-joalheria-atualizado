package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.repositories.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario saveUsuario( Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public List<Usuario> getAllUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public Usuario getUsuarioById (Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}

	 public Usuario buscarUsuarioPorCpf(String cpf) {
	    	return usuarioRepository.findByCpf(cpf);
	    }
	 
	 public Usuario buscarUsuarioPorId(Long id) {
	        return usuarioRepository.findById(id).orElse(null);
	    }
	 public Usuario autenticarPessoa(String email, String senha) {
			
			//Buscar no banco de dados um usuário que tenha o email informado 
			//Objeto sendo instanciado
			Usuario pessoa = usuarioRepository.findByEmail(email);
			
			//Verifica se o usuário foi encontrado e se a senha informada confere com a senha do usuário
			if(pessoa != null && pessoa.getSenha().equals(senha)) {
				//Se email e senha estiverem corretos, retorna o objeto usuarioAutentiicado
				return pessoa;
			}else {
				//Se o usuário não existir ou a senha não estiver correta, retorna null(falha na autenticação)
				return null;
			}
	 }
}
