import java.util.Scanner;
public class ProdutosComprar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cupom = "10%OFF";

        boolean loop = true;
        do {
            System.out.println("O que deseja fazer? ");

            String[] p = new String[4];
            p[0] = "1 - Mouse - R$ 150 ";
            p[1] = "2 - Gabinete - R$ 400";
            p[2] = "3 - Fone de Ouvido - R$ 300";
            p[3] = "4 - sair";

            for (int i = 0; i < p.length; i++) {
                System.out.println(p[i]);
            }
            System.out.println("Escolha seu produto: ");
            int opcaoProdutos = scan.nextInt();

            switch (opcaoProdutos) {
                case 1:
                    System.out.println("Deseja aplicar um cupom de desconto? S/N");
                    String sN = scan.next();
                    if (sN.equalsIgnoreCase("s")) {
                        System.out.println("Digite um cupom válido: ");
                        String cupomMouse = scan.next();
                        if (cupomMouse.equals(cupom)) {
                            double descontoMouse = 150 - (150 * 10 / 100);
                            System.out.println("Seu produto com desconto: R$ " + descontoMouse);
                        } else {
                            System.out.println("Cupom inválido. Seu produto sem desconto: R$ 150");
                        }
                    } else if (sN.equalsIgnoreCase("n")) {
                        System.out.println("Seu produto sem desconto: R$ 150");
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 2:
                    System.out.println("Deseja aplicar um cupom de desconto? S/N");
                    sN = scan.next();
                    if (sN.equalsIgnoreCase("s")) {
                        System.out.println("Digite um cupom válido: ");
                        String cupomGabinete = scan.next();
                        if (cupomGabinete.equals(cupom)) {
                            double descontoGabinete = 400 - (400 * 10 / 100);
                            System.out.println("Seu produto com desconto: R$ " + descontoGabinete);
                        } else {
                            System.out.println("Cupom inválido. Seu produto sem desconto: R$ 400");
                        }
                    } else if (sN.equalsIgnoreCase("n")) {
                        System.out.println("Seu produto sem desconto: R$ 400");
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 3:
                    System.out.println("Deseja aplicar um cupom de desconto? S/N");
                    sN = scan.next();
                    if (sN.equalsIgnoreCase("s")) {
                        System.out.println("Digite um cupom válido: ");
                        String cupomFone = scan.next();
                        if (cupomFone.equals(cupom)) {
                            double descontoFone = 300 - (300 * 10 / 100);
                            System.out.println("Seu produto com desconto: R$ " + descontoFone);
                        } else {
                            System.out.println("Cupom inválido. Seu produto sem desconto: R$ 300");
                        }
                    } else if (sN.equalsIgnoreCase("n")) {
                        System.out.println("Seu produto sem desconto: R$ 300");
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    loop = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Deseja repetir? S/N");
            String loopSN = scan.next();
            if (loopSN.equalsIgnoreCase("s")) {
                System.out.println("Voltando ao programa...");
              loop = true;
            }else if( loopSN.equalsIgnoreCase("n")){
                System.out.println("Saindo do programa...");
                loop = false;
            }

        } while (loop);
    }
}

