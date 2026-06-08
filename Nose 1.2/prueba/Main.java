import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer intentos = 0;
        String resultado = "";
        String comprobador = "";


        System.out.println("Dime la palabra a adivinar: ");
        String palabraJuego = sc.nextLine();
        palabraJuego = palabraJuego.toLowerCase();
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
        Palabra palabra = new Palabra(palabraJuego);
        palabra.jugar();


        System.out.println("");
        System.out.println("Empezemos: ");
        Fallos fallos = new Fallos(intentos);
        while (intentos < 6) {
            comprobador = sc.nextLine();
            comprobador = comprobador.toLowerCase();
            palabra.comprobar(comprobador);

            if (comprobador.equals(palabraJuego)){
                resultado = "Has ganado";
                System.out.println(resultado);
                System.exit(0);

            } else {
                intentos = intentos + 1;
                fallos.vidas();
            }
        }

        if (intentos >= 6){
            resultado = "Has perdido";
            System.out.println(resultado);
            System.exit(0);
        }
        
    }
}

