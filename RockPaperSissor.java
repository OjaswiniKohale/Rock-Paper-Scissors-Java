import java.util.Random;
import java.util.Scanner;

//rock=0
//paper=1
//sissor=2

public class RockPaperSissor {
    public static void main(String[] args)
    {
        int ch=1;
        Scanner sc = new Scanner(System.in);
        while(ch==1)
        {
            System.out.println("Press 0 for ROCK \nPress 1 for PAPER \nPress 2 for SCISSOR");
            int userInput;
            userInput= sc.nextInt();
            System.out.println("You: "+userInput);

            Random r =new Random();
            int ComputerInput= r.nextInt(3);
            System.out.println("Computer: "+ComputerInput);

            if(userInput==ComputerInput)
            {
                System.out.println("Tie");
            }
            else if(userInput==0&&ComputerInput==2 || userInput==1&&ComputerInput==0 || userInput==2&&ComputerInput==1)
            {
                System.out.println("You win!");
            }
            else
            {
                System.out.println("Computer wins!");
            }
            System.out.println("Press 1 to continue");
            ch=sc.nextInt();
        }
        sc.close();
    }
}
