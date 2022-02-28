import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a*b;
        int rem =1 ;
        while(rem!=0){
            rem  = a%b;
            a = b;
            b = rem;
        }
        int gcd = a;
        int lcm = mul/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
