package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if (VowelUtils.startsWithVowel(word)){
                builder.append(word + "way" + " ");
            } else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (vowelIndex == -1) {
                    builder.append(word + "ay" + " ");
                } else {
                    String beginning = word.substring(0, vowelIndex);
                    String ending = word.substring(vowelIndex);
                    String finalWord = ending + beginning + "ay";
                    builder.append(finalWord + " ");
                }
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
