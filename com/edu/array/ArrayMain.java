package com.edu.array;

public class ArrayMain {
    public static void main(String[] args) {

        int[] num = {1, 2, 2, 3, 4, 4, 5, 1, 2, 6, 7, 6}; // Example array
        findDuplicateElements(num); // output

        // No of Duplicate Elements found: 4
        // 1 2 4 6


        int[] num1 = {1, 2, 3, 4, 5};
        findDuplicateElements(num1);
        //No of Duplicate Elements found: 0
        //Duplicate Elements not  found: 0

    }

    public static void findDuplicateElements(int[] arr) {
        int[] duplicateElements = new int[arr.length];
        int duplicateElementCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean foundDuplicate = false;
            boolean duplicateAlreadyAdded = false;
            for (int k = 0; k < duplicateElements.length; k++) {
                if (duplicateElements[k] == arr[i]) {
                    duplicateAlreadyAdded = true;
                    break;
                }
            }
            if (duplicateAlreadyAdded) continue;
            // Start inner loop from i+1 to avoid self-comparison and repeated checks
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    foundDuplicate = true;
                    // No need to continue checking once a duplicate is found for the element
                    break;

                }
            }
            if (foundDuplicate) {
                duplicateElements[duplicateElementCount] = arr[i];
                duplicateElementCount++;
                System.out.println("duplicate Elements: " + arr[i]);
            }
        }

        System.out.println("No of Duplicate Elements found: " + duplicateElementCount);
        if (duplicateElementCount > 0) {
            for (int i = 0; i < duplicateElementCount; i++) {
                System.out.print(duplicateElements[i] + " ");
            }
            System.out.println();

        } else {
            System.out.println("Duplicate Elements not  found: " + duplicateElements[duplicateElementCount]);
        }
    }
}
