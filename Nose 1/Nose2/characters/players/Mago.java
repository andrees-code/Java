package characters.players;

import characters.Base;

public class Mago extends Base{
    public Mago (){
        super("Mago", 560, 68, 40);
    }

    @Override
    public void detalles(){
        System.out.println("Soy un " + getNombre() + " poderoso " + " Vida: " + getVida() + " Ataque: " + getAtaque() + " Defensa: " + getDefensa());
    }
}
