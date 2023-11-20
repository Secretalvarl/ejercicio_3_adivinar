package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz
	    {
	        public void adivinarNumero()
	      {
	        Scanner sc = new Scanner(System.in);
	        int numeroVoleo = (int)(Math.random() * 100) + 1;
	        int intentos = 10;
	        int intentoActual = 0;
	        boolean acertado = false;

	        System.out.println("Intenta adivinar el numero aleatorio (entre 1 y 100)");
	        System.out.println("Tienes 10 intentos para adivinar el numero.");

	        while (intentoActual < intentos)
	        {
	            System.out.print("Introduce tu número: ");
	            int numeroUsuario = sc.nextInt();
	            intentoActual++;

	            if (numeroUsuario == numeroVoleo)
	            {
	                acertado = true;
	                break;
	            }
	            else if (numeroUsuario < numeroVoleo)
	            {
	                System.out.println("El número a adivinar es mayor. Intentos restantes: " + (intentos - intentoActual));
	            }
	            else
	            {
	                System.out.println("El número a adivinar es menor. Intentos restantes: " + (intentos - intentoActual));
	            }
	        }

	        if (acertado)
	        {
	            System.out.println("Has adivinado el número en " + intentoActual + " intentos.");
	        }
	        else
	        {
	            System.out.println("No tienes mas intentos. El número era: " + numeroVoleo);
	        }

	        sc.close();
	    }
	  }

