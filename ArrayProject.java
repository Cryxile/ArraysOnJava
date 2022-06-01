import java.util.*;


public class ArrayProject {

    public static void main(String[] args) {

        InputWithCheck inputWithCheck = new InputWithCheck();
        int arrayDimensionValue = inputWithCheck.readAndCheckDimensionValue();
        int arrayMinRandomValue = inputWithCheck.readAndCheckMinRandomValueOfArray();
        int arrayMaxRandomValue = inputWithCheck.readAndCheckMaxRandomValueOfArray();
        String arrayPrintQuestion = inputWithCheck.readAndCheckPrintQuestionOfArray();

        Random rand = new Random();
        int[] randomValues = new int[arrayDimensionValue];
        for (int i = 0; i < arrayDimensionValue; i++) {                                    // Заполнение массива случайными числами
            randomValues[i] = Math.round(rand.nextInt(arrayMinRandomValue, arrayMaxRandomValue + 1));
        }

        OperationsWithArray operationsWithArray = new OperationsWithArray();

        if (arrayPrintQuestion.equals("y")) {                                              // Вывод значений массива в консоль

            operationsWithArray.printArray(randomValues);

            operationsWithArray.countOddAndEvenValuesOfArray(randomValues);

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