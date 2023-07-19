import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to my Number Array Sorter program!");
        System.out.println("Please, submit an array of randomly arranged numbers, separated by spaces: ");
        String input = scanner.nextLine();

        // Storing the user's input in a String Array, each element is separated by a space.
        String[] userInputArray = input.split(" ");
        // Creating an int array of the same length.
        int[] intArray = new int[userInputArray.length];

        // Looping through userInputArray, and parsing each element into an integer, and inserting them into the int array.
        for (int i = 0; i < userInputArray.length; i++) {
            intArray[i] = Integer.parseInt(userInputArray[i]);
        }

        System.out.println("Your provided array: " + Arrays.toString(intArray));

        char userInput;
        System.out.println("Would you like to sort the array in ascending or descending order? (a or d)");
        // Validating user's input.
        while (true) {
            String input2 = scanner.nextLine().toLowerCase();
            userInput = input2.charAt(0);
            if (userInput == 'a' || userInput == 'd') {
                break;
            }
            System.out.println("Wrong input, please respond with 'a' or 'd'.");
        }

        if (userInput == 'a') {
            bubbleSortAscending(intArray);
        } else {
            bubbleSortDescending(intArray);
        }

        System.out.println("Your output array: " + Arrays.toString(intArray));

        scanner.close();
    }

    private static void bubbleSortAscending(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping the array elements.
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

    }

    private static void bubbleSortDescending(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swapping the array elements.
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

    }

}