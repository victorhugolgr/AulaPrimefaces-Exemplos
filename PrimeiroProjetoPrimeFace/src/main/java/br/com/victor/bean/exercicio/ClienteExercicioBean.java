package br.com.victor.bean.exercicio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.victor.model.ClienteExercicio;

@ManagedBean
@ViewScoped
public class ClienteExercicioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private ClienteExercicio cliente;
	private List<ClienteExercicio> listCliente;
	private ClienteExercicio clienteSelecionado;

	public ClienteExercicioBean() {
		listCliente = new ArrayList<>();
		cliente = new ClienteExercicio();
	}

	public void adicionaCliente() {
		listCliente.add(cliente);
		cliente = new ClienteExercicio();
	}

	public void removerCliente() {
		listCliente.remove(clienteSelecionado);
	}

	public ClienteExercicio getCliente() {
		return cliente;
	}

	public void setCliente(ClienteExercicio cliente) {
		this.cliente = cliente;
	}

	public List<ClienteExercicio> getListCliente() {
		return listCliente;
	}

	public void setListCliente(List<ClienteExercicio> listCliente) {
		this.listCliente = listCliente;
	}

	public ClienteExercicio getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(ClienteExercicio clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

}
