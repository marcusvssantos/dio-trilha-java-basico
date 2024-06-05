public class OperadoresLogicos {
    public static void main(String[] args) {

        // Declarando variáveis para os exemplos
        int x = 10;
        int y = 5;
        boolean a = true;
        boolean b = false;

        // Operador E lógico (&&) - Retorna true se AMBAS as condições forem verdadeiras
        System.out.println("x > 5 && y < 10: " + (x > 5 && y < 10)); // true

        // Operador OU lógico (||) - Retorna true se PELO MENOS UMA condição for verdadeira
        System.out.println("x < 5 || y > 10: " + (x < 5 || y > 10)); // false

        // Operador NÃO lógico (!) - Inverte o valor lógico da expressão
        System.out.println("!(x == y): " + !(x == y)); // true

        // Operador OU exclusivo (^) - Retorna true se APENAS UMA condição for verdadeira
        System.out.println("a ^ b: " + (a ^ b)); // true

        // Operador E lógico de curto-circuito (&&)
        // Avalia a segunda expressão apenas se a primeira for true
        System.out.println("a && (x / y == 2): " + (a && (x / y == 2))); // true

        // Operador OU lógico de curto-circuito (||)
        // Avalia a segunda expressão apenas se a primeira for false
        System.out.println("b || (x + y == 15): " + (b || (x + y == 15))); // true
    }
}
