package br.com.estado.bean;
import java.io.Serializable;
import java.util.ArrayList;




import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import br.com.estado.dao.EstadoDAO;
import br.com.estado.domain.Estado;



@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable {
	private Estado estado;
	private ArrayList<Estado> estados;

	public Estado getEstado() {
		return estado;
	}

	public void setEstados(Estado estado) {
		this.estado = estado;
	}

	public ArrayList<Estado> getEstados() {
		return estados;
	}

	public void setEstados(ArrayList<Estado> estados) {
		this.estados = estados;
	}

	


	public void novo() {
		try {
			estado = new Estado();

		} catch (RuntimeException erro) {
			erro.printStackTrace();
		}
	}

	public void salvar() {
		try {
			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.salvar(estado);

			estados = estadoDAO.listar();

			estado = new Estado();
		} catch (RuntimeException erro) {
			erro.printStackTrace();

		}

	}

	@PostConstruct
	public void listar() {

		try {
			EstadoDAO EstadoDAO = new EstadoDAO();
			estados = EstadoDAO.listar();

		} catch (RuntimeException erro) {
			erro.printStackTrace();
		}
	}
	
	 public void excluir(ActionEvent evento) {
		try {
			estado = (Estado) evento.getComponent().getAttributes().get("estadoSelecionado");
			
			EstadoDAO estadoDAO = new EstadoDAO();
			estadoDAO.excluir(estado);
			
			estados = estadoDAO.listar();
			
		}catch(RuntimeException erro){
			erro.printStackTrace();
		}
		
	 }
		
		public void editar(ActionEvent evento) {
			try {
				estado = (Estado) evento.getComponent().getAttributes().get("estadoSelecionado");
								
			}catch(RuntimeException erro){
				erro.printStackTrace();
			}
			
		
		
		
		
	}
	
	
	
	
}
