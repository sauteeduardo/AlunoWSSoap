package com.upf.graduacao;

import javax.xml.bind.annotation.XmlRootElement;

//JERSEY - implementação - JAX-RS
//BINDING java <-> xml

@XmlRootElement
public class Aluno {
		
	//ATRIBUTOS PRIVADOS
	private Integer id;
	private String aluno;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	
	
	
	public Aluno() {
	}
	public Aluno(Integer id, String aluno, Double nota1, Double nota2, Double nota3) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

}
