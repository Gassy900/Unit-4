
package lesson11Recursion;

public class fibonachi {


    public static void main(String[] args) {
        System.out.println("The 8th fib is " + fib1(8));
    }
    
    public static int recfib(int num){
         if(num==1 || num == 2) return 1;
         else
             return recfib(num-1) + recfib(num-2);
    }
    public static int fib1(int num){
        if(num==1 || num == 2) return 1;
        int num1 = 1, num2 = 1;
        int fib = 2;
        for (int i = 3; i <=num; i++) {
            fib = num1+num2;
            num1 = num2;
            num2 = fib;
        }
        return fib;
    }
    
}
