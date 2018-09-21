package com.upf.graduacao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService
public class AlunoWS {
	
	private AlunoDAO dao = new AlunoDAO();
	
	@WebMethod(operationName="listaTodosOsAlunos")
	@WebResult(name="Alunos")
	public ListaAlunos getAlunos(){
		return new ListaAlunos(dao.todosAlunos());
	}
	
	@WebMethod(operationName="procuraAluno")
	public Aluno findItem(
			@WebParam(name="id") Integer id){
		return dao.findAluno(id);
	}
	
	@WebMethod(operationName="verificaMediaFinal")
	public Double verificaMediaFinal(
			@WebParam(name="id") Integer id){
		return dao.verificaMediaFinal(id);
	}
	
	@WebMethod(operationName="resultado")
	public String resultado(
			@WebParam(name="id") Integer id){
		return dao.resultado(id);
	}
	
	@WebMethod(operationName = "deletaUmAluno")
	@WebResult(name="resultado")
	public String deletaItem(
			@WebParam(name="codigo") Integer codigo){
		return dao.deletaAluno(codigo);
	}
	
	//JAX-B
	@WebMethod(operationName="alteraAluno")
	@WebResult(name="resultado")
	public String alteraAluno(
			@WebParam(name="aluno") Aluno aluno){
		return dao.alteraAluno(aluno);
	}
	
	@WebMethod(operationName="adicionaAluno")
	@WebResult(name="resultado")
	public String cadastraAluno(
			@WebParam(name="aluno") Aluno aluno){
		return dao.adicionaAluno(aluno);
	}

}
