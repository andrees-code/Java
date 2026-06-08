public class Fallos {
    //hay 6 fallos
    private Integer intentos = 0;

    public Fallos () {}

    public Fallos (Integer intentos){
        this.intentos = intentos;
    }

  public void vidas() {
    if (intentos == 1) {
        System.out.println(" +---+");
        System.out.println(" O   |");
        System.out.println("     |");
        System.out.println("     |");
    } else if (intentos == 2) {
        System.out.println(" +---+");
        System.out.println(" O   |");
        System.out.println(" |   |");
        System.out.println("     |");
    } else if (intentos == 3) {
        System.out.println(" +---+");
        System.out.println(" O   |");
        System.out.println("/|   |");
        System.out.println("     |");
    } else if (intentos == 4) {
        System.out.println(" +---+");
        System.out.println(" O   |");
        System.out.println("/|\\  |");
        System.out.println("     |");
    } else if (intentos == 5) {
        System.out.println(" +---+");
        System.out.println(" O   |");
        System.out.println("/|\\  |");
        System.out.println("/    |");
    } else if (intentos == 6) {
        System.out.println(" +---+");
        System.out.println(" O   |");
        System.out.println("/|\\  |");
        System.out.println("/ \\  |");
    }
}
}
