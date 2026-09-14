import java.util.concurrent.SynchronousQueue;

public class HelloWorld {
    //fields
    static int a = 1;


    //method
    //green button - to play the program
    //main method is an entry point of program
    public static void main(String[] args){
        int sum1 = sum(1, 2);
        System.out.println(sum1);

        int mult1 = multiply(4, 6);
        System.out.println("Результат умножения:" + mult1);

        int subtr1 = substruct(6, 3);
        System.out.println(subtr1);

        double divis1 = division(6, 3);
        System.out.println(divis1);
    }

    public static int sum(int x, int y){
        //body
        return x + y;
    }

    public static int multiply(int p, int k){
        int mult = p * k;
        return mult;
    }

    public static int substruct(int g, int a){
        return g - a;
    }

    public static double division(int d, int u){
        return (double) d / u;
    }
}
