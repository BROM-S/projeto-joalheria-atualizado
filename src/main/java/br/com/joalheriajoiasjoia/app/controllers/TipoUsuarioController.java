package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;
import br.com.joalheriajoiasjoia.app.services.TipoUsuarioService;

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
        return tipoUsuarioService.getAllTipoUsuario();
    }
    
    @GetMapping("/{idTipoUsuario}")
    public ResponseEntity<Object> buscarTipoUsuarioPorId(@PathVariable Long idTipoUsuario){
        TipoUsuario tipoUsuario = tipoUsuarioService.buscarTipoUsuarioPorId(idTipoUsuario);
    
        if(tipoUsuario != null) {
            return ResponseEntity.ok(tipoUsuario);
        } else {
            return ResponseEntity.status(404).body("Tipo de Usuário com ID " + idTipoUsuario + " não foi encontrado");
        }
    }

    @PutMapping
    public TipoUsuario editTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioService.saveTipoUsuario(tipoUsuario);
    }

    @DeleteMapping("/{idTipoUsuario}")
    public void deleteTipoUsuario(@PathVariable Long idTipoUsuario) {
        tipoUsuarioService.deleteTipoUsuario(idTipoUsuario);
    }

}
