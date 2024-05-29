public class SplitStringToArray {
    public static void main(String[] args) {
        // Initialize the string
        String s1 = "my name is ram";

        // Count the number of words by counting spaces and add 1
        int count = 1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                count++;
            }
        }

        // Create an array of strings to store the words
        String[] s2 = new String[count];

        // Iterate over the string to extract each word
        int wordIndex = 0;
        int startIndex = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                // Extract the word from the substring and store it in the array
                s2[wordIndex++] = s1.substring(startIndex, i);
                startIndex = i + 1;
            }
        }
        // Extract the last word from the substring and store it in the array
        s2[wordIndex] = s1.substring(startIndex);

        // Print the elements of the array
        for (int i = 0; i < s2.length; i++) {
            System.out.println("s2[" + i + "] = " + s2[i]);
        }
    }
}
