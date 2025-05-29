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

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;

@RestController
@RequestMapping("/tipoUsuario")
public class TipoUsuarioController {


	@Autowired
	private TipoUsuarioService tipoUsuarioService;

	@PostMapping
	public TipoUsuario createTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
		return tipoUsuarioService.saveTipoUsuario(tipoUsuario);
	}

	@GetMapping
	public List<TipoUsuario> getAllTipoUsuarios() {
		return tipoUsuarioService.getAllTipoUsuarios();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Object> buscarTipoUsuarioPorId(@PathVariable Long id){
		TipoUsuario tipoUsuario = tipoUsuarioService.buscarTipoProdutoPorId(id);
    
    	if(tipoUsuario != null) {
    		return ResponseEntity.ok(tipoUsuario);
    	} else {
    		return ResponseEntity.status(404).body("Tipo de Usuário com ID "+id+" não foi encontrada");
    	}
    
    }

	@PutMapping
	public TipoUsuario editTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
		return tipoUsuarioService.saveTipoUsuario(tipoUsuario);
	}

	@DeleteMapping("/{id}")
	public void deleteTipoUsuario(@PathVariable Long id) {
		tipoUsuarioService.deleteTipoUsuario(id);
	}

	
}
