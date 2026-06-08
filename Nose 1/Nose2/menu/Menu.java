package menu;

import java.util.Scanner;

import characters.Base;
import characters.players.Mago;
import juego.Juego;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void Inicio(){
        System.out.println();
        System.out.println("Bienvenido Jugador");
        System.out.println("------------------");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        System.out.println("------------------");
        System.out.println();

        int opcion = sc.nextInt();

        if (opcion == 1) {
            SeleccionPersonaje();
        } else if (opcion == 2) {
            System.out.println("Adios");
            System.exit(0);
        } else {
            System.out.println("Introduzca una opción válida");
            Inicio();
        }
    }

    public void SeleccionPersonaje () {

        System.out.println();
        System.out.println("Selecciona un personaje");
        System.out.println("------------------");
        System.out.println("1. Mago ");
        System.out.println("2. Volver ");
        System.out.println("------------------");
        System.out.println();

        int opcion = sc.nextInt();

        if (opcion == 1){
            Mago mago = new Mago();
            mago.detalles();
            jugar(mago);
            
        } else if (opcion == 2){
            Inicio();
        } else {
            System.out.println("Introduzca una opción válida");
            SeleccionPersonaje();
        }
    }


    public void jugar(Base personaje){
        Juego juego = new Juego();
        juego.Empezamos(personaje);
    }
}
