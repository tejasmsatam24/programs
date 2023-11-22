import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
public class Bow {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the sentence: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        ArrayList<String> strArray = new ArrayList<>();
        ArrayList<Integer> intArray = new ArrayList<>();
        String word = "";
        for(int i = 0; i < str.length(); i++) {
            if((!(String.valueOf(str.charAt(i)).equals(" ")))){
                word += str.charAt(i);
                if (i == str.length() - 1) {
                    strArray.add(word);
                }
            } else {
                strArray.add(word);
                word = "";
            }
        }
        System.out.println(strArray);
        for(int i = 0; i < strArray.size()-1; i++) {
            int count = 0;
            for(int j = 0; j < strArray.size(); j++) {
                if(strArray.get(i).equals(strArray.get(j))) {
                    count += 1;
                }
                intArray.add(count);
            }
        }
    }
}