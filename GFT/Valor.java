import java.util.Scanner;

public class Valor {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Infome um numero inteiro com 4 casas decimais:");
    int soma=0;

    int [] vetor; 
    vetor = new int [4];

    while(numero<4){
        for(int i=0; i<4; i++){
            int numero = scanner.nextInt();
            if(numero%2 == 0){
                soma++;
            }
        }
    }
    System.out.println("Possui " + soma + "numeros pares");

    scanner.close();
}
