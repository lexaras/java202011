package Matematiniai_Taskai;

import java.util.Scanner;
import java.time.Year;


class Demo{

    public static void main (String[] args){

        System.out.println("Hello World");
        int skaicius = 12;
        int kSkaicius = 10;
        while(skaicius > kSkaicius){
            System.out.println(skaicius--);
        }
        int suma= skaicius+ kSkaicius;
        System.out.println("Suma dvieju skaiciu = " + suma);
        int year = Year.now().getValue();
        Scanner input = new Scanner(System.in);

        System.out.print("Gimimo metai: ");
        int number = input.nextInt();
        System.out.print("Menuo(skaiciumu): ");
        int menuo = input.nextInt();
        System.out.print("Diena: ");
        int diena = input.nextInt();
        int result = year - number;

        System.out.println("Jums yra " + result);
        System.out.println("Jusu gimimo data yra " + number + " " + menuo + " " + diena);
        if(menuo==3 || menuo == 4 ||  menuo==5){
            System.out.println("Jus gimes pavasario menesi! ");
        } else {
            if (menuo == 6 || menuo == 7 || menuo == 8) {
                System.out.println("Jus gimes vasaros menesi! ");
            } else {
                if (menuo == 9 || menuo == 10 || menuo == 11) {
                    System.out.println("Jus gimes rudens menesi! ");
                } else {
                    if (menuo == 12 || menuo == 1 || menuo == 2) {
                        System.out.println("Jus gimes ziemos menesi! ");
                    }


                }


            }
        }}}