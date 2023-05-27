import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner datos = new Scanner (System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese tu nombre completo: ");
        nombre = datos.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = datos.nextInt();
        if(edad>=18){
            System.out.println("Tu nombre es " +nombre+ ", tienes " +edad+ " años y eres mayor de edad.");
        }
        else{
            System.out.println("Tu nombre es " +nombre+ ", tienes " +edad+ " años y eres menor de edad.");
        }
        System.out.println("Tu nombre tiene " +nombre.length()+ " caracteres.");
        }
    }