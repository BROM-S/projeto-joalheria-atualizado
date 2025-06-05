package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.joalheriajoiasjoia.app.entities.TipoProduto;
import br.com.joalheriajoiasjoia.app.services.TipoProdutoService;

@RestController
@RequestMapping("/tipoProduto")
public class TipoProdutoController {

    @Autowired
    private TipoProdutoService tipoProdutoService;

    @PostMapping
    public TipoProduto createTipoProduto(@RequestBody TipoProduto tipoProduto) {
        return tipoProdutoService.saveTipoProduto(tipoProduto);
    }

    @GetMapping
    public List<TipoProduto> getAllTipoProdutos() {
        return tipoProdutoService.getAllTipoProdutos();
    }
    
    @GetMapping("/{idTipoProduto}")
    public ResponseEntity<Object> buscarTipoProdutoPorId(@PathVariable Long idTipoProduto){
        TipoProduto tipoProduto = tipoProdutoService.buscarTipoProdutoPorId(idTipoProduto);
    
        if(tipoProduto != null) {
            return ResponseEntity.ok(tipoProduto);
        } else {
            return ResponseEntity.status(404).body("Tipo de Produto com ID " + idTipoProduto + " não foi encontrado");
        }
    }

    @PutMapping
    public TipoProduto editTipoProduto(@RequestBody TipoProduto tipoProduto) {
        return tipoProdutoService.saveTipoProduto(tipoProduto);
    }

    @DeleteMapping("/{idTipoProduto}")
    public void deleteTipoProduto(@PathVariable Long idTipoProduto) {
        tipoProdutoService.deleteTipoProduto(idTipoProduto);
    }

}
