package juego_de_la_oca;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String nomJ1, nomJ2; //Nombres de los jugadores. *Se piden al usuario.
		int tirada1, tirada2; //Valores de tirada de los jugadores
		Scanner sc = new Scanner(System.in);
		Funciones ganador = new Funciones();
		Funciones ventaja = new Funciones();
		
		//INTRODUCCIÓN
		System.out.println("BIENVENIDO A LA CARRERA DEL SIGLO!");
		//Se eligen el minimo y el maximo de los dados.
		System.out.println("Cual es el numero minimo del dado?");
		Funciones.minDado = sc.nextInt();
		System.out.println("Cual es el numero maximo del dado?");
		Funciones.maxDado = sc.nextInt();
		//Se piden los nombres de los dos jugadores.
		System.out.println("Cual es el nombre del jugador 1?");
		nomJ1 = sc.next();
		System.out.println("Cual es el nombre del jugador 2?");
		nomJ2 = sc.next();
		while(nomJ1 == nomJ2) { //Se comprueba que los dos nombres no sean iguales.
			System.out.println("Los dos jugadores no se pueden llamar igual.");
			System.out.println("Cual es el nombre del jugador 1?");
			nomJ1 = sc.next();
			System.out.println("Cual es el nombre del jugador 2?");
			nomJ2 = sc.next();
		} 
		
		//EMPIEZA EL JUEGO
		System.out.print("\n\nCOMENCEMOS A JUGAR!\n");
		
		//Juega el primer jugador.
		tirada1 = Funciones.tiraDados(Funciones.minDado, Funciones.maxDado); //Tirada de primer dado
		System.out.println("Ha sacado un " + tirada1 + " en la primera tirada.");
		tirada2 = Funciones.tiraDados(Funciones.minDado, Funciones.maxDado); //Tirada de segundo dado
		System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada.");
		if(Funciones.sumaDeNumerosEsPrimo(tirada1, tirada2) == true) {
			Funciones.fichaJ1 = tirada1 + tirada2;
			System.out.println("TIRADA VALIDA!");
		} else {
			System.out.println("TIRADA NO VALIDA!");
		}
		Funciones.pintaPista(Funciones.fichaJ1, Funciones.fichaJ2);
		System.out.println("\nPresiona cualquier tecla para la siguiente ronda.");
		String f = sc.next();
		System.out.println();
		
		//Juega el segundo jugador.
		tirada1 = Funciones.tiraDados(Funciones.minDado, Funciones.maxDado); //Tirada de primer dado
		System.out.println("Ha sacado un " + tirada1 + " en la primera tirada.");
		tirada2 = Funciones.tiraDados(Funciones.minDado, Funciones.maxDado); //Tirada de segundo dado
		System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada.");
		if(Funciones.sumaDeNumerosEsPrimo(tirada1, tirada2) == true) {
			Funciones.fichaJ2 = tirada1 + tirada2;
			System.out.println("TIRADA VALIDA!");
		} else {
			System.out.println("TIRADA NO VALIDA!\nNo suma puntos ya que la suma de los dos numeros NO ES PRIMO.");
		}
		Funciones.pintaPista(Funciones.fichaJ1, Funciones.fichaJ2);
		System.out.println("\nPresiona cualquier tecla para la siguiente ronda.");
		f = sc.next();
		
		while(Funciones.fichaJ1 < 11 && Funciones.fichaJ2 < 11) {
			//Juega el primer jugador.
			tirada1 = Funciones.tiraDados(Funciones.minDado, Funciones.maxDado); //Tirada de primer dado
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada.");
			tirada2 = Funciones.tiraDados(Funciones.minDado, Funciones.maxDado); //Tirada de segundo dado
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada.");
			if(Funciones.sumaDeNumerosEsPrimo(tirada1, tirada2) == true) {
				Funciones.fichaJ1 = tirada1 + tirada2;
				System.out.println("TIRADA VALIDA!");
			} else {
				System.out.println("TIRADA NO VALIDA!");
			}
			Funciones.pintaPista(Funciones.fichaJ1, Funciones.fichaJ2);
			System.out.println();
			ventaja.imprimeComoVaLaCarrera(nomJ1, nomJ2);
			System.out.println("\nPresiona cualquier tecla para la siguiente ronda.");
			f = sc.next();
			System.out.println();
			
			//Juega el segundo jugador.
			tirada1 = Funciones.tiraDados(Funciones.minDado, Funciones.maxDado); //Tirada de primer dado
			System.out.println("Ha sacado un " + tirada1 + " en la primera tirada.");
			tirada2 = Funciones.tiraDados(Funciones.minDado, Funciones.maxDado); //Tirada de segundo dado
			System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada.");
			if(Funciones.sumaDeNumerosEsPrimo(tirada1, tirada2) == true) {
				Funciones.fichaJ2 = tirada1 + tirada2;
				System.out.println("TIRADA VALIDA!");
			} else {
				System.out.println("TIRADA NO VALIDA!\nNo suma puntos ya que la suma de los dos numeros NO ES PRIMO.");
			}
			Funciones.pintaPista(Funciones.fichaJ1, Funciones.fichaJ2);
			System.out.println();
			ventaja.imprimeComoVaLaCarrera(nomJ1, nomJ2);
			System.out.println("\nPresiona cualquier tecla para la siguiente ronda.");
			f = sc.next();
		}
		ganador.esGanador(nomJ1, nomJ2);
		sc.close();
	}
}
