package Matematiniai_Taskai;

public class Demo2 {

    public static void main(String[] args) {
        long suma= 2;
        long bsuma= 3;
        for(int i=1; i<=64;i++){
            System.out.println("Ant " + i + " langelio guli tiek ryziu: ");
            if(i==1){
                System.out.println(i);
            } else{
                if(i==2){
                    System.out.println(2);
                } else{
                    suma = suma * 2;
                    System.out.println(suma);
                    bsuma= bsuma + suma;
                }

            }
        }
        System.out.println("Bendra grudu suma "  + bsuma);
    }
}
