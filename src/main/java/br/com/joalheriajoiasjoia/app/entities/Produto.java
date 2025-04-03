package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	//Atributos
	@Id
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
	
	@Column(name = "cor", nullable = false, length = 20)
	private String cor;

	@ManyToOne
	@JoinColumn(name = "categoria_produto", nullable = false)
	private CategoriaProduto categoriaProduto;
	
	@ManyToOne
	@JoinColumn(name = "tipo_produto", nullable = false)
	private TipoProduto tipoProduto;
	
	@ManyToOne
	@JoinColumn(name = "ornamento", nullable = false)
	private Ornamento ornamento;
	
	
	//Construtores
	public Produto(){
		
	}
	
	public Produto(Long id_produto, String nome, String desc_produto, double preco, int quant_estoque, String cor) {
		this.id_produto = id_produto;
		this.nome = nome;
		this.desc_produto = desc_produto;
		this.preco = preco;
		this.quant_estoque = quant_estoque;
		this.cor = cor;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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
