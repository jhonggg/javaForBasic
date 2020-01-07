package Tutorials.Tutorial9;

public class Main {
    public static int greatestCommonFactor(int a, int b, int c){
        int min;
        if(a>b){
            if(b>c){
                min = c;

            }else{
                min = b;
            }
        }else{
            if(a > c){
                min = c;
            }else{
                min = a;
            }
        }
        for(int i = min; i > 0; i--){
            if(a % i == 0 && b % i == 0 && c % i == 0){
                return i;
            }
        }
        return -1;
    }
    public static int searchingCommonFactor(int num, int k){
        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                k--;
                if(k == 0){
                    return i;
                }
            }
        }
        return -1;
    }
    public static char searchingLastString(String input){
        return input.charAt(input.length() - 1);
    }

    public static int maximum(int a, int b){
        return (a<b) ? a : b;
    }

    public static void main(String[] args){
        //System.out.println("GCF of (400, 300, 750) : " + GreatestCommonFactor(400,300,750));
        /*
        int result = SearchingCommonFactor(3050, 10);
        if(result == -1){
            System.out.println("There is no 10th common facotr of 3050.");
        }else{
            System.out.println("10th common factor is "+ result);
        }
        */
        //System.out.println("Hello World of The last word is "+searchingLastString("Hello World"));
    }
}