import java.time.LocalTime;
import java.time.LocalDate;

public class Script{
    public static void main(String[] args){
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();

        System.out.println("La fecha es: " + fecha);
        System.out.println("El horario es: " + hora); 


    }
}
