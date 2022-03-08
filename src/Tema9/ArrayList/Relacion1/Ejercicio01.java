package Tema9.ArrayList.Relacion1;

import java.util.ArrayList;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Declaro el arrayList
		ArrayList<String> companieros = new ArrayList<String>();
		
		companieros.add("Mario");
		companieros.add("Alex");
		companieros.add("Rocio");
		companieros.add("Antonio");
		companieros.add("Maite");
		companieros.add("Ivan");
		
		//Recorremos el arrayList
		for(int i = 0; i < companieros.size(); i++) {
			System.out.println(companieros.get(i));
		}
	}

}
