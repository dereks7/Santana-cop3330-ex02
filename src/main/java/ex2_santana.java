import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class ex2_santana
{
    public static void main( String[] args )
    {
        System.out.println( "What is the input string?" );
        Scanner in = new Scanner(System.in);
        int count = 0;
        String input = in.nextLine();
        if (input.equals(""))
        {
            System.out.println("Must enter word");
        }

        for(int i = 0; i < input.length(); i++)
        {
            count++;
        }
        System.out.println(input+" has "+ count +" characters.");

    }
}
