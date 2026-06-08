package combate;

import java.util.Scanner;

import characters.Base;
import menu.Menu;

public class Combate {
    
    public void iniciarCombate(Base persona, Base enemigo){
        boolean stillAlive = true;
        Scanner sc = new Scanner(System.in);
        while (stillAlive) {
            if (persona.getVida() > 0) {
                System.out.println("1. atacar ");
                int opcion = sc.nextInt();
                if (opcion == 1){
                    enemigo.recibirDaño(persona.getAtaque(), enemigo.getDefensa());
                    
                    if (enemigo.getVida() <= 0) {
                        System.out.println("Has ganado");
                        stillAlive = false;
                    } else {
                       persona.recibirDaño(enemigo.getAtaque(), persona.getDefensa());
                        persona.detalles(); 
                        enemigo.detalles();
                    }
                } else {
                    System.out.println("Introduzca una opcion válida.");
                }
            } else {
                System.out.println();
                System.out.println("Has muerto...");
                System.out.println("Quieres volver a empezar?");
                System.out.println("------------------");
                System.out.println("1. Si ");
                System.out.println("2. No ");
                System.out.println("------------------");
                System.out.println();
                int opcion = sc.nextInt();
                if (opcion == 1){
                    stillAlive = false;
                    Menu menu = new Menu();
                    menu.Inicio();
                } else if (opcion == 2 ){
                    System.out.println("Esperamos verle pronto");
                    System.exit(0);
                }
            }
        }
    }
}
