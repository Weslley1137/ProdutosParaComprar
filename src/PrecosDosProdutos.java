import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrecosDosProdutos {
    public static void main(String[] args) {
        // aplicando um valor e um desconto para calcular

        Scanner scan = new Scanner(System.in);
        boolean loop = false;
        System.out.println("Calculando desconto dos produtos");
        do {

            System.out.println("Digite o valor do produto: ");
            double valor = scan.nextDouble();
            System.out.println("qual é o desconto? ");
            int desconto = scan.nextInt();

            double soma = valor - (valor * desconto / 100);

            System.out.println("Seu produto com desconto saiu por apenas: " + soma);


            System.out.println("Deseja continuar? S/N");
            String sN = scan.next();

            if (sN.equalsIgnoreCase("S")) {
                loop = true;
            } else if (sN.equalsIgnoreCase("N")) {

                System.out.println("Tchauu");
                loop = false;
            }

        } while (loop);

    }}
