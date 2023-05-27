import java.util.Scanner;
public class Dias_switch {
    public static void main(String[] args) {
        int dia;
        Scanner entrada=new Scanner(System.in);
        dia=entrada.nextInt();
        // Switch
        switch (dia) {
            case 1:
                System.out.print("Es lunes");
                break;
            case 2:
                System.out.print("Es martes");
                break;
            case 3:
                System.out.print("Es miercoles");
                break;
            case 4:
                System.out.print("Es jueves");
                break;
            case 5:
                System.out.print("Es viernes");
                break;
            case 6:
                System.out.print("Es sabado");
                break;
            case 7:
                System.out.print("Es domingo");
                break;
            default:
                System.out.print("Numero no valido");
        }
    }
}
