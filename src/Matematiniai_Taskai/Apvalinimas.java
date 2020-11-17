package Matematiniai_Taskai;

import java.util.Scanner;

public class Apvalinimas {
    public static void main(String[] args) {
        double skaicius;
        System.out.println("Iveskite double tipo skaiciu: ");
        Scanner input = new Scanner(System.in);
        skaicius = input.nextDouble();
        System.out.println(skaicius);
        System.out.println("Kiek skaiciu po kablelio norite matyti? ");
        int bandom= input.nextInt();
        int d=1;
        while(bandom>0){
            d= d* 10;
            bandom--;
        }
        System.out.print("Suapvalintas skaicius = " + Math.floor(skaicius * d) / d);

    }
}
