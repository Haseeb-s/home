import java.util.Scanner;

/**
 * Created by Haseeb on 2/9/2016.
 */
public class Test1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numStudents=5;

        System.out.println("Please enter the number of students");
        // numStudents = scan.nextInt();
        String[] studentName = {"Jim","Haseeb", "Jen", "Him", "Yas"};
        int[] score = {50,40,70,80,60};
        int[] next = {50,40,70,80,60};
        int temp;

        for(int i=0; i< numStudents-1; i++) //minus 1 bc array starts at 0 & includes "0" as part of the length
        {
            //second for-loop bc sorting for index of this "i".
            for(int j=1; j<numStudents-i; j++)
            //start as 1 bc in if-statement cannot subtract 0-1 bc there is no negative array.
            //minus i because once this for loop ends, i is found and must move on to the next.
            {
                if(next[j] > next[j-1])
                {

                    temp = next[j];
                    next[j] = next[j-1];
                    next[j-1] = temp;
                }
            }
        }

        int counter = 0;
        for(int x=0; x<numStudents-1; x++)
        {
            for(int j = 0; j < numStudents-1; j++)
            {
                System.out.println(next[x]+" compare " + score[j]);
                if (next[counter] == score[j])
                {
                    System.out.println(studentName[counter]);
                }
                counter++;
            }
            counter = 0;
        }




    }
}
