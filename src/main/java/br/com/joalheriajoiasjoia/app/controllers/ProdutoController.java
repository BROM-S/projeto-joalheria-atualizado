package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }
    
    @GetMapping
    public List<Produto> getAllProduto() {
        return produtoService.getAllProduto();
    }

    @GetMapping("/{idProduto}")
    public Produto getProduto(@PathVariable Long idProduto) {
        return produtoService.getProdutoById(idProduto);
    }

    @DeleteMapping("/{idProduto}")
    public void deleteProduto(@PathVariable Long idProduto) {
        produtoService.deleteProduto(idProduto);
    }

}
