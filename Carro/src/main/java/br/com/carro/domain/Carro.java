package br.com.carro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity // Entity quer dizer que a classe pessoa vai ser uma entidade no banco de dados,
		// ou seja, uma tabela
public class Carro extends GenericDomain {

	@Column(length = 20, nullable = false) // Column está dizendo que vai ser uma coluna, length é o tamanho e
	private String modelo;

	@Column(length = 20, nullable = false)
	private String cor;

	@Column(length = 4)
	private int ano;

	@Column(length = 20)
	private String marca;

	@Column(length = 30)
	private String chassi;

	@Column(length = 50)
	private String proprietario;

	@Column(length = 2)
	private int numPortas;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

}
