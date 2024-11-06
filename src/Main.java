import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        int resultado;

        System.out.println("======= Bem-vindo(a) a minha Calculadora simples =======\n");
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Os números escolhidos foram " + n1 + " e " + n2);

        while (escolha != 6) {
            System.out.println("\n========================================================");
            System.out.println("\nNúmeros escolhidos:\n1° Número: " + n1 + "\n2° Número: " + n2 + "\n\nSelecione uma das opções:\n1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Trocar valores\n6. Encerrar");
            System.out.print("\nOpção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    resultado = Somar(n1, n2);
                    System.out.println("\nResultado da adição: " + resultado);
                    break;

                case 2:
                    resultado = Subtrair(n1, n2);
                    System.out.println("\nResultado da subtração: " + resultado);
                    break;

                case 3:
                    resultado = Multiplicar(n1, n2);
                    System.out.println("\nResultado da multiplicação: " + resultado);
                    break;

                case 4:
                    if (n2 != 0) {
                        double resultadoDivisao = Dividir(n1, n2);
                        System.out.println("\nResultado da divisão: " + resultadoDivisao);
                    } else {
                        System.out.println("\nErro: Divisão por zero não é permitida.");
                    }
                    break;

                case 5:
                    System.out.print("\nDigite o primeiro número: ");
                    n1 = scanner.nextInt();
                    System.out.print("\nDigite o segundo número: ");
                    n2 = scanner.nextInt();
                    break;

                case 6:
                    System.out.println("\nEncerrando a Calculadora. Até mais!");
                    break;

                default:
                    System.out.println("\nOpção inválida. Selecione outra opção...");
            }
        }

        scanner.close();
    }

    public static int Somar (int n1, int n2) {
        return n1 + n2;
    }

    public static int Subtrair (int n1, int n2) {
        return n1 - n2;
    }

    public static int Multiplicar (int n1, int n2) {
        return n1 * n2;
    }

    public static double Dividir(int n1, int n2) {
        return (double) n1 / n2;
    }
}