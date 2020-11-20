package Matematiniai_Taskai;

public class Test_Git {
    public static void main(String[] args) {
        System.out.println(faktorialas(4));
    }

    static int faktorialas(int x){
       if(x==2) return 2;
       return x* faktorialas(x-1);
        }
}


