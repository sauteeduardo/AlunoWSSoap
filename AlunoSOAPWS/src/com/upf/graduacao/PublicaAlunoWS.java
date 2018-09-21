package com.upf.graduacao;
import javax.xml.ws.Endpoint;


public class PublicaAlunoWS {

	public static void main(String[] args) {
		AlunoWS webService = new AlunoWS();
		String url = "http://localhost:8080/alunows";
		
		Endpoint.publish(url, webService);
		
		System.out.println("WS rodando..");
	}

}
