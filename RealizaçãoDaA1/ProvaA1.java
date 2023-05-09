import java.util.Scanner;
public class ProvaA1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int peso;
        int aguaIngerida;
        

        System.out.println("\nDigite o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("\nInforme o seu peso: ");
        peso = scanner.nextInt();

        System.out.println("Informe a quantidade de água ingerida hoje: ");
        aguaIngerida = scanner.nextInt();

        int quantidadeIdeal = (peso * 35) / 1000;
        int quantidadeNecessaria = quantidadeIdeal - aguaIngerida;
        
        System.out.println("==============Funcionário=================");
        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("\nPeso do funcionário: " + peso + " kg");
        System.out.println("\nQuantidade de água que foi ingerida: " + aguaIngerida + " litros");
        System.out.println("\nQuantidade ideal de água a ingerir: " + quantidadeIdeal + " litros");

        if(quantidadeNecessaria <= 0) {
            System.out.println("\nParabéns, você atingiu a meta de hidratação diária!");
        } else{
        System.out.println("\nContinue focado em se hidratar por hoje, ainda faltam " + quantidadeNecessaria + " litros! Você consegue!");
        }
        scanner.close();


    }
}