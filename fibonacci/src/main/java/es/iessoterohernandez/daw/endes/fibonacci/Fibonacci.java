package es.iessoterohernandez.daw.endes.fibonacci;

public class Fibonacci {

    // Método que calcula la secuencia de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Cambia el valor de n para obtener diferentes resultados
        System.out.println("Fibonacci de " + n + " es: " + fibonacci(n));
    }
}

