package com.addDesafio.escola.resources;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addDesafio.escola.models.Aluno;
import com.addDesafio.escola.models.Endereco;
import com.addDesafio.escola.models.Escola;
import com.addDesafio.escola.models.Turma;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")
public class AlunoResource {
	
	
	@GetMapping("/alunos")
	public List<Aluno> listaAlunos(){
		
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		
		Endereco enderecoEscola = new Endereco();
		enderecoEscola.bairro = "Raul Veiga";
		enderecoEscola.cidade = "São Gonçalo";
		enderecoEscola.complemento = "lt 08 quadra h";
		enderecoEscola.estado = "Rio de Janeiro";
		enderecoEscola.logradouro = "Rua";
		
		Escola escola = new Escola();
		escola.endereco = enderecoEscola;
		escola.id = 1;
		escola.nome = "Nilo Peçanha";
		
		Turma turma = new Turma();
		turma.id = 1;
		turma.nome = "3001";
		turma.capacidade = 35;
		turma.escola = escola;	
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		
		aluno1.id = 1;
		aluno1.nome = "Kelvin Gonçalves";
		aluno1.dataDeNascimento = LocalDateTime.of(1997, 07, 22, 10, 15, 30);
		aluno1.turma = turma;
		listaDeAlunos.add(aluno1);
		

		aluno2.id = 2;
		aluno2.nome = "Luiz Fernando";
		aluno2.dataDeNascimento = LocalDateTime.of(1996, 05, 11, 9, 15, 10);
		aluno2.turma = turma;
		listaDeAlunos.add(aluno2);
		
		
		aluno3.id = 3;
		aluno3.nome = "Maria Eliza";
		aluno3.dataDeNascimento = LocalDateTime.of(1996, 02, 5, 2, 1, 3);
		aluno3.turma = turma;
		listaDeAlunos.add(aluno3);
		
		
		aluno4.id = 4;
		aluno4.nome = "Roberta Magalhães";
		aluno4.dataDeNascimento = LocalDateTime.of(1995, 05, 15, 6, 3, 1);
		aluno4.turma = turma;
		listaDeAlunos.add(aluno4);
		
		return listaDeAlunos;
		
		
	}
}
