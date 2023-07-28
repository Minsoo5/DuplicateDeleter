package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String holder = "";
        int howManyToRemove = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
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
        if (holder.length() < 1) {
            String[] emptyString = new String[0];
            return emptyString;
        }
        String[] stringArr = holder.split(" ");

        return stringArr;
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String holder = "";
        int howManyToRemove = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
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

        return stringArr;
    }
}
