
import java.util.Scanner;

public class Anagrams2 {

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
            return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        java.util.Map<Character,Integer> map = new java.util.HashMap<>();
        char letter;

        for(int i = 0; i<a.length(); i++)
        {
            letter = a.charAt(i);

            if (!map.containsKey(letter))
                map.put(letter, 1);
            else {
                Integer freq = map.get(letter);
                map.put(letter, ++freq);
            }
        }

        for(int i=0;i<b.length();i++)
        {
            letter=b.charAt(i);

            if(!map.containsKey(letter))
                return false;

            Integer freq=map.get(letter);
            if(freq==0)
                return false;
            else
                map.put(letter,--freq);

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}