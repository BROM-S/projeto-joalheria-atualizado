package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Material;
import br.com.joalheriajoiasjoia.app.services.MaterialService;

@RestController
@RequestMapping("/material")  // Corrigido para refletir o recurso correto
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @PostMapping
    public Material createMaterial(@RequestBody Material material) {
        return materialService.saveMaterial(material);
    }

    @GetMapping
    public List<Material> getAllMaterial() {
        return materialService.getAllMaterial();
    }

    @GetMapping("/{idMaterial}")
    public Material getMaterial(@PathVariable Long idMaterial) {
        return materialService.getMaterialById(idMaterial);
    }

    @PutMapping
    public Material editMaterial(@RequestBody Material material) {
        return materialService.saveMaterial(material);
    }

    @DeleteMapping("/{idMaterial}")
    public void deleteMaterial(@PathVariable Long idMaterial) {
        materialService.deleteMaterial(idMaterial);
    }
}
