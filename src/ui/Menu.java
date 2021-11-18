package ui;

import java.util.Scanner;

public class Menu {
    private Scanner inputFromUser;


    public Menu() {
        this.inputFromUser = new Scanner(System.in);
    }

    public void haikuRules() {
        System.out.println("A valid haiku-poem contains only 3 lines with 17 vowels in total.");
        System.out.println("The first line have 5 vowels, the second line have 7 vowels and the third line have 5 vowels");
    }

    public void welcomeUser() {
        System.out.println("Welcome to the haiku application");
    }

    public String nameOfTheUser() {
        System.out.println("Please insert your name");
        return inputFromUser.nextLine();
    }

    public String firstLine() {
        System.out.println("Please insert your first line");
        return inputFromUser.nextLine();
    }

    public String secondLine() {
        System.out.println("Please insert your second line");
        return inputFromUser.nextLine();
    }

    public String thirdLine() {
        System.out.println("Please insert your third line");
        return inputFromUser.nextLine();
    }
}
