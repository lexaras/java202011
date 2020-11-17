package CodeWars;

import java.util.*;
import java.util.stream.*;

public class CodeWars_Unique_Number {
    public static void main(String[] args) {
        double[] skaiciai= {1, 1, 1, 3, 1, 1, 1 };
        //Prafiltruoja visus neigiamus skaicius
        //skaiciai = Arrays.stream(skaiciai).filter(x -> x > 0).toArray();
        Arrays.sort(skaiciai);
        int t = skaiciai.length-1;
        for(int i=0; i<skaiciai.length;i++){
            if(skaiciai[i]==skaiciai[i+1]){
                System.out.println(skaiciai[t]);
                break;
            } else{
                System.out.println(skaiciai[i]);
                break;
            }

            }
        }
    }

//            Arrays.sort(arr);
//            return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];