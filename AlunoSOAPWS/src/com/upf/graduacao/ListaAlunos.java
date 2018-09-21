package com.upf.graduacao;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaAlunos {
	
	@XmlElement(name="aluno")
	private List<Aluno> alunos;
	
	public ListaAlunos(List<Aluno> aluno){
		this.alunos = aluno;
	}
	
	//JAX-B
	public ListaAlunos(){}

}
