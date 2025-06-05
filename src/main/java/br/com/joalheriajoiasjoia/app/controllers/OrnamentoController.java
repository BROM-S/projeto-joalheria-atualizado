package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.joalheriajoiasjoia.app.entities.Ornamento;
import br.com.joalheriajoiasjoia.app.services.OrnamentoService;

@RestController
@RequestMapping("/ornamento")
public class OrnamentoController {

    @Autowired
    private OrnamentoService ornamentoService;

    @PostMapping
    public Ornamento createOrnamento(@RequestBody Ornamento ornamento) {
        return ornamentoService.saveOrnamento(ornamento);
    }

    @GetMapping
    public List<Ornamento> getAllOrnamento() {
        return ornamentoService.getAllOrnamento();
    }

    @GetMapping("/{idOrnamento}")
    public Ornamento getOrnamento(@PathVariable Long idOrnamento) {
        return ornamentoService.getOrnamentoById(idOrnamento);
    }

    @PutMapping
    public Ornamento editOrnamento(@RequestBody Ornamento ornamento) {
        return ornamentoService.saveOrnamento(ornamento);
    }

    @DeleteMapping("/{idOrnamento}")
    public void deleteOrnamento(@PathVariable Long idOrnamento) {
        ornamentoService.deleteOrnamento(idOrnamento);
    }
}
