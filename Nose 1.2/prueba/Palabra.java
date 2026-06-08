public class Palabra {
    private String palabra = "";

    public Palabra() {
    }

    public Palabra(String palabra) {
        this.palabra = palabra;

    }

    public void jugar() {
        int longitud = palabra.length();
        while (longitud > 0) {
            System.out.print("_");
            longitud = longitud - 1;
        }
    }


    public void comprobar(String comprobador){
        int limite = Math.min(palabra.length(), comprobador.length());
        for (int i = 0; i < limite; i++) {
            if (palabra.charAt(i) == comprobador.charAt(i)){
                System.out.print(palabra.charAt(i));
            } else {
                System.out.print("_");
            }   
        }
        for (int j = limite; j < palabra.length(); j++) {
                System.out.print("_");
            }
            System.out.println("");
    }
}
