import java.util.Scanner;


public class Pregunta{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String nombre = "";

        System.out.println("¿Cual es tu nombre?");
        nombre = entrada.nextLine();

        System.out.println("Hola "+nombre);

    }
}
