package org.park;

import java.util.LinkedList;
import java.util.List;

public class Modelo {

	private List<Tenis> tenisList = new LinkedList<Tenis>();
	
	public Modelo() {
		addTenis(new Tenis("1", new Identificacao("Nike97", "Nike", "40","1400")));
		addTenis(new Tenis("2", new Identificacao("Yeezy", "Adidas", "39","800")));
		addTenis(new Tenis("3", new Identificacao("Mizuno15", "Mizuno", "41","1200")));
		addTenis(new Tenis("4", new Identificacao("Disruptor", "Fila", "35","1200")));
		addTenis(new Tenis("5", new Identificacao("Jupter", "Umbro", "34","400")));
	}
	
	public void addTenis(Tenis ten) {
		tenisList.add(ten);
	}
	
	public Tenis buscarcod(String cod){
		for(Tenis t:tenisList){
			if(t.getCodigo().equals(cod)) return t;
		}
		
		return null;
	}
	
	public List<Tenis> buscarIdentificacao(Identificacao iden){
		List<Tenis> tenisEncontrados = new LinkedList<Tenis>();
		
		for(Tenis t:tenisList){
			 if(iden.comp(t.getIdent())) tenisEncontrados.add(t);
		}
		
		return tenisEncontrados;
		
	}
	
	
}
