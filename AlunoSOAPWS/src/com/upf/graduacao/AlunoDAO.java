package com.upf.graduacao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;



public class AlunoDAO {
	
	//mapeia uma chave a um valor
	private static Map<String, Aluno> ITENS_DB = 
			new LinkedHashMap<String, Aluno>();
	
	static {
		ITENS_DB.put("Joao",
				new Aluno(1, "Joao", 5.0, 5.0,5.0));
		ITENS_DB.put("MARIA",
				new Aluno(2, "Maria", 5.0, 5.0,5.0));
	}
	
	public ArrayList<Aluno> todosAlunos(){
		return new ArrayList<Aluno>(ITENS_DB.values());
	}
	
	public String resultado(Integer id){
		Collection<Aluno> alunos = ITENS_DB.values();
		Iterator<Aluno> iterator = alunos.iterator();
		
		while (iterator.hasNext()){
			Aluno aluno = iterator.next();
			
			if (aluno.getAluno().contains(id.toString())){
				Double soma;
				soma = aluno.getNota1() +
						aluno.getNota2()+
						aluno.getNota3();
				soma = soma/3;
				if(soma < 3.0) {
					return "Reprovado";
				}else if(soma > 3.0 && soma < 7.0) {
					return "Em exame";
				}else{
					return "Aprovado";
				}
			}
			
		}
		
		return null;
	}
	
	public Double verificaMediaFinal(Integer id){
		Collection<Aluno> alunos = ITENS_DB.values();
		Iterator<Aluno> iterator = alunos.iterator();
		
		while (iterator.hasNext()){
			Aluno aluno = iterator.next();
			
			if (aluno.getAluno().contains(id.toString())){
				Double soma;
				soma = aluno.getNota1() +
						aluno.getNota2()+
						aluno.getNota3();
				soma = soma/3;
				return soma;
			}
		}
		return null;
	}
	
	public Aluno findAluno(Integer id){
		Collection<Aluno> alunos = ITENS_DB.values();
		Iterator<Aluno> iterator = alunos.iterator();
		
		while (iterator.hasNext()){
			Aluno aluno = iterator.next();
			
			if (aluno.getAluno().contains(id.toString())){
				return aluno;
			}
		}
		return null;
	}

	public String deletaAluno(Integer codigo) {
		if (ITENS_DB.containsKey(codigo)){
			ITENS_DB.remove(codigo);
			return "Aluno removido com sucesso!";
		} else {
			return "Aluno inexistente!";
		}
	}

	public String alteraAluno(Aluno aluno) {
		if (ITENS_DB.containsKey(aluno.getId())){
			ITENS_DB.replace(aluno.getId().toString(), aluno);
			return "Aluno atualizado com sucesso!";
		} else {
			return "getId inexistente!";
		}
	}

	public String adicionaAluno(Aluno aluno) {
		ITENS_DB.put(aluno.getId().toString(), aluno);
		return "Inserido com sucesso!";
	}

}
