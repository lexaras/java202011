package CodeWars;

import java.util.*;
public class CodeWars_Counting_Sheeps {
    public static void main(String[] args) {
        int[] fS= {1,2};
        int[] sS= {3,4};
        int total = 15;
        int suma = 0;
        for(var i= 0; i<fS.length; i++){
            suma = suma + fS[i];
        }
        for(var j= 0; j<sS.length; j++){
            suma = suma + sS[j];
        }
        int ms= total -suma;
        System.out.println(ms);
        System.out.println( total - Arrays.stream(fS).sum() - Arrays.stream(sS).sum());
    }
}

// t - Arrays.stream(f).sum() - Arrays.stream(s).sum();