package Matematiniai_Taskai;

public class Trikampiai {
    public static void main(String[] args) {
        int a = 3;int b = 4;int c = 5;
        //int a = 2; int b= 10;  int c = 8;
        //int a = 5; int b= 6;  int c = 5;
        // int a = 5; int b= 5;  int c = 5;
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.print("Su sitais duomenis: " + a + " " + b + " " + c + " gaunasi trikampis! Kurio plotas : ");
            double p = 0;
            double plotas = 0;
            p = (a + b + c) / 2;
            plotas = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Plotas" + " " + plotas);
            if (a == b && a == c && b == c) {
                System.out.println("Tipas-Lygiasonis");
            } else {
                if (a == b || a == c || b == c) {
                    System.out.println("Tipas-Lygiakrastis");
                } else {
                    System.out.println("Tipas-Ivairiakrastis");
                }
            }
        } else {
            System.out.println("Nesigauna trikampis!");
        }



    }
}
