package br.com.joalheriajoiasjoia.app.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ornamento")
public class Ornamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrnamento", nullable = false)
    private Long idOrnamento;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "descricao", nullable = false)
    private String descricao;
    
    @OneToMany(mappedBy = "ornamento")
    private Set<Produto> produto;

    public Ornamento() {
    	
    }
    
    public Ornamento(Long idOrnamento, String nome, String descricao) {
        super();
        this.idOrnamento = idOrnamento;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getIdOrnamento() {
        return idOrnamento;
    }

    public void setIdOrnamento(Long idOrnamento) {
        this.idOrnamento = idOrnamento;
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
