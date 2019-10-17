package com.estudar.questoes.domain;

public enum Prova {


	NATUREZA(1, "Ciências da Natureza e suas Tecnologias"),
	HUMANAS(2, "Ciências Humanas e suas Tecnologias"),
	LINGUAGENS(3, "Linguagens, Códigos e suas Tecnologias"),
	MATEMATICA(4, "Matemática e suas Tecnologias");
	
	private int id;
	private String descricao;
	
	private Prova(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getid() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Prova toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for(Prova x : Prova.values()) {
			if(id.equals(x.getid())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("id invalido: " + id);
	}
	
// Arrays.asList(Atributos.values()); - PARA utilizar uma lista de enum;
}
