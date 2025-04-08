package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long id_usuario;
	
	@Column(name = "nome_usuario", nullable = false, length = 100)
	private String nome_usuario;
	
	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;
	
	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;
	
	@Column(name = "senha", nullable = false, unique = true)
	private String senha;
	
	@Column(name = "telefone", nullable = false,  unique = false)
	private String telefone;
	
	@Column(name = "dt_nascimento", unique = false)
	private LocalDate dt_nascimento;

	@ManyToOne
	@JoinColumn(name = "tipo_usuario", nullable = false)
	private TipoUsuario tipo_usuario;
	
	
	// Construtores
	public Usuario() {

	}

	public Usuario(Long id_usuario, String nome_usuario, String cpf, String email, String senha, String telefone,
			LocalDate dt_nascimento, TipoUsuario tipo_usuario) {
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.dt_nascimento = dt_nascimento;
		this.tipo_usuario = tipo_usuario;
	}

	//Getters e setters
	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public TipoUsuario getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(TipoUsuario tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
		
}
