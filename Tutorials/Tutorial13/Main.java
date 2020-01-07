package Tutorials.Tutorial13;

public class Main{

    public static int max(int a, int b){
        return (a>b) ? a:b;
    }

    public static void main(String[] args){
        int[] array = new int[100];
        for(int i = 0; i < 100; i++){
            array[i] = (int) (Math.random() * 100 + 1);
        }
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += array[i];
        }

        System.out.println(sum/100);
    }
}