import java.util.Scanner;

public class Intro {
    
    public static void intro() {
	String name;
	int age;
	Scanner scan = new Scanner(System.in);
	System.out.println("You open your eyes to see an unfamiliar surrounding. Footsteps approach you. You hear footsteps approaching you. A young, male face leaned close.");
        Mechanics.promptEnterKey();
	System.out.println("\"Well, now, we have a vistor. Who are you?\"");
	name = scan.nextLine().trim();
	System.out.println("He paused, a little smile creeped onto his face. He spoke again.");
        Mechanics.promptEnterKey();
	System.out.println("\"" + name + " is it? That's a terrible name. How old are you?\"");
	age = scan.nextInt();
	if (age <= 18) {
	    System.out.println("\"You're a bit too young to be here.\"");
	} else {
	    System.out.println("\"Old. You're old.\"");
	}
        Mechanics.promptEnterKey(); 
	System.out.println("\"But it doesn't matter. You shouldn't be here. This place isn't safe.\"");
        Mechanics.promptEnterKey();
	System.out.println("\"You realize you need to get out, right?\"");
	Mechanics.promptEnterKey();
	System.out.println("A smile creeped onto his face, he offered a hand.");
	System.out.println("\"I'll help you. Come with me.\"");
	Mechanics.promptEnterKey();
    }

}
