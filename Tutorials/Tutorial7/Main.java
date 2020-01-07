package Tutorials.Tutorial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hong\\Dropbox\\1_WORKING\\Code\\Java\\Tutorials\\Tutorial7\\input.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()){
                System.out.println(sc.nextInt() * 100);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("파일을 읽어오는 도중에 오류가 발생했습다.");
        }

    }
}