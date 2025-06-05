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
@Table(name = "tb_tipo_produto")
public class TipoProduto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoProduto", nullable = false)
	private Long idTipoProduto;
	
	@Column(name = "descricaoTipoProduto", nullable = false)
	private String descricaoTipoProduto;
	
	@Column(name = "nomeTipoProduto")
	private String nomeTipoProduto;
	
	@OneToMany(mappedBy = "tipoProduto")
	private Set<Produto> produtos;

	public TipoProduto() {
		
	}
	
	public TipoProduto(Long idTipoProduto, String descricaoTipoProduto, String nomeTipoProduto) {
		super();
		this.idTipoProduto = idTipoProduto;
		this.descricaoTipoProduto = descricaoTipoProduto;
		this.nomeTipoProduto = nomeTipoProduto;
	}

	public Long getIdTipoProduto() {
		return idTipoProduto;
	}

	public void setIdTipoProduto(Long idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
	}

	public String getDescricaoTipoProduto() {
		return descricaoTipoProduto;
	}

	public void setDescricaoTipoProduto(String descricaoTipoProduto) {
		this.descricaoTipoProduto = descricaoTipoProduto;
	}

	public String getNomeTipoProduto() {
		return nomeTipoProduto;
	}

	public void setNomeTipoProduto(String nomeTipoProduto) {
		this.nomeTipoProduto = nomeTipoProduto;
	}
}
