import java.util.HashSet;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniquecharacter("java"));
    }
    public static boolean uniquecharacter (String word){
        HashSet alphaSet=new HashSet();
        for (int index=0;index<word.length();index++){
            char c= word.charAt(index);
            if (!alphaSet.add(c))
                return false;
        }
        return true;
    }
}
