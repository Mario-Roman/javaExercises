import java.util.LinkedList;
import java.util.Queue;
class pila {
    public static void main(String[] args) {
        Queue usuarios = new LinkedList();
        usuarios.add("Nombre 1");
        usuarios.add("Nombre 2");
        usuarios.add("Nombre 3");
        usuarios.add("Nombre 4");
        usuarios.add("Nombre 5");

System.out.println("El nombre a eliminar es " + usuarios.remove());
System.out.println("El nombre a eliminar es " + usuarios.remove());
System.out.println("El nombre a eliminar es " + usuarios.remove());
System.out.println("El nombre que sigue a eliminar es " + usuarios.element());
    }
}