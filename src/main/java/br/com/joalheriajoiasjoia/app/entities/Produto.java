package br.com.joalheriajoiasjoia.app.entities;

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
	@Column(name = "id_produto")
	private Long id_produto;
	
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "desc_produto")
	private String desc_produto;
	
	@Column(name = "preco", nullable = false)
	private double preco;
	
	@Column(name = "quant_estoque")
	private int quant_estoque;

	@ManyToOne
	@JoinColumn(name = "categoria_produto", nullable = false)
	private CategoriaProduto categoria_produto;
	
	@ManyToOne
	@JoinColumn(name = "tipo_produto", nullable = false)
	private TipoProduto tipo_produto;
	
	@ManyToOne
	@JoinColumn(name = "ornamento", nullable = false)
	private Ornamento ornamento;
	
	
	//Construtores
	public Produto(){
		
	}
	
	public Produto(Long id_produto, String nome, String desc_produto, double preco, int quant_estoque, CategoriaProduto categoria_produto, TipoProduto tipo_produto, Ornamento ornamento) {
		this.id_produto = id_produto;
		this.nome = nome;
		this.desc_produto = desc_produto;
		this.preco = preco;
		this.quant_estoque = quant_estoque;
		this.categoria_produto = categoria_produto;
		this.tipo_produto = tipo_produto;
		this.ornamento = ornamento;
	}

	//Getters and Setters
	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc_produto() {
		return desc_produto;
	}

	public void setDesc_produto(String desc_produto) {
		this.desc_produto = desc_produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuant_estoque() {
		return quant_estoque;
	}

	public void setQuant_estoque(int quant_estoque) {
		this.quant_estoque = quant_estoque;
	}

	public CategoriaProduto getCategoria_produto() {
		return categoria_produto;
	}

	public void setCategoria_produto(CategoriaProduto categoria_produto) {
		this.categoria_produto = categoria_produto;
	}

	public TipoProduto getTipo_produto() {
		return tipo_produto;
	}

	public void setTipo_produto(TipoProduto tipo_produto) {
		this.tipo_produto = tipo_produto;
	}

	public Ornamento getOrnamento() {
		return ornamento;
	}

	public void setOrnamento(Ornamento ornamento) {
		this.ornamento = ornamento;
	}
	
	
}
