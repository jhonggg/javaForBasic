package Tutorials.Tutorial14;

public class Main{

    public static void main(String[] args){
        int N = 50;
        int[][] array = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j<N; j++){
                array[i][j] = (int)(Math.random() * 10);
            }
        }
    }
}