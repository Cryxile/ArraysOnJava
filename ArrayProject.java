import java.util.Random;

public class ArrayProject {

    public static int[] arrayCreation(int arrayDimensionValue, int arrayMinRandomValue, int arrayMaxRandomValue) {

        Random rand = new Random();
        int[] randomValues = new int[arrayDimensionValue];
        for (int i = 0; i < arrayDimensionValue; i++) {                                    // Заполнение массива случайными числами
            randomValues[i] = Math.round(rand.nextInt(arrayMinRandomValue, arrayMaxRandomValue + 1));
        }
        return randomValues;
    }

    public static void main(String[] args) {

        InputWithCheck inputWithCheck = new InputWithCheck();

        System.out.print("Enter the dimension value of the array: ");
        int arrayDimensionValue = inputWithCheck.readAndCheckDimensionValue();

        System.out.print("Enter the minimal random value: ");
        int arrayMinRandomValue = inputWithCheck.readAndCheckMinAndMaxRandomValue();

        System.out.print("Enter the maximum random value: ");
        int arrayMaxRandomValue = inputWithCheck.readAndCheckMinAndMaxRandomValue();

        System.out.print("Do you want to print arrays to console? (y/n) ");
        String arrayPrintQuestion = inputWithCheck.readAndCheckPrintQuestionOfArray();


        int[] randomValues = arrayCreation(arrayDimensionValue, arrayMinRandomValue, arrayMaxRandomValue);

        OperationsWithArray operationsWithArray = new OperationsWithArray();

        if (arrayPrintQuestion.equals("y")) {                                              // Вывод значений массива в консоль

            operationsWithArray.printArray(randomValues);

            operationsWithArray.printEvenValuesOfArray(randomValues);

            operationsWithArray.printOddValuesOfArray(randomValues);

            operationsWithArray.printAscendingSelectionSortedArray(randomValues);

            operationsWithArray.printDescendingSelectionSortedArray(randomValues);

            operationsWithArray.printAscendingBubbleSortedArray(randomValues);

            operationsWithArray.printDescendingBubbleSortedArray(randomValues);
        }
        operationsWithArray.printMinMaxAverageValuesOfArray(randomValues);
    }
}