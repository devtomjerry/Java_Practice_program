public class StringsAreAnagram {
    public static void main(String[] args) {
            String word = "jay";
            String anagram = "iyjl";
            System.out.println("Anagram :" + Anagram(word, anagram));
    }
    public static boolean Anagram (String word, String anagram){
            if (word.length() != anagram.length())
                return false;
            for (int i=0; i< word.length();i++){
                char c = word.charAt(i);
                int index = anagram.indexOf(c);
                if (index != -1){
                    anagram = anagram.substring(0, index) + anagram.substring(index + 1 ,anagram.length());}
                else
                    return false;
            }
            return anagram.isEmpty();
    }
}
