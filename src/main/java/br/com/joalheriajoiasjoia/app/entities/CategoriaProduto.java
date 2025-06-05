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
@Table(name = "tb_categoria_produto")
public class CategoriaProduto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategoriaProduto", nullable = false)
	private Long idCategoriaProduto;
	
	@Column(name = "nomeCategoriaProduto", nullable = false, length = 50)
	private String nomeCategoriaProduto;
	
	@Column(name = "descricaoCategoriaProduto", nullable = false)
	private String descricaoCategoriaProduto;
	
	@OneToMany(mappedBy = "categoriaProduto")
	private Set<Produto> produtos;


	//Construtores
	public CategoriaProduto() {
		
	}
	
	public CategoriaProduto(Long idCategoriaProduto, String nomeCategoriaProduto, String descricaoCategoriaProduto) {
		this.idCategoriaProduto = idCategoriaProduto;
		this.nomeCategoriaProduto = nomeCategoriaProduto;
		this.descricaoCategoriaProduto = descricaoCategoriaProduto;
	}

	//Getters and Setters

	public Long getIdCategoriaProduto() {
		return idCategoriaProduto;
	}

	public void setIdCategoriaProduto(Long idCategoriaProduto) {
		this.idCategoriaProduto = idCategoriaProduto;
	}

	public String getNomeCategoriaProduto() {
		return nomeCategoriaProduto;
	}

	public void setNomeCategoriaProduto(String nomeCategoriaProduto) {
		this.nomeCategoriaProduto = nomeCategoriaProduto;
	}

	public String getDescricaoCategoriaProduto() {
		return descricaoCategoriaProduto;
	}

	public void setDescricaoCategoriaProduto(String descricaoCategoriaProduto) {
		this.descricaoCategoriaProduto = descricaoCategoriaProduto;
	}
	
}
