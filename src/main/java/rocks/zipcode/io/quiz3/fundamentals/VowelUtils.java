package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        if (word.contains("A") || word.contains("E") || word.contains("I") || word.contains("O") || word.contains("U") || word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")){
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] array = word.toCharArray();
        Integer indexOfFirstVowel = null;
        for (int i = 0; i < word.length(); i++){
            if (array[i] == 'A' || array[i] == 'E' ||array[i] == 'I' ||array[i] == 'O' ||array[i] == 'U' ||array[i] == 'a' ||array[i] == 'e' ||array[i] == 'i' ||array[i] == 'o' ||array[i] == 'u'){
                indexOfFirstVowel = i;
                return indexOfFirstVowel;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return (getIndexOfFirstVowel(word) == 0);

    }

    public static Boolean isVowel(Character character) {
        return (hasVowels(character.toString()));
    }
}
