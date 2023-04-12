package org.park;

public class Tenis {
	
	private String codigo;
	private Identificacao ident;

	public Tenis(String codigo, Identificacao ident) {
		super();
		this.codigo = codigo;
		this.ident = ident;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Identificacao getIdent() {
		return ident;
	}
	public void setIdent(Identificacao ident) {
		this.ident = ident;
	}
	
}
