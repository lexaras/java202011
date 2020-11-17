package Matematiniai_Taskai;//Tobuluoju skaičiumi vadinamas natūralusis skaičius, lygus visų savo daliklių,
//mažesnių už save patį, sumai.
//pvz 28 = 1 + 2 + 4 + 7 + 14
//Suraskite visus tokius skaičius iš intervalo 1…1000.

public class Perfect_Number {

    public static void main(String[] args) {
        System.out.print("The list of perfect numbers: ");
        //Ciklinam per skaicius nuo 1 iki tukstancio(1
        for (int i = 1; i < 1000; i++) {
            int sum = 0;
            //Ieskom esamo skaiciaus dalikliu ir jei juos randam- sumuojam
            // j<=i-1 -> Dalikliai turi buti mazesni uz save pati
            for (int j = 1; j <= i - 1; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.print(sum + " ");
            }
        }

    }
}





