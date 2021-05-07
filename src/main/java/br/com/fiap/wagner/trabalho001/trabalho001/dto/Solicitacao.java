package br.com.fiap.wagner.trabalho001.trabalho001.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Solicitacao implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	
	
	private String grupo;
	
	@NotBlank
	@NotNull
	private String descricao;
	
	@NotBlank
	private String nome;
	
	/*
	 * @DateTimeFormat(pattern = "dd/MM/yyyy") private Date dt_retorno;
	 */
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
	/*
	 * public Date getDt_retorno() { return dt_retorno; } public void
	 * setDt_retorno(Date dt_retorno) { this.dt_retorno = dt_retorno; }
	 */
	

}