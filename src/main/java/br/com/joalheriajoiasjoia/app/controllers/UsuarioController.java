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

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Object> buscarUsuarioPorId(@PathVariable Long idUsuario){
        Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario);
    
        if(usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(404).body("Usuário com ID " + idUsuario + " não foi encontrado");
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

    @DeleteMapping("/{idUsuario}")
    public void deleteUsuario(@PathVariable Long idUsuario) {
        usuarioService.deleteUsuario(idUsuario);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario loginRequest) {
        Usuario pessoa = usuarioService.autenticarPessoa(loginRequest.getEmail(), loginRequest.getSenha());

        if(pessoa != null) {
            return pessoa;
        } else {
            return null;
        }
    }
}
