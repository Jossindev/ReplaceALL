package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your text");
        Scanner in = new Scanner(System.in);
        String story = in.nextLine();
        System.out.println("Before");
        System.out.println(story);
        System.out.println("After");
        String s2 = story.replaceAll("слово", "word");
        System.out.println(s2);
System.out.println("First on GitHub ");
    }
}

