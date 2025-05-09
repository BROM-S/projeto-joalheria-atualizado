package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.TipoProduto;
import br.com.joalheriajoiasjoia.app.repositories.TipoProdutoRepository;

@Service
public class TipoProdutoService {

	@Autowired
	private TipoProdutoRepository tipoProdutoRepository;
	
	public TipoProduto saveTipoProduto( TipoProduto tipoProduto) {
		return tipoProdutoRepository.save(tipoProduto);
	}
	
	public List<TipoProduto> getAllTipoProdutos(){
		return tipoProdutoRepository.findAll();
	}
	
	public TipoProduto getTipoProdutoById (Long id) {
		return tipoProdutoRepository.findById(id).orElse(null);
	}
	
	public void deleteTipoProduto(Long id) {
		tipoProdutoRepository.deleteById(id);
	}
	 
	 public TipoProduto buscarTipoProdutoPorId(Long id) {
	        return tipoProdutoRepository.findById(id).orElse(null);
	    }


}
