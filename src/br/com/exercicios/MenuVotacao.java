package br.com.exercicios;

import java.util.Scanner;

public class MenuVotacao {
    public static void main(String[] args) {
        int vJoaoDoFrete = 0, vMariaDaPamonha = 0, vZeDaFarmacia = 0, pDrZureta = 0, pSenhorGomes = 0, vNulo = 0, nCandidatos = 0, n = 0;
        Scanner teclado = new Scanner(System.in);
        while (n != 3) {
            System.out.println("Digite uma das opções :");
            System.out.println("1 - Votar ");
            System.out.println("2 - Apurar Votos ");
            System.out.println("3 - Sair ");
            n = teclado.nextInt();
            if (n != 1 && n != 2 && n != 3) {
                System.out.println("Código Inválido \r\n");
            }
            switch (n) {
                case 1:
                    System.out.println("Qual o seu voto para Vereador");
                    System.out.println("111 - João do frete");
                    System.out.println("222 - Maria da Pamonha");
                    System.out.println("333 - Zé da Farmacia");
                    System.out.println("444 - Voto Nulo");
                    nCandidatos = teclado.nextInt();
                    if (nCandidatos != 111 && nCandidatos != 222 && nCandidatos != 333 && nCandidatos != 444) {
                        System.out.println("Código Inválido");
                    }
                    switch (nCandidatos) {
                        case 111:
                            vJoaoDoFrete++;
                            break;

                        case 222:
                            vMariaDaPamonha++;
                            break;

                        case 333:
                            vZeDaFarmacia++;
                            break;

                        case 444:
                            vNulo++;
                            break;
                    }
                    System.out.println("Qual o seu voto para Prefeito? ");
                    System.out.println("11 - Dr Zureta");
                    System.out.println("22 - Senhor Gomes");
                    System.out.println("44 - Nulo");
                    nCandidatos = teclado.nextInt();
                    if (nCandidatos != 11 && nCandidatos != 22 && nCandidatos != 44) {
                        System.out.println("Código inválido");
                    }
                    switch (nCandidatos) {
                        case 11:
                            pDrZureta++;
                            break;
                        case 22:
                            pSenhorGomes++;
                            break;
                        case 44:
                            vNulo++;
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Vereador João do Frete: "+vJoaoDoFrete);
                    System.out.println("Vereador Maria da Pamonha: "+vMariaDaPamonha);
                    System.out.println("Vereador Zé da Farmcia: "+vZeDaFarmacia);
                    System.out.println("Prefeito Dr Zureta: "+pDrZureta);
                    System.out.println("Prefeito Senhor Gomes: "+pSenhorGomes);
                    System.out.println("Votos Nulos: "+vNulo);


            }
        }
    }
}





