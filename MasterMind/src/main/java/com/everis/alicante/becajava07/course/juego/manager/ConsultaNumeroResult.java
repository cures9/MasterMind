package com.everis.alicante.becajava07.course.juego.manager;

public class ConsultaNumeroResult {
	
	private int negras;
	private int blancas;
	
	public ConsultaNumeroResult(int negras, int blancas) {
		super();
		this.negras = negras;
		this.blancas = blancas;
	}
	
	public int getNegras() {
		return negras;
	}
	
	@Override
	public String toString() {
		return "ConsultaNumeroResult [negras=" + negras + ", blancas=" + blancas + "]";
	}
}