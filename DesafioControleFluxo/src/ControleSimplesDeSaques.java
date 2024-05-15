import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        
        while (true) {
            double valorSaque = scanner.nextDouble();
            if (valorSaque == 0) {
                break;
            } else {
                if (valorSaque > limiteDiario) {
                    System.out.println("Limite diário excedido");
                } else {
                    limiteDiario -= valorSaque;
                    System.out.println("Saque realizado com sucesso");
                    System.out.println("Limite restante: " + limiteDiario);
                }
            }
        }
        scanner.close(); 
    }
}