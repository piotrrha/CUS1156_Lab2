/* Project: Git Lab
 * Class: UniqueWords.java
 * Author: Piotr Zedzian
 * Date: Fab 27 2025
 * This program will count the number of unique words in a list.
 */

import java.util.ArrayList;

public class UniqueWords {
    /**
     * Counts the number of unique strings in a list
     * @param list ArrayList of strings to be examined
     * @return number of unique strings in the list
     */
    public static int countUnique(ArrayList<String> list) {
        int count = 0;
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            boolean isUnique = true;

            // sees if the word is already in uniqueWords arraylist
            for (int j = 0; j < uniqueWords.size(); j++) {
                if (list.get(i).equals(uniqueWords.get(j))) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueWords.add(list.get(i));
                count++;
            }
        }
        return count;
    }
        //adds words to a new arraylist
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("blackboard");
        words.add("apple");
        words.add("orange");
        words.add("sun");
        words.add("moon");

        int unique = countUnique(words);
        System.out.println(words + " has " + unique + " unique words");
    }
}
