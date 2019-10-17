package com.estudar.questoes.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	private int id;
	private String email;
	
	private Date nascimento;
}
