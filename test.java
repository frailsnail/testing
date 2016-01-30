import java.util.Scanner;

public class test {
    public static void main(String[] args) {
	String name;
	int age;
	Scanner scan = new Scanner(System.in);
	System.out.println("You open your eyes to see an unfamiliar surrounding. Footsteps approach you. You hear footsteps approaching you. A young, male face leaned close.");
	try {
	    Thread.sleep(2000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	System.out.println("\"Well, now, we have a vistor. Who are you?\"");
	name = scan.nextLine().trim();
	System.out.println("He paused, a little smile creeped onto his face. He spoke again.");
	try {
	    Thread.sleep(2000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	System.out.println("\"" + name + " is it? That's a terrible name. How old are you?\"");
	age = scan.nextInt();
	if (age <= 18) {
	    System.out.println("You're a bit too young to be here.");
	} else {
	    System.out.println("Old. You're old.");
	}
	
	System.out.println("But it doesn't matter. You're stuck now. Think that through.");
	try {
	    Thread.sleep(2000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	} 
	System.out.println("Did you finishing thinking? Took you long enough.");
	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	System.out.println("You realize you need to get out, right?");
	System.out.println("I'll help you.");
	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	System.out.println("Come with me.");
	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
    }
}
