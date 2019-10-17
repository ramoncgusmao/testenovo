package com.estudar.questoes.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Resposta {

	@Id
	private int id;
	
    @ManyToOne
    @JoinColumn(name = "idQuestao")
	private Questao questao;
    
    @ManyToOne
    @JoinColumn(name = "idAlternativa")
	private Alternativa alternativa;
    
    @ManyToOne
    @JoinColumn(name = "idUser")
	private User usuario;
    
	private boolean correta;
	private Date data;
}
