import java.util.Random;
import java.util.Scanner;

class DiceGame
{
    public static void roll()
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your name?");
	System.out.printf(">");
	String name = sc.nextLine();
	System.out.println("Hello, " + name + "!");
	
	System.out.println("Rolling dice...");

	Random r = new Random();
	int die1 = r.nextInt(6) + 1;
	int die2 = r.nextInt(6) + 1;
	int total = die1 + die2;

	System.out.println("Die 1: " + die1);
	System.out.println("Die 2: " + die2);
	System.out.println("Total value: " + total);
    }

    public static void main(String[] args)
    {
	roll();
    }
}
