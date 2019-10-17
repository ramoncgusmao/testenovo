package com.estudar.questoes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Questao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	
    @ManyToOne
    @JoinColumn(name = "idProva")
	private Prova prova;
    
    @ManyToOne
    @JoinColumn(name = "idDisciplina")
	private Disciplina disciplina;
	private String texto1;
	private String texto2;
	private byte[] imagem;
	
}
