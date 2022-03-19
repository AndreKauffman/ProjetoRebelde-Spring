package com.andrekauffman.exrebelde.App;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;


@Data
@AllArgsConstructor
@Builder
public class IC {

    public void PrintReport(ArrayList rebeldeCompleto) {

        System.out.println("Adicionei na lista...");

        String fileName = "my-file.txt";
        String encoding = "UTF-8";

        try {
            PrintWriter writer = new PrintWriter(fileName, encoding);
            writer.println(rebeldeCompleto);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public void IcAceppt(ArrayList rebeldeCompleto){

        if (rebeldeCompleto.size() == 3){

            System.out.println("Estamos verificando seu rebelde.......");

        }

        Random random = new Random();
        Boolean acceptRebelde = random.nextBoolean();

        if(acceptRebelde == true){

            System.out.println("Opa, seu rebelde foi aceito...");
            PrintReport(rebeldeCompleto);

        }else{

            System.out.println("Deu azar, não foi aceito...");

        }
    }
}
