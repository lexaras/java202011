package Matematiniai_Taskai;

public class Vidurkis {
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        double Asuma = 0;
        double Bsuma = 0;
        double Avid;
        double Bvid;
        double skirtumas;
        for (int i = 0; i < a.length; i++) {
            Asuma = Asuma + a[i];
        }
        for (int j = 0; j < b.length; j++) {
            Bsuma = Bsuma + b[j];
        }
        Avid = Asuma / a.length;
        Bvid = Bsuma / b.length;
        skirtumas = Avid - Bvid;
        System.out.println("Skirtumas tarp masyvo vidurkiu = " + skirtumas);
    }
}
