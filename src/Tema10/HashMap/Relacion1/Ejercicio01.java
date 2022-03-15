package Tema10.HashMap.Relacion1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variables
		int intentos = 0;
		boolean acierto= false;
		String usuario;
		String pass;
		
		// Declaro el HashMap
		HashMap<String, String> login = new HashMap<String, String>();
		
		login.put("IvanSM", "pass012");
		
		
		
		do {
			System.out.print("Introduzca usuario: ");
			usuario = scan.next();
			System.out.print("Introduzca contraseña: ");
			pass = scan.next();
			
			if(login.containsKey(usuario) && login.containsKey(pass)) {			
					acierto = true;
					System.out.println("Ha accedido al area restringida");
			}else{
					intentos ++;
					System.out.println("Lo siento, no tiene acceso al area restringida");
				}
			}
					
		}while(intentos==3&&!acierto);

}

}
