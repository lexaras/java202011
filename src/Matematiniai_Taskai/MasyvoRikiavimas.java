package Matematiniai_Taskai;

public class MasyvoRikiavimas {
    public static void main(String[] args) {
        int[] m = {-10, 0, 2, 9, -5};
        for (int i = 0; i < m.length; i++) {
            for (int j= i+1; j < m.length; j++){
                if(m[i]<m[j]) {
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]+ " ");
        }
    }
}