package br.ufg.inf;

import java.util.Scanner;

public class PrecoIdeal {

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===============");
        System.out.println("| Preço Ideal |");
        System.out.println("===============\n");

        System.out.println("Este programa calcula o preço ideal de um produto qualquer.\n");

        System.out.print("Digite o preço praticado: ");
        double pa = stdin.nextDouble();
        System.out.print("Digite o preço final (preço proposto): ");
        double pf = stdin.nextDouble();
        System.out.print("Digite a quantidade atual (normalmente vende): ");
        int qa = stdin.nextInt();
        System.out.print("Digite a quantidade proposta: ");
        int qp = stdin.nextInt();

        double elasticidade = PrecoIdealController.calculaElasticidade(pa, pf, (double) qa, (double) qp);

        System.out.println("\nElasticidade do produto: " + elasticidade);
    }
}
