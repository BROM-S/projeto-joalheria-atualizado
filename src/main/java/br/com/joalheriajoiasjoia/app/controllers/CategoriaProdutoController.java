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

import br.com.joalheriajoiasjoia.app.entities.CategoriaProduto;
import br.com.joalheriajoiasjoia.app.services.CategoriaProdutoService;

@RestController
@RequestMapping("/categoriaProduto")
public class CategoriaProdutoController {

	@Autowired
	private CategoriaProdutoService categoriaProdutoService;

	@PostMapping
	public CategoriaProduto createCategoriaProduto(@RequestBody CategoriaProduto categoriaProduto) {
		return categoriaProdutoService.saveCategoriaProduto(categoriaProduto);
	}

	@GetMapping
	public List<CategoriaProduto> getAllCategoriasProduto() {
		return categoriaProdutoService.getAllCategoriasProduto();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Object> buscarCategoriaProdutoPorId(@PathVariable Long id){
		CategoriaProduto categoriaProduto = categoriaProdutoService.buscarCategoriaProdutoPorId(id);
    
    	if(categoriaProduto != null) {
    		return ResponseEntity.ok(categoriaProduto);
    	} else {
    		return ResponseEntity.status(404).body("Categoria com ID "+id+" não foi encontrada");
    	}
    
    }

	@PutMapping
	public CategoriaProduto editCategoriaProduto(@RequestBody CategoriaProduto categoriaProduto) {
		return categoriaProdutoService.saveCategoriaProduto(categoriaProduto);
	}

	@DeleteMapping("/{id}")
	public void deleteCategoriaProduto(@PathVariable Long id) {
		categoriaProdutoService.deleteCategoriaProduto(id);
	}

}