package com.andrekauffman.exrebelde.App;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Scanner;

@Data
@AllArgsConstructor
@Builder
public class Rebelde {

    Scanner scanner =  new Scanner(System.in);
    IC ic = new IC();

    public Rebelde() {

    }

    private void AdicionarRebeldes() {

        ArrayList raçaRebelde = new ArrayList();
        ArrayList rebeldeCompleto = new ArrayList();
        raçaRebelde.add("Humano"); raçaRebelde.add("Gree"); raçaRebelde.add("Rakata");
        String nomeRebelde;
        int idadeRebelde, escolherRaçaRebelde;

        System.out.println("Nome: ");
        nomeRebelde = scanner.next();
        System.out.println("Idade: ");
        idadeRebelde = scanner.nextInt();
        System.out.println("Raça: ");


        for (int raça = 0 ; raça < raçaRebelde.size(); raça++){

            System.out.println((raça) + " - " + raçaRebelde.get(raça));

        }

        do {
            escolherRaçaRebelde = scanner.nextInt();
        }while(escolherRaçaRebelde > 2 || escolherRaçaRebelde < 0);

        rebeldeCompleto.add(nomeRebelde);
        rebeldeCompleto.add(idadeRebelde);
        rebeldeCompleto.add(raçaRebelde.get(escolherRaçaRebelde));

        ic.IcAceppt(rebeldeCompleto);

    }

    public void InicialScreen(){

        String nomePessoa;
        int task = 0;

        System.out.println("Qual Seu Nome? ");
        nomePessoa = scanner.nextLine();

        System.out.printf("Olá %s, Seja Bem Vindo ", nomePessoa);
        System.out.println("\nO Que Deseja?");
        System.out.println("1 - Adicionar Rebelde");
        System.out.println("2 - Sair");

        do {

            task = scanner.nextInt();

        }while(task > 3 || task < 1);

        switch (task){
            case 1:
                AdicionarRebeldes();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.exit(0);

        }
    }
}