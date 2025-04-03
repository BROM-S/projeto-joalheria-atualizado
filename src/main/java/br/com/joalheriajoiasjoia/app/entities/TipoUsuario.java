package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_usuario")
	private Long id_tipo_usuario;
	
	@Column(name = "nome_tipo_usuario")
	private String nome_tipo_usuario;
	


	//Construtores
	public TipoUsuario() {
		
	}
	
	public TipoUsuario(Long id_tipo_usuario, String nome_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
		this.nome_tipo_usuario = nome_tipo_usuario;
	}

	//Getters and Setters
	public Long getId_tipo_usuario() {
		return id_tipo_usuario;
	}

	public void setId_tipo_usuario(Long id_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
	}

	public String getNome_tipo_usuario() {
		return nome_tipo_usuario;
	}

	public void setNome_tipo_usuario(String nome_tipo_usuario) {
		this.nome_tipo_usuario = nome_tipo_usuario;
	}

}