package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ornamento")
public class Ornamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ornamento", nullable = false)
    private Long id_ornamento;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "descricao", nullable = false)
    private String descricao;

    public Ornamento() {
    	
    }
    
    public Ornamento(Long id_ornamento, String nome, String descricao) {
        super();
        this.id_ornamento = id_ornamento;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getId_ornamento() {
        return id_ornamento;
    }

    public void setIdOrnamento(Long id_ornamento) {
        this.id_ornamento = id_ornamento;
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