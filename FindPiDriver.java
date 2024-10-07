package Lab10;

import java.util.Scanner;
import java.util.Random;

import static java.lang.Math.pow;

public class FindPiDriver {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        Random numGen = new Random();

        double x = 0;
        double y = 0;


        System.out.print("Enter number of points to check for pi: ");
        int numOfPoints = userInput.nextInt();
        int pointsInCircle = 0;

        for (int i = 0; i < numOfPoints; i++)
        {
             x = numGen.nextDouble(1);
             y = numGen.nextDouble(1);
            if (pow(x,2) + pow(y,2) <= 1){
                pointsInCircle++;
            }
        }

        double pi = ((double)pointsInCircle/(double)numOfPoints) * 4;

        System.out.println(pi);

    }

}
