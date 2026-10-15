package exerciciosjava.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex9 {

    static void main(String[] args) {

        /* 9- Fazer um programa para ler um conjunto de nomes de pessoas e
        suas respectivas idades. Os nomes devem ser armazenados em um vetor,
        e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maiorIdade, posicaoMaior;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorIdade = idades[0];
        posicaoMaior = 0;

        for (int i=0; i<n; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + nomes[posicaoMaior]);

        sc.close();
    }
}
