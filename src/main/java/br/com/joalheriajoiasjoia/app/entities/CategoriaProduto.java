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
@Table(name = "tb_categoria_produto")
public class CategoriaProduto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria_produto", nullable = false)
	private Long id_categoria_produto;
	
	@Column(name = "nome_categoria_produto", nullable = false, length = 50)
	private String nome_categoria_produto;
	
	@Column(name = "descricao_categoria_produto", nullable = false)
	private String descricao_categoria_produto;
	
	@OneToMany(mappedBy = "categoria_produto")
	@JsonManagedReference
	private Set<Produto> produtos;


	//Construtores
	public CategoriaProduto() {
		
	}
	
	public CategoriaProduto(Long id_categoriaProduto, String nome_categoria_produto, String descricao_categoria_produto) {
		this.id_categoria_produto = id_categoriaProduto;
		this.nome_categoria_produto = nome_categoria_produto;
		this.descricao_categoria_produto = descricao_categoria_produto;
	}

	//Getters and Setters

	public Long getid_categoria_produto() {
		return id_categoria_produto;
	}

	public void setId_categoriaProduto(Long id_categoria_produto) {
		this.id_categoria_produto = id_categoria_produto;
	}

	public String getNome_categoria_produto() {
		return nome_categoria_produto;
	}

	public void setNome_categoria_produto(String nome_categoria_produto) {
		this.nome_categoria_produto = nome_categoria_produto;
	}

	public String getDescricao_categoria_produto() {
		return descricao_categoria_produto;
	}

	public void setDescricao_categoria_produto(String descricao_categoria_produto) {
		this.descricao_categoria_produto = descricao_categoria_produto;
	}
	
}
