import java.util.Scanner;

public class Tabuada{
    public static void main (String[] args) {

        System.out.println("Bem vindo a Tabuada, digite um número de 1 a 10 para saber sua Tabuada");
        System.out.println("Digite um número entre 1 e 10");
        Scanner scanner = new Scanner(System.in);

        int numM = scanner.nextInt();

        if(numM > 0 && numM <= 10){
            for (int i = 0; i < 11; i++) {
                System.out.println(i + "x" + numM + "=" +(numM * i));
            }
        } else {
            System.out.println("Digite um número entre 1 e 10");
      }
//        for (int i = 0; i < 11; i++) {
//            if (numM <= 10) {
//                System.out.println(i + "x" + numM + "=" +(numM * i));
//            } else {
//                System.out.println("Digite um número entre 1 e 10");
//            }
//          }
        }
    }
