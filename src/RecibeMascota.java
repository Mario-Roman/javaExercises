import java.util.ArrayList;
public class RecibeMascota {
    String nombre; // Nombre del perro
    int edad; // Edad del perro
    String raza; // Raza de perro que ingresa
    String tamanio; // Tamaño del perro: chico, mediano y grande
    String nombreDuenio; // Nombre completo del dueño
    public static void main(String args[]) {
// Creamos un arreglo de tipo RecibeMascota
        ArrayList<RecibeMascota> perrosActuales = new ArrayList();
// Hacemos una instancia y creamos un objeto de tipo RecibeMascota
        RecibeMascota miEstetica = new RecibeMascota();
// Asignamos los valores a los campos de RecibeMascota
        miEstetica.nombre = "Moca";
        miEstetica.edad = 5;
        miEstetica.raza = "Labrador";
        miEstetica.tamanio = "Grande";
        miEstetica.nombreDuenio = "Monse";
// Agregar el objeto al arreglo
        perrosActuales.add(miEstetica);

// Imprimir la cantidad de perros en la estética
System.out.println("Perros actuales en la estética: " + perrosActuales.size());
    }
}