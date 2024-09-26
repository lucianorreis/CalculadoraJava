import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        try (Scanner prompt = new Scanner(System.in)) {
            System.out.println
                (" Bem vindo!\n Essa é a sua Calculadora de Terminal!");
            System.out.println("Digite o primeiro numero: ");
            Double num1 = prompt.nextDouble();
            System.out.println("Digite o segundo numero: ");
            Double num2 = prompt.nextDouble();
            System.out.println("Escolha o Operador(+, -, x, /): ");
            char operador = prompt.next().charAt(0);
            
            double result;
            
            switch (operador)  {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("O resultado de " + num1 + " " + operador + " " + num2 + " é: " + result);  
                }
                
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("O resultado de " + num1 + " " + operador + " " + num2 + " é: " + result);
                }
                
                case 'x' -> {
                    result = num1 * num2;
                    System.out.println("O resultado de " + num1 + " " + operador + " " + num2 + " é: " + result);
                }
                
                case '/' -> {
                    result = num1 / num2;
                    System.out.println("O resultado de " + num1 + " " + operador + " " + num2 + " é: " + result);
                }
                
                default -> {System.out.println("Operação Inválida");}
                
            }
        }
}
}