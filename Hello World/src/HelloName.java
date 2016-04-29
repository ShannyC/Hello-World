import java.util.Scanner;

public class HelloName {

	public static void main(String[] args)
	{
	Scanner userlnput = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = userlnput.nextLine();
	System.out.println("Hello," + name + "!");
	System.out.println("What is your favorite color?");
	String favoriteColor = userlnput. nextLine();
	System.out.println("Wow," + favoriteColor + " is my favorite too!");
	System.out.println("What is your favorite food?");
	String favoriteFood = userlnput.nextLine();
	System.out.println("Yummy," + favoriteFood + " sounds delicious!");
	

	

	}

}
