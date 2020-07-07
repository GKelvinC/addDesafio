package com.addDesafio.escola.models;

import java.io.Serializable;

public class Turma implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public int id;
	
	public String nome;

	public int capacidade;

	public Escola escola;

}
