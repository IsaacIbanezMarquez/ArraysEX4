import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Inserte una longitud: ");
        int longitud = sc.nextInt();

        int numeros [] = new int [longitud];


        int num = 0;

        for(int i = 0; i < numeros.length; i++)
        {
            do
            {
                num = sc.nextInt();

                if(!(num > 0 && num < 10))
                {
                    System.out.println("Error. Solo números del 0 - 10: " + " Insterte un número en la posición " + i);
                }



            }
            while(!(num > 0 && num < 10));



        }
    }
}
