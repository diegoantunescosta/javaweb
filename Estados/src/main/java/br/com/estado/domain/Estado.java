package br.com.estado.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity 
public class Estado extends GenericDomain {

	@Column(length = 20, nullable = false) 
	private String nome;

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
