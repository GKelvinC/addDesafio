package com.addDesafio.escola.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public int id;
	
	public String nome;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	public LocalDateTime dataDeNascimento;

	public Turma turma;

	
}
