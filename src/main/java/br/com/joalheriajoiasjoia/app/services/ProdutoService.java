package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	// Adicionar Produto
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	// Buscar Produto
	public List<Produto> getAllProduto() {
		return produtoRepository.findAll();
	}

	// Buscar Produto por ID
	public Produto getProdutoById(Long idProduto) {
		return produtoRepository.findById(idProduto).orElse(null);
	}

	// Deletar Produto
	public void deleteProduto(Long idProduto) {
		produtoRepository.deleteById(idProduto);
	}

}
