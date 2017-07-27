package com.everis.alicante.becajava07.course.juego.manager;

import java.util.ArrayList;
import java.util.List;

public class MasterMindManager {

	private Integer numeroInicial;
	private List<Integer> numeroIntentos = new ArrayList<Integer>();
	private int numeroDeIntentosRestantes;

	public MasterMindManager(final Integer numeroInicial) {
		super();
        this.numeroInicial = numeroInicial;
        this.numeroDeIntentosRestantes = 10;
    }
	public ConsultaNumeroResult consultaNumero(final Integer numero) {
        if (this.isNumeroValido(numero)) {
            this.numeroIntentos.add(numero);
            this.numeroDeIntentosRestantes--;
            int blancas = 0;
            int negras = 0;

            String numeroIni = String.valueOf(numeroInicial);
            String[] division = numeroIni.split("");
            String numeroNum = String.valueOf(numero);
            String[] division2 = numeroNum.split("");
            
            for (int i = 0; i < division.length; i++) {
				for (int j = 0; j < division2.length; j++) {
					if(division[i].equals(division2[j])) {
						if (i==j) {
								negras++;
							}else {
								blancas++;
						}
					}
				}
			}
             return new ConsultaNumeroResult(negras, blancas);
        }
        return null;
    }

    public boolean haAcabado(final ConsultaNumeroResult consultaNumeroResult) {
        return this.numeroDeIntentosRestantes <= 0 || this.haGanado(consultaNumeroResult);
    }

    public boolean haGanado(final ConsultaNumeroResult consultaNumeroResult) {
        return consultaNumeroResult.getNegras() == 5;
    }

    private Boolean isNumeroValido(final Integer numero) {
        return numero >= 0 && numero <= 99999;
    }
}
