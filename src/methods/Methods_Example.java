package methods;

public class Methods_Example {

    public static void main(String [] args ){

        int x =10;
        int y = 5;

        int result =findArea(x,y);
        System.out.println(result);

        printResult(50,60);
        printResult(40,40);

    }
    public static int findArea (int x,int y){
        int sum = 2*(x+y);
        return sum;
    }
    public static void printResult (int x,int y){
        int sum = 2*(x+y);
        System.out.println(sum);
    }
}
