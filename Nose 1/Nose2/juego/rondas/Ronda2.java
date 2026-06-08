package juego.rondas;

import characters.Base;
import characters.enemies.Gargola;
import combate.Combate;
import menu.Menu;

public class Ronda2 {
    Gargola enemigo1 = new Gargola();
    
    public void Combate(Base personaje){
        System.out.println("Estamos en las rondas");
        if(personaje != null){
            Combate combate = new Combate();
            combate.iniciarCombate(personaje, enemigo1);
        } else {
            System.out.println("No hay personaje elegido");
            Menu menu = new Menu();
            menu.Inicio();
        }
        
    }
}
