package characters.enemies;

import characters.Base;

public class Gargola extends Base{
    public Gargola () {
        super("Gargola", 214, 34, 20);
    }

    @Override
    public void detalles(){
        System.out.println("¡GROAR! " + getNombre() + " con " + getVida() + " de vida " + getAtaque() + " de ataque " + getDefensa() + " de defensa");
    }
}
