package monicaquintal_ag4_dsi;

import java.util.Scanner;

public class MonicaQuintal_Ag4_DSI {

    public static void main(String[] args) {
        
        //declaracao de variaveis
        
        int sudeste;
        int nordeste;
        int sul;
        int norte;
        int centrooeste;
        int totalcasos;
        int calcsudeste;
        int calcnordeste;
        int calcsul;
        int calcnorte;
        int calcco;
        
        Scanner leitor = new Scanner(System.in);
        
// inicio do programa
System.out.println("Este programa calcula o percentual de casos de coronavírus nas regiões do Brasil.");

System.out.println("Digite a quantidade de casos na região Sudeste.");
//leitura da regiao Sudeste
sudeste = leitor.nextInt();

System.out.println("Digite a quantidade de casos na região Nordeste.");
//leitura da regiao Nordeste
nordeste = leitor.nextInt();

System.out.println("Digite a quantidade de casos na região Sul.");
//leitura da regiao Sul
sul = leitor.nextInt();

System.out.println("Digite a quantidade de casos na região Norte.");
//leitura da regiao Norte
norte = leitor.nextInt();

System.out.println("Digite a quantidade de casos na região Centro-Oeste.");
//leitura da regiao Centro-Oeste
centrooeste = leitor.nextInt();


//processamento total casos
totalcasos = sudeste + sul + centrooeste + nordeste + norte;


//processamento por região
calcsudeste = (sudeste*100)/totalcasos ;
calcnordeste = (nordeste*100)/totalcasos ;
calcsul = (sul*100)/totalcasos ;
calcnorte = (norte*100)/totalcasos ;
calcco = (centrooeste*100)/totalcasos ;

//saída de dados
System.out.println("O número total de casos de COVID no Brasil é " + totalcasos + "."); 

System.out.println("O número de casos de COVID por região é:");
System.out.println("SUDESTE: " + sudeste + ", que corresponde a " + calcsudeste + "% do total de casos.");
System.out.println("NORDESTE: " + nordeste + ", que corresponde a " + calcnordeste + "% do total de casos.");
System.out.println("SUL: " + sul + ", que corresponde a " + calcsul + "% do total de casos.");
System.out.println("NORTE: " + norte + ", que corresponde a " + calcnorte + "% do total de casos.");
System.out.println("CENTRO-OESTE: " + centrooeste + ", que corresponde a " + calcco + "% do total de casos.");

    }
   
}
