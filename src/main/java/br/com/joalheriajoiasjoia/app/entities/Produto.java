package br.com.joalheriajoiasjoia.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduto")
	private Long idProduto;
	
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "descProduto")
	private String descProduto;
	
	@Column(name = "preco", nullable = false)
	private double preco;
	
	@Column(name = "quantEstoque")
	private int quantEstoque;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	@JoinColumn(name = "categoriaProduto", nullable = false)
	private CategoriaProduto categoriaProduto;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	@JoinColumn(name = "tipoProduto", nullable = false)
	private TipoProduto tipoProduto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	@JoinColumn(name = "ornamento", nullable = false)
	private Ornamento ornamento;
	
	
	//Construtores
	public Produto() {
		
	}
	
	public Produto(Long idProduto, String nome, String descProduto, double preco, int quantEstoque, CategoriaProduto categoriaProduto, TipoProduto tipoProduto, Ornamento ornamento) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.descProduto = descProduto;
		this.preco = preco;
		this.quantEstoque = quantEstoque;
		this.categoriaProduto = categoriaProduto;
		this.tipoProduto = tipoProduto;
		this.ornamento = ornamento;
	}

	//Getters and Setters
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Ornamento getOrnamento() {
		return ornamento;
	}

	public void setOrnamento(Ornamento ornamento) {
		this.ornamento = ornamento;
	}
}
