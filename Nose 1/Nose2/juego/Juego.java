package juego;

import characters.Base;
import juego.rondas.Ronda1;
import juego.rondas.Ronda2;

public class Juego {
    public void Empezamos(Base personaje){
        System.out.println("Estamos en el juego");
        Ronda1 ronda1 = new Ronda1();
        ronda1.Combate(personaje);
        Ronda2 ronda2 = new Ronda2();
        ronda2.Com
    };
    
}
