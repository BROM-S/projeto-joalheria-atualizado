package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;
import br.com.joalheriajoiasjoia.app.repositories.TipoUsuarioRepository;

@Service
public class TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;
    
    public TipoUsuario saveTipoUsuario(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
    }
    
    public List<TipoUsuario> getAllTipoUsuario(){
        return tipoUsuarioRepository.findAll();
    }
    
    public TipoUsuario getTipoUsuarioById(Long idTipoUsuario) {
        return tipoUsuarioRepository.findById(idTipoUsuario).orElse(null);
    }
    
    public void deleteTipoUsuario(Long idTipoUsuario) {
        tipoUsuarioRepository.deleteById(idTipoUsuario);
    }
     
    public TipoUsuario buscarTipoUsuarioPorId(Long idTipoUsuario) {
        return tipoUsuarioRepository.findById(idTipoUsuario).orElse(null);
    }

}
