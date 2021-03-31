package sr.qualogy.zoo.service;

import sr.qualogy.zoo.entities.Shirts;
import sr.qualogy.zoo.interfaces.Graphics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Menu {

    public void menu(){
        Scanner userInput = new Scanner(System.in);
        int choice;
        boolean exit = false;

        do{
            System.out.print("---------------- Menu ----------------\n");
            System.out.print("1. Design shirt\n");
            System.out.print("2. Exit\n");
            System.out.print("\nDesign a shirt: ");
            choice = userInput.nextInt();

            switch (choice){
                case 1 : System.out.print("Animal image options\n");
                    shirtColorOptions();
                    designOptions();
                    graphicsOptions();
                break;
                case 2 :  System.exit(0);
                break;
                default:  System.out.print("\nUser error: non-existing choice\n");
                break;
            }
        }while (!exit);
    }

    public void shirtColorOptions(){
        System.out.print("---------------- Available shirt colors ----------------\n");
        List<String> shirts = new ArrayList<>();
        shirts.add("1. Purple");
        shirts.add("2. Black");
        shirts.add("3. Blue");
        shirts.add("4. White");
        Consumer <String> shirtColors = (s) -> System.out.print((s) + "\n");
        shirts.forEach(shirtColors);
        Shirts s = new Shirts();
        System.out.print("---------------- pick a color number ----------------\n");
        Scanner userInput = new Scanner(System.in);
        int chosenColor = userInput.nextInt();
        s.setColor(chosenColor);


        switch(chosenColor){
            case 1 : System.out.println(shirts.get(0));
                break;
            case 2 : System.out.println(shirts.get(1));
                break;
            case 3 : System.out.println(shirts.get(2));
                break;
            case 4 : System.out.println(shirts.get(3));
                break;
            default: System.out.println("\nUser error: non-existing choice\n");
                break;
        }
        //System.out.println(shirts.get(3));
    }


    public void designOptions(){
        
        System.out.print("---------------- Available animal graphics ----------------\n");
        List<String> animals = new ArrayList<>();
        animals.add("1. Tiger image");
        animals.add("2. Panda image");
        animals.add("3. Clownfish image");
        animals.add("4. Flamingo image");
        animals.add("5. None");
        Consumer <String> images = (s) -> System.out.print((s) + "\n");animals.forEach(images);

        System.out.print("---------------- pick an image number ----------------\n");
        Scanner userInput = new Scanner(System.in);
        int chosenImage = userInput.nextInt();

        switch(chosenImage){
            case 1 : System.out.println(animals.get(0));
            break;
            case 2 : System.out.println(animals.get(1));
            break;
            case 3 : System.out.println(animals.get(2));
            break;
            case 4 : System.out.println(animals.get(3));
            break;
            case 5 : System.out.println(animals.get(4));
            break;
            default: System.out.println("\nUser error: non-existing choice\n");
            break;
        }

    }
    
    public void graphicsOptions(){
        System.out.print("---------------- Available image sizes ----------------\n");

        Graphics smallGraphics = new SmallGraphics();
        smallGraphics.print();

        Graphics largeGraphics = new LargeGraphics();
        largeGraphics.print();

        Graphics none= new NoGraphics();
        none.print();


        System.out.print("---------------- pick an image size ----------------\n");
        System.out.println("s, l, n: ");
        Scanner userInput = new Scanner(System.in);
        String chosenSize = userInput.nextLine();

        switch (chosenSize){
            case "s" :
                Graphics small = new Color(new SmallGraphics());
                small.print();

            break;
            case "l" :
                Graphics large = new Color(new LargeGraphics());
                large.print();
            break;
            case "n" : none.print();
                System.out.println("Boring plain shirt, no animal graphics");
            break;
            default: System.out.println("\nUser error: non-existing choice\n");
            break;
        }
    }

//    public void setGraphicsColor() {
//        if Graphics small = new Color(new SmallGraphics());
//        small.print();
//
//        //System.out.print("---------------- pick a color for your image borders ----------------\n");
//        //System.out.println("\nBorder color for now is just black, due to some circumstances\n");
//    }

    public void summary(){

    }






}
