package com.company;

import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // List of Colors

        Scanner input = new Scanner(System.in);
        String quit = "";
        ArrayList<String> colors = new ArrayList<>();

        //To add colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors);

        System.out.println("The color at index 1 is " + colors.get(1));

        System.out.println("Enter a new color");
        String colorAdd = input.nextLine();

        colors.add(colorAdd);
        System.out.println(colors);


        System.out.println();

        for (String c : colors) {

            System.out.println("Enter a new color");
            String colorInput = input.nextLine();

            colors.add(colorInput);
            System.out.println(colors);

            break;
        }
        System.out.println("Enter Q to quit");
        quit = input.nextLine();
        System.out.println(colors);

    }
    }
