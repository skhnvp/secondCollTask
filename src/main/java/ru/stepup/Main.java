package ru.stepup;

/*
Перед вами код метода: реализации сортировки «пузырьком».

Перепишите код, чтобы вместо списка ArrayList<Integer> intList использовался массив int[] intArray.

public static void bubbleSort(ArrayList<Integer> intList) {
for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
}

public static void bubbleSort(int[] intArray) {
	// Реализовать сортировку для массива
}
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,5,3,1,10,8,2,4,7,9));

        System.out.println("List: " + list);
        bubbleSort(list);

        int[] intArray = {6,5,3,1,10,8,2,4,7,9};

        System.out.println("Array: " + Arrays.toString(intArray));
        bubbleSort(intArray);
    }
    public static void bubbleSort(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted: " + intList);
    }

    public static void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(intArray));
    }
}