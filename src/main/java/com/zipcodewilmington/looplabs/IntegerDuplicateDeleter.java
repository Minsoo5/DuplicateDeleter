package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        String holder = "";
        int howManyToRemove = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter >= maxNumberOfDuplications) {
                    howManyToRemove++;
                }
            }
            if (counter < maxNumberOfDuplications) {
                holder += array[i] + " ";
            }
        }
        if (holder.length() == 0) {
            Integer[] emptyArr = new Integer[0];
            return emptyArr;
        }
        String[] stringArr = holder.split(" ");

        Integer[] result = new Integer[stringArr.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = Integer.valueOf(stringArr[i]);
            }
            return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String holder = "";
        int howManyToRemove = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter == exactNumberOfDuplications) {
                    howManyToRemove++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                holder += array[i] + " ";
            }
        }
        String[] stringArr = holder.split(" ");

        Integer[] result = new Integer[stringArr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.valueOf(stringArr[i]);
        }

        return result;
    }
}
