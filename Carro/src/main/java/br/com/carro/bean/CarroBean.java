package br.com.carro.bean;

import java.io.Serializable;
import java.util.ArrayList;
import br.com.carro.dao.CarroDAO;
import br.com.carro.domain.Carro;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CarroBean implements Serializable {
	private Carro carro;
	private ArrayList<Carro> carros;

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}

	public void novo() {
		try {
			carro = new Carro();

		} catch (RuntimeException erro) {
			erro.printStackTrace();
		}
	}

	public void salvar() {
		try {
			CarroDAO carroDAO = new CarroDAO();
			carroDAO.salvar(carro);

			carros = carroDAO.listar();

			carro = new Carro();
		} catch (RuntimeException erro) {
			erro.printStackTrace();

		}

	}

	@PostConstruct
	public void listar() {

		try {
			CarroDAO CarroDAO = new CarroDAO();
			carros = CarroDAO.listar();

		} catch (RuntimeException erro) {
			erro.printStackTrace();
		}
	}

}
