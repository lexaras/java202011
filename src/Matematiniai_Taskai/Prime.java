package Matematiniai_Taskai;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(5%2);
        System.out.print("Enter the first number : ");
        int start = s.nextInt();
        System.out.print("Enter the second number : ");
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        //Surandam dalikius traukadami sakni pvz(sqrt17 = ~4.12) 17 % 2/17 %3/ 17%4
        //(tas pats kas du) Netenkina salyga- todel prime
        //sqrt16 = 4, 16% 2 == 0 - iskart false
        //sqrt9 = 3   9% 2  != 0, 9% 3 == 0- grazina false
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                return false;
            }
        }
        return true;

    }

}
