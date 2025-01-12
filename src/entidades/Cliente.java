package entidades;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Pessoa{
	private String cpf;
	private String bairro;
	private String rua;
	private String cep;
	private String numero;

	public Cliente() {}
	
	public Cliente(Integer id, String nome, String email, LocalDate dataDeNascimento, String senha, String cpf, String bairro, String rua, String cep, String numero) {
		super(id, nome, email, dataDeNascimento, senha);
		this.cpf = cpf;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Double efetuarPagamento(double totalPedido) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println(Cores.TEXT_YELLOW + "\tPor gentileza, efetue o pagamento de R$ " + Cores.TEXT_RESET + Cores.TEXT_CYAN + String.format("%.2f", totalPedido) + Cores.TEXT_RESET);
		System.out.print(Cores.TEXT_YELLOW  + "\tDigite o valor exato total a pagar: " + Cores.TEXT_RESET);
		double pagamento = ler.nextDouble();
	
		while (pagamento < totalPedido) {
			System.out.println(Cores.TEXT_RED + "\n\tValor inferior ao total\n" + Cores.TEXT_RESET);
			System.out.print(Cores.TEXT_YELLOW  + "\tDigite corretamente o valor do pagamento: " + Cores.TEXT_RESET);
			pagamento = ler.nextDouble();
		}
		return pagamento;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append("\tNome do cliente: ");
	    sb.append(this.getNome());
	return sb.toString();
	}
}