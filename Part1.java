import java.util.Scanner;
public class Part1 {
    public static void question() {
	int choice;
	System.out.println("He walked with you, hands in his pockets. It was silent as you two walked. You decided to break the silence with question.");
	System.out.println("What are you going to ask?\n1. Who are you?\n2. Why are you helping me?\n3. Where am I?");
	Scanner scan = new Scanner(System.in);
	choice = scan.nextInt();
	switch(choice) {
	case 1: System.out.println("Filler");
	case 2: System.out.println("Filler");
	case 3: System.out.println("Filler");
	}
    }
}
