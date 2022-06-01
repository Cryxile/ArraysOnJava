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

            operationsWithArray.printOriginalArray(arrayDimensionValue, randomValues);

            operationsWithArray.countOddAndEvenValuesOfArray(arrayDimensionValue, randomValues);

            operationsWithArray.printEvenValuesOfArray(arrayDimensionValue, randomValues);

            operationsWithArray.printOddValuesOfArray(arrayDimensionValue, randomValues);

            operationsWithArray.printAscendingSelectionSortedArray(arrayDimensionValue, randomValues);

            operationsWithArray.printDescendingSelectionSortedArray(arrayDimensionValue, randomValues);

            operationsWithArray.printAscendingBubbleSortedArray(arrayDimensionValue, randomValues);

            operationsWithArray.printDescendingBubbleSortedArray(arrayDimensionValue, randomValues);
        }

        operationsWithArray.printMinMaxAverageValuesOfArray(arrayDimensionValue,randomValues);
    }
}