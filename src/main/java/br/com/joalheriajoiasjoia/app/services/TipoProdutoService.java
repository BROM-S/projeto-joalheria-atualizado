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
	
	public TipoProduto getTipoProdutoById (Long id_tipo_produto) {
		return tipoProdutoRepository.findById(id_tipo_produto).orElse(null);
	}
	
	public void deleteTipoProduto(Long id_tipo_produto) {
		tipoProdutoRepository.deleteById(id_tipo_produto);
	}
	 
	 public TipoProduto buscarTipoProdutoPorId(Long id_tipo_produto) {
	        return tipoProdutoRepository.findById(id_tipo_produto).orElse(null);
	    }


}
