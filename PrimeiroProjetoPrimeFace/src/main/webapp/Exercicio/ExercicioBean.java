package Exercicio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.victor.model.FormaPagamento;
import br.com.victor.model.MetodoPagamento;

@ManagedBean
@ViewScoped
public class ExercicioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String razaoSocial;
	private String cnpj;
	private String cidadeContrato;
	private String modalidade;
	private Date dataContrato;
	private double valorContrato;
	private MetodoPagamento metodoPagamento;
	private FormaPagamento formaPagamento;
	private List<String> cursosContratados;

	private List<String> cidades = new ArrayList<>();

	public List<MetodoPagamento> metodosPagamento = new ArrayList<>();

	public ExercicioBean() {
		cidades.add("Belém");
		cidades.add("Marituba");
		cidades.add("Ananindeua");
		cidades.add("Castanhal");
		cidades.add("Benevides");
		cidades.add("Murinin");

		MetodoPagamento mp1 = new MetodoPagamento("Cartão de Crédito");
		mp1.adicionarFormaPamento("À vista").adicionarFormaPamento("1x").adicionarFormaPamento("2x")
				.adicionarFormaPamento("6x");

		MetodoPagamento mp2 = new MetodoPagamento("Cheque");
		mp2.adicionarFormaPamento("À vista").adicionarFormaPamento("Entrada + 30 dias");

		MetodoPagamento mp3 = new MetodoPagamento("Boleto");
		mp3.adicionarFormaPamento("À vista");

		metodosPagamento.add(mp1);
		metodosPagamento.add(mp2);
		metodosPagamento.add(mp3);
	}

	public void cadastrar() {

		System.out.println("Razão Social: " + this.razaoSocial);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Cidade Contrato: " + this.cidadeContrato);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Data Contrato: " + dateFormat.format(this.dataContrato));
		System.out.println("Valor Contrato: " + this.valorContrato);
		System.out.println("Método de Pagamento: " + this.metodoPagamento);
		System.out.println("Forma de Pagamento: " + this.formaPagamento);
		System.out.println("Cursos Contratados: ");
		cursosContratados.forEach(System.out::println);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado com sucesso!"));
	}

	public List<String> autoCompleteCidade(String consulta) {
		System.out.println(consulta);
		return cidades.stream().filter(s -> s.toLowerCase().startsWith(consulta)).collect(Collectors.toList());
	}
	
	//Teste	
	public void carregaFormaPagamento(){
		for (FormaPagamento formaPagamento : metodoPagamento.getFormasPagamento()) {
			System.out.println(formaPagamento.getFormaPagamento());
		}
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCidadeContrato() {
		return cidadeContrato;
	}

	public void setCidadeContrato(String cidadeContrato) {
		this.cidadeContrato = cidadeContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<String> getCursosContratados() {
		return cursosContratados;
	}

	public void setCursosContratados(List<String> cursosContratados) {
		this.cursosContratados = cursosContratados;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public List<MetodoPagamento> getMetodosPagamento() {
		return metodosPagamento;
	}
}
