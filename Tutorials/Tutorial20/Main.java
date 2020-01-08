package Tutorials.Tutorial20;

public class Main implements Dog, Cat{

    public static void main(String[] args){
        Main main = new Main();
        main.crying();
        main.show();
    }

    @Override
    public void crying() {
        System.out.println("Wal Wal!");

    }

    @Override
    public void show() {
        System.out.println("This is a dog.");
    }

    @Override
    public void two() {
        System.out.println("two");

    }

    @Override
    public void one() {
        System.out.println("one");

    }

}