package br.com.projetoJava;

import java.util.Scanner;

public class CalculandoAreaCirculo {
    public static void main(String[] args) {
        int[] raio = new int[3];
        float r = 0, area, PI = 3.1415F;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o tamanho do raio ");
            raio[i] = teclado.nextInt();
            System.out.println("O calculo da área de " + raio[i] + " é: " + PI * (raio[i] * raio[i]));
            if (raio[0] < raio[1] && raio[0] < raio[2]) {
                r = raio[0];
            } else if (raio[1] < raio[0] && raio[1] < raio[2]) {
                r = raio[1];
            } else {
                r = raio[2];
            }
        }
        area = PI * (r * r);
        System.out.println("A menor área é: " + area);
    }
}




