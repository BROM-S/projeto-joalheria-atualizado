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
@Table(name = "tb_tipo_usuario")
public class TipoUsuario {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoUsuario")
	private Long idTipoUsuario;
	
	@Column(name = "nomeTipoUsuario")
	private String nomeTipoUsuario;
			
	@OneToMany(mappedBy = "tipoUsuario")
	@JsonManagedReference
	private Set<Usuario> usuario;

	//Construtores
	public TipoUsuario() {
		
	}
	
	public TipoUsuario(Long idTipoUsuario, String nomeTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
		this.nomeTipoUsuario = nomeTipoUsuario;
	}

	//Getters and Setters
	public Long getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Long idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getNomeTipoUsuario() {
		return nomeTipoUsuario;
	}

	public void setNomeTipoUsuario(String nomeTipoUsuario) {
		this.nomeTipoUsuario = nomeTipoUsuario;
	}
}
