//bandymas paeditinti per brancha ir commitinti i master
package Matematiniai_Taskai;

public class Daugybos_lentele {
    public static void main(String[] args) {
        //for(var i= 1; i<=9; i++){
        daugyba();
        //}


    }

    //    static void daugyba(int sk){
//        for(var i=1; i<=9; i++){
//            int suma= sk * i;
//            System.out.println(sk +  " * " + i + " = " + suma);
//        }
//    }
    static void daugyba() {
        for (var i = 1; i <= 9; i++) {
            for (var j = 1; j <= 3; j++) {
                int suma = j * i;
                if (suma < 10) {
                    System.out.print(j + " * " + i + " = " + " " + suma + " ");
                } else {
                    System.out.print(j + " * " + i + " = " + suma + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (var i = 1; i <= 9; i++) {
            for (var j = 4; j <= 6; j++) {
                int suma = j * i;
                if (suma < 10) {
                    System.out.print(j + " * " + i + " = " + " " + suma + " ");
                } else {
                    System.out.print(j + " * " + i + " = " + suma + " ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for (var i = 1; i <= 9; i++) {
            for (var j = 7; j <= 9; j++) {
                int suma = j * i;
                if (suma < 10) {
                    System.out.print(j + " * " + i + " = " + " " + suma + " ");
                } else {
                    System.out.print(j + " * " + i + " = " + suma + " ");
                }

            }
            System.out.println();
        }

    }
}


