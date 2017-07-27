package com.everis.alicante.becajava07.course.juego.manager;

public class MasterMindMain {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a Master Mind");
		
		Integer numeroInicial = 15489;
		MasterMindManager masterMindManager = new MasterMindManager(numeroInicial);
		ConsultaNumeroResult result;
		
		do {
	            Integer numeroUsuario = 15489;
	            result = masterMindManager.consultaNumero(numeroUsuario);
	            System.out.println(result);
	        } while (!masterMindManager.haAcabado(result));

	        if (masterMindManager.haGanado(result)) {
	            System.out.println("Ha ganado");
	        } else {
	            System.out.println("Ha perdido");
	        }
	    }
	}