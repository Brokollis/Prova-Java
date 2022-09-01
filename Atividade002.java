import java.io.File;   
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Atividade002 {
    private static int i;
    public static void main(String[] args) {
         
        System.out.println("Prova de Java");

        //String numeros = new String();
        String locArq = "./Atividade002.java";

        File leitura = new File (locArq);

        if(leitura.exists()){ 

            try{
                FileReader leitorDeArquivos = new FileReader(locArq); 
                BufferedReader leitorBuffer = new BufferedReader(leitorDeArquivos); 
                int contLinhas = 0;
                while(leitorBuffer.readLine() != null) { // leitura do arquivo 
                    contLinhas++;
                }
                leitorBuffer.close();                                   

                int[] lista = new int[contLinhas];
                leitorDeArquivos = new FileReader(locArq); // ler arquivo 
                leitorBuffer = new BufferedReader(leitorDeArquivos); 
                contLinhas = 0;
                String linha = ""; // leitura linha por linha do texto
                while((linha = leitorBuffer.readLine()) != null) { // ler até final das linhas
                    lista[contLinhas] = Integer.parseInt(linha); // conversão para int
                    contLinhas++;
                }
                leitorBuffer.close(); // fecha reader

                System.out.println("Numeros fora da ordem: ");
                System.out.println(Arrays.toString(lista)); // conversão de vetor para string
                SortedSet<Integer> list = new TreeSet<Integer>(); // selection
                for (int i = 0; i < lista.length; i++){
                    list.add(lista[i]);
                }
                System.out.println("");
                System.out.println("Numeros dentro da ordem: ");    // ordenação da lista
                int x = lista.length;
                for (int i = 0; i < x - 1; i++)
                    for (int y = 0; y < x - i - 1; y++)
                    if (lista[y] > lista[y + 1]) {
                        // troca de lista lista[y+1] and lista[y]
                        int temp = lista[y];
                        lista[y] = lista[y + 1];
                        lista[y + 1] = temp;

                    System.out.println(Arrays.toString(lista)); // impressão da ordem
                
                }


                System.out.println("Collection em ordem: ");
                System.out.println(list); // imprime lista
                 

                for(int i = 0; i< lista.length; i++){
                    int min = i;

                    for(int y = i + 1; y <lista.length; y++){
                        if(lista[y] < lista[min]){
                            min = y;
                        }
                    }
                    if(i != min){
                        int temp = lista[i];
                        lista[i] = lista[min];
                        lista[min] = temp;
                    }
                }

                System.out.println("Array ordenado: ");
                System.out.println(Arrays.toString(lista));
               
            } catch (Exception e) {
                System.out.println("Erro, tente novamente!");
            }
            
        }
         
    }
}