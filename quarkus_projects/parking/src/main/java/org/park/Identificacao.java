package org.park;

public class Identificacao {

	private String nome;
	private String marca;
	private String tamanho;
	private String valor;
	
	public Identificacao(String nome, String marca, String tamanho, String valor) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.tamanho = tamanho;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean comp (Identificacao ident) {
		if (nome.equals(ident.nome) && marca.equals(ident.marca) && tamanho.equals(ident.tamanho) && valor.equals(ident.valor)) {
			return true;
		}
		else{
			return false;
		}
		
	}
	
}
