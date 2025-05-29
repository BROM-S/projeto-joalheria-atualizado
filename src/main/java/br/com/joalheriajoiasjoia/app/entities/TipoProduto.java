package br.com.joalheriajoiasjoia.app.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_produto")
public class TipoProduto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_produto", nullable = false)
	private Long id_tipo_produto;
	
	@Column(name = "descricao_tipo_produto", nullable = false)
	private String descricao_tipo_produto;
	
	@Column(name = "nome_tipo_produto")
	private String nome_tipo_produto;
	
	@OneToMany(mappedBy= "tipo_produto")
	private Set<Produto> produtos;


	public TipoProduto() {
		
	}
	
	public TipoProduto(Long id_tipo_produto, String descricao_tipo_produto, String nome_tipo_produto) {
		super();
		this.id_tipo_produto = id_tipo_produto;
		this.descricao_tipo_produto = descricao_tipo_produto;
		this.nome_tipo_produto = nome_tipo_produto;
	}

	public Long getId_tipo_produto() {
		return id_tipo_produto;
	}

	public void setId_tipo_produto(Long id_tipo_produto) {
		this.id_tipo_produto = id_tipo_produto;
	}

	public String getDescricao_tipo_produto() {
		return descricao_tipo_produto;
	}

	public void setDescricao_tipo_produto(String descricao_tipo_produto) {
		this.descricao_tipo_produto = descricao_tipo_produto;
	}

	public String getNome_tipo_produto() {
		return nome_tipo_produto;
	}

	public void setNome_tipo_produto(String nome_tipo_produto) {
		this.nome_tipo_produto = nome_tipo_produto;
	}
	
	
}
