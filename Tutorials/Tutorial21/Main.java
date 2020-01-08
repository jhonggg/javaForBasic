package Tutorials.Tutorial21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Banana:1, Peach:2");
        System.out.print("Select fruits option : ");
        int input = scanner.nextInt(); 
        scanner.close();
        Fruit fruit;  
        if(input == 1){
            fruit = new Banana();
            fruit.show();
        }else if(input==2){
            fruit = new Peach(); 
            fruit.show();
        }else{
            System.out.println("Error");
        }
    }
}