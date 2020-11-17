package CodeWars;

import java.util.*;
//Given an array of integers , Find the minimum sum
// which is obtained from summing each Two integers product .
//minSum({5,4,2,3}) ==> return (22)  minSum({12,6,10,26,3,24}) ==> return (342)
//Logika, kad susisortinus ir surasius puse ilgio eiti per cikla
//Dauginant maziausia[0] ciklo skaiciu su didziausiu[array.length-1] ir taip einant palaipsniui
//Kol baigiasi ciklas(while(array.length/2>0)
public class CodeWars_Minimize_Sum {
    public static void main(String[] args) {
        int[] sk = {12,6,10,26,3,24};
        Arrays.sort(sk);
        int ilgis = sk.length-1;
        int pirmas = 0;
        int suma = 0;
        int rod = sk.length / 2;
        while (rod > 0) {
            suma = suma + sk[pirmas] * sk[ilgis];
            pirmas = pirmas + 1;
            ilgis = ilgis - 1;
            rod = rod - 1;
        }
        System.out.println(suma);
    }
}

