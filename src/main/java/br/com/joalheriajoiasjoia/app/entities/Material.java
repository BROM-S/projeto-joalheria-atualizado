package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMaterial", nullable = false)
    private Long idMaterial;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "descricao", nullable = false)
    private String descricao;

    public Material(Long idMaterial, String nome, String descricao) {
        super();
        this.idMaterial = idMaterial;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
