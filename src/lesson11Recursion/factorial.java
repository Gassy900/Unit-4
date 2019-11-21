
package lesson11Recursion;

public class factorial {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x + "!= " + fact1(x));
        System.out.println(x + "!=(recursive) " + fact1(x));
    }
    
    public static int factr(int num){
    if(num==1)
        return 1;
    else
        return num * factr(num-1);
    }
    public static int fact1(int num){
        int answer = num;
            for (int i = num-1; i >= 1; i--) {
                answer = answer * i;
            }
            return answer;
    }
    public static int badMethod(int num){
        if(num==7)return 7;
        else return num * factr(num-1);
    }
}
