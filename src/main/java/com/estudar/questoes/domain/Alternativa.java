package com.estudar.questoes.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Alternativa {

	@Id
	private int id;
	private byte[] imagem;
	private String texto;
	private boolean correta;
}
