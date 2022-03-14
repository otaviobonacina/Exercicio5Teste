import java.util.Scanner;
public class Exercicio5Teste{
    public static void main (String[]args){
        float x;
        Scanner resultadox=new Scanner(System.in);
        System.out.println("Digite um valor para x: ");
        x=resultadox.nextFloat();
        while(x!=1){
        if (x%2==0){
            x = x / 2 ; 
        }
        else {
            x = 3 * x + 1;
        }
    System.out.print(x+ " -> ");
            }
        }
    }