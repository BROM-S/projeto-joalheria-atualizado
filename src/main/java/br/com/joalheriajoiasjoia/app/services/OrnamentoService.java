package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Ornamento;
import br.com.joalheriajoiasjoia.app.repositories.OrnamentoRepository;

@Service
public class OrnamentoService {

    
    @Autowired
    private OrnamentoRepository OrnamentoRepository;
    
    public Ornamento saveOrnamento( Ornamento ornamento) {
        return OrnamentoRepository.save(ornamento);
    }
    
    public List<Ornamento> getAllOrnamento(){
        return OrnamentoRepository.findAll();
    }
    
    public Ornamento getOrnamentoById (Long id) {
        return OrnamentoRepository.findById(id).orElse(null);
    }
    
    public void deleteOrnamento(Long id) {
        OrnamentoRepository.deleteById(id);
    }
}