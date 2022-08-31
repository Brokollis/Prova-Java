import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Atividade001{
    public static void main(String[] args) {
        System.out.println("Essa é a atividade de numero 01");
       String numeros= new String();
       String locArquivo= "C:/Users/vitor.ramos/Desktop/Prova Java/Prova-Java/Numeros.txt";

       File leitura= new File(locArquivo);

       if(leitura.exists()){

        try{

            FileReader leitorDeArquivos = new FileReader(locArquivo);
            BufferedReader bufferLeitura = new BufferedReader(leitorDeArquivos);

            while (true){
                numeros = bufferLeitura.readLine();
                
                //System.out.println(numeros);
                
                if (numeros == null){
                    break;
                }
            }

            bufferLeitura.close();

        }catch(Exception e){
            System.out.println("Algo deu errado, tente de novo");
        }

       }

    }
}