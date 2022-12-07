package juego_de_la_oca;
import java.util.*;

public class Funciones {
	static int fichaJ1, fichaJ2; //Para el tabulador
	static int minDado, maxDado; //Numero minimo y maximo. *Se piden al usuario.
	
	static int tiraDados(int minDado, int maxDado){ //Función para la tirada de dados.
		int num = (int)(Math.random() * (maxDado - minDado + 1) + minDado); //Math.random usada con maximo y minimo.
		return num; //Se devuelve el valor entero de esta variable.
	}
	
	static int pintaPista(int fichaJ1, int fichaJ2){ //Función que imprime posiciones en el tabulador.
		final int TAMCIRCUITO = 11; //Numero de casillas
		for(int i = 0; i <= TAMCIRCUITO ; i++) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
		//fichaJ1
		for(int i = 0; i < fichaJ1; i++) {
			System.out.print("\t");
		}
		System.out.print("J1");
		System.out.print("\n");
		//fichaJ2
		for(int i = 0; i < fichaJ2; i++) {
			System.out.print("\t");
		}
		System.out.print("J2");
		return 0;
	}
	
	static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) { //Suma los numeros si son primos.
		tirada1 = tiraDados(minDado, maxDado);
		tirada2 = tiraDados(minDado, maxDado);
		boolean prime = false;
		if (tirada1 % 2 == 1 && tirada2 % 2 == 1) {
			prime = true;
		}
		return prime;
	}
	
	String imprimeComoVaLaCarrera(String nomJ1, String nomJ2) { //Actualiza el progreso de la partida.
		String ventaja = null;
		if (fichaJ1 > fichaJ2) {
			ventaja = nomJ1;
			System.out.println(nomJ1 + " tiene la ventaja!");
		} else if (fichaJ2 > fichaJ1) {
			ventaja = nomJ1;
			System.out.println(nomJ2 + " tiene la ventaja!");
		} else if (fichaJ1 == fichaJ2) {
			ventaja = " ";
			System.out.println(nomJ1 + " y " + nomJ2 + " están empatados!");
		}
		return ventaja;
	}
	
	String esGanador(String nomJ1, String nomJ2) { //Indica el jugador ganador al final de la partida. *El valor final se imprime desde el main mediante el return.
		String ganador = null;
		if (fichaJ1 > fichaJ2) {
			ganador = nomJ1;
			System.out.println("Ha ganado " + nomJ1 + "!!!");
		} else if (fichaJ2 > fichaJ1) {
			ganador = nomJ1;
			System.out.println("Ha ganado " + nomJ2 + "!!!");
		} else if (fichaJ1 == fichaJ2) {
			ganador = " ";
			System.out.println(nomJ1 + " y " + nomJ2 + " han empatado!");
		}
		return ganador;
	}
}