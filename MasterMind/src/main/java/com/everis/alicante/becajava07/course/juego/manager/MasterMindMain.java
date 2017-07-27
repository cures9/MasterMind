package com.everis.alicante.becajava07.course.juego.manager;

import mingorance.enrique.commandlinemenu.Menu;
import mingorance.enrique.commandlinemenu.MenuBuilder;

public class MasterMindMain {

	public static void main(String[] args) {
//		
//		System.out.println("Bienvenido a Master Mind");
//		
//		Integer numeroInicial = 15489;
//		MasterMindManager masterMindManager = new MasterMindManager(numeroInicial);
//		ConsultaNumeroResult result;
//		
//		do {
//	            Integer numeroUsuario = 15489;
//	            result = masterMindManager.consultaNumero(numeroUsuario);
//	            System.out.println(result);
//	        } while (!masterMindManager.haAcabado(result));
//
//	        if (masterMindManager.haGanado(result)) {
//	            System.out.println("Ha ganado");
//	        } else {
//	            System.out.println("Ha perdido");
//	        }
//	    }
//	}

Menu subMenu1 = MenuBuilder.createSubMenu("Menu Secundario 1", 1)
.addSimpleOption(1, "Opcion 1")
.addSimpleOption(2, "Opcion 2")
.addSimpleOption(3, "Opcion 3")
.addSimpleOption(4, "Opcion 4")
.addExitOption(0, "SalirS1")
.build();

Menu subMenu2 = MenuBuilder.createSubMenu("Menu Secundario 2", 2)
.addSimpleOption(1, "Opcion 1")
.addSimpleOption(2, "Opcion 2")
.addSimpleOption(3, "Opcion 3")
.addSimpleOption(4, "Opcion 4")
.addExitOption(0, "SalirS2")
.build();


Menu mainMenu = MenuBuilder.createMainMenu("Menu Principal")
.addSubMenuOption("Submenu 1", subMenu1)
.addSubMenuOption("Submenu 2", subMenu2)
.addExitOption(0, "Salir")
.build();

System.out.println(mainMenu.play());

}
}