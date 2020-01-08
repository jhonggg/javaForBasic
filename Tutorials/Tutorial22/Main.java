package Tutorials.Tutorial22;

public class Main {

    public static void main(String[] args){

        Archer archer1 = new Archer("Archer1", "high class");
        Archer archer2 = new Archer("Archer1", "high class");
        System.out.println(archer1.equals(archer2));
    }
}