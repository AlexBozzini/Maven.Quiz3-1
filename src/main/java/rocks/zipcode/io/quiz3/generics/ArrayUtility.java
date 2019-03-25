package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (int i = 0; i < array.length; i++){
            int count = 0;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count % 2 != 0){
                return array[i];

            }
        }        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (int i = 0; i < array.length; i++){
            int count = 0;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count % 2 == 0){
                return array[i];

            }
        }        return null;

    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (valueToEvaluate == array[i])
                count++;
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> filtered = new ArrayList<>();

        for (SomeType type : array){
            if (predicate.apply(type)){
                filtered.add(type);
            }
        }

        SomeType[] newArray = Arrays.copyOf(array, filtered.size());
        return filtered.toArray(newArray);
    }
}

