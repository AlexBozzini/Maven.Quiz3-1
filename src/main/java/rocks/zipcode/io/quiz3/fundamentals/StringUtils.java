package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] charArray = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++){
            if (i == indexToCapitalize){
                String ch = Character.toString(charArray[i]);
                builder.append(ch.toUpperCase());
            } else {
                builder.append(charArray[i]);
            }
        }
        return builder.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (characterToCheckFor.equals(baseString.charAt(indexOfString)));

    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length(); i++){
            for (int j = i + 1; j <= string.length(); j++){
                String sub = string.substring(i, j);
                list.add(sub);
            }
        }
        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
