package CodeWars;

import java.util.HashMap;
import java.util.Map;


public class CodeWars_Counting_Duplicates {
    public static void main(String[] args) {
        String str = "abcdcbbbbbeeeFF";
        //Sukuriam hashmapa su Character key ir Integer Value
        Map<Character, Integer> result = new HashMap<>();
        int ats = 0;
        //Loopinam per stringa
        for (int i = 0; i < str.length(); i++) {
            //Paima pirma stringo reiksme
            char ch = str.charAt(i);
            //compute metodas paupdatina value reiksme jei ji nera lygi null
            //Jei randama ta pati raide stringe to key value padideda per viena
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);

        }
        //Iteratinam per hashmap ir jei randam, kad esamo key value yra daugiau uz viena- pasizymim tai atsakyme
        for (Map.Entry<Character, Integer> entry : result.entrySet())
            if (entry.getValue() > 1) {
                ats = ats + 1;
            }
        System.out.println(ats);

    }
}
// Kitas pavizdys naudojant while cikla ir substring metoda!
//    String text = "fqwfqwfqwfqwfQqwfqWeqweQweqFSAffasvadqwagqwqEgas";
//    int ans = 0;
//        text = text.toLowerCase();
//                while (text.length() > 0) {
//                //Susiranda pirmaja teksto raide
//                String firstLetter = text.substring(0, 1);
//                //Text kintamajam priskiria teksta be pirmos raides
//                text = text.substring(1);
//                //Tikrina ar textas turi symboliu lygiu - firstLetter
//                //Jei yra vienodu raidziu ans++
//                if (text.contains(firstLetter)) ans ++;
//                //Replacina visas vienodas raides tuscia vieta
//                //Sekanti loopa auto texto ilgis sumazeja
//                text = text.replace(firstLetter, "");
//                }
//                System.out.println(ans);





