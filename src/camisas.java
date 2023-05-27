import java.util.Stack;
class camisas {
    public static void main(String[] args) {
        Stack<String> camisas = new Stack<String>();
        camisas.push("Camisa blanca");
        camisas.push("Camisa favorita");
        camisas.push("Camisa negra");
        System.out.println("La última camisa agregada es: " + camisas.peek());
        }
    }
