import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parametroUm;
        int parametroDois;
        System.out.println("Digite o primeiro parâmetro");
        parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosExceptio e) {
            System.out.println(e.getMessage());
        }
        
    } finaly {
        scanner.close();
    }
    
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptio {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosExceptio("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contador = parametroDois - parametroUm;
        for (int i = 1; i <= contador; i++) {
            System.out.println(i);
        }
    }
}

