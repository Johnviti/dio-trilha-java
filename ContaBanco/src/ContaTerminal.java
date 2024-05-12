import java.util.Scanner;

public class ContaTerminal {
    
    private static class Conta {
        private String agencia;
        private int conta;
        private String titular;
        private double saldo;

        public Conta(String agencia, int conta, String titular, double saldo) {
            this.agencia = agencia;
            this.conta = conta;
            this.titular = titular;
            this.saldo = saldo;
        }

        public String getAgencia() {
            return agencia;
        }

        public int getConta() {
            return conta;
        }

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt(); 
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do titular!");
        String titular = scanner.next();
        System.out.println("Por favor, digite o saldo inicial!");
        double saldo = scanner.nextDouble();

        // Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque
        Conta conta1 = new Conta(agencia, conta, titular, saldo);
        System.out.println("Olá " + conta1.getTitular() + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + conta1.getAgencia() + ", conta " + conta1.getConta() + " e seu saldo " + 
        conta1.getSaldo() + " já está disponível para saque");

    }

}
