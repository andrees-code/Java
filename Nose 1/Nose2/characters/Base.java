package characters;

public class Base {
    String nombre;
    int vida;
    int ataque;
    int defensa;
    
    public Base() {}

    public Base (String nombre, int vida, int ataque, int defensa){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    
    public void detalles(){
        System.out.println("Clase: " + nombre + " Vida: " + vida + " Ataque: " + ataque + " Defensa: " + defensa);
    }

    public void recibirDaño(int ataque, int defensa) {
        int daño = ataque - defensa;
        if (daño <= 0){
            System.out.println("Ataque esquivado");
        } else {
            this.vida = this.vida - daño; 
        }
        
    }

}
