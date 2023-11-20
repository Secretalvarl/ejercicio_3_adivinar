package Controladores;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class Inicio 
{
	 public static void main(String[] args)
	 {
		 MenuInterfaz alpha = new MenuImplementacion();
	     alpha.adivinarNumero();
	 }
}
