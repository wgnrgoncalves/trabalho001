package br.com.fiap.wagner.trabalho001.trabalho001.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Solicitacao implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	
	private String grupo;
	
	@NotBlank
	@NotNull
	private String descricao;
	
	@NotNull
	@Size(min=2, max=30)
	private String nome;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	

}