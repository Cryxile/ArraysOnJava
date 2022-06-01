public class OperationsWithArray {

    private static int arrayEvenValuesCount;

    private static int arrayOddValuesCount;

    public void printOriginalArray(int arrayDimensionValue, int[] randomValues) {               // Вывод оригинального массива
        System.out.print("Original array: \n");
        for (int i = 0; i < arrayDimensionValue; i++) {
            System.out.print(randomValues[i] + "  ");
        }
    }

    public void countOddAndEvenValuesOfArray(int arrayDimensionValue, int[] randomValues) {     // Подсчёт четных и нечетных значений

        arrayEvenValuesCount = 0;
        arrayOddValuesCount = 0;

        for (int i = 0; i < arrayDimensionValue; i++) {
            int tempValue = randomValues[i];
            if (tempValue % 2 == 0) {
                arrayEvenValuesCount += 1;
            }
            else {
                arrayOddValuesCount += 1;
            }
        }
    }
    public void printEvenValuesOfArray(int arrayDimensionValue, int[] randomValues) {            // Вывод четных значений массива

        int[] arrayEvenValues = new int[arrayEvenValuesCount];
        int arrayElementNumber = 0;

        System.out.print("\nArray even values: \n");
        for (int i = 0; i < arrayEvenValuesCount; i++) {
            for (int j = arrayElementNumber; j < arrayDimensionValue; j++) {
                int tempValue = randomValues[j];
                if (tempValue % 2 == 0) {
                    arrayEvenValues[i] = tempValue;
                    arrayElementNumber = j + 1;
                    break;
                }
            }
            System.out.print(arrayEvenValues[i] + "  ");
        }
    }

    public void printOddValuesOfArray(int arrayDimensionValue, int[] randomValues) {            // Вывод нечетных значений массива

        int[] arrayOddValues = new int[arrayOddValuesCount];
        int arrayElementNumber = 0;

        System.out.print("\nArray odd values: \n");
        for (int i = 0; i < arrayOddValuesCount; i++) {
            for (int j = arrayElementNumber; j < arrayDimensionValue; j++) {
                int tempValue = randomValues[j];
                if (tempValue % 2 != 0) {
                    arrayOddValues[i] = tempValue;
                    arrayElementNumber = j + 1;
                    break;
                }
            }
            System.out.print(arrayOddValues[i] + "  ");
        }
    }

    public void printAscendingSelectionSortedArray(int arrayDimensionValue, int[] randomValues) {               // СортировОчка (выбором) по возрастанию

        System.out.print("\nSorted ascending array (Selection): \n");
        for (int i = 0; i < arrayDimensionValue; i++) {
            int minValue = randomValues[i];
            int minValueNumber = i;
            for (int j = i + 1; j < arrayDimensionValue; j++) {
                if (randomValues[j] < minValue) {
                    minValue = randomValues[j];
                    minValueNumber = j;
                }
            }
            if (i != minValueNumber) {
                int tempVariable = randomValues[i];
                randomValues[i] = minValue;
                randomValues[minValueNumber] = tempVariable;
            }
            System.out.print(randomValues[i] + "  ");
        }
    }

    public void printDescendingSelectionSortedArray(int arrayDimensionValue, int[] randomValues) {              // СортировОчка (выбором) по убыванию

        System.out.print("\nSorted descending array (Selection): \n");
        for (int i = arrayDimensionValue - 1; i >= 0; i--) {
            int maxValue = randomValues[i];
            int maxValueNumber = i;
            for (int j = 0; j < i; j++) {
                if (randomValues[j] > maxValue) {
                    maxValue = randomValues[j];
                    maxValueNumber = j;
                }
            }
            if (i != maxValueNumber) {
                int tempVariable = randomValues[i];
                randomValues[i] = maxValue;
                randomValues[maxValueNumber] = tempVariable;
            }
            System.out.print(randomValues[i] + "  ");
        }
    }

    public void printAscendingBubbleSortedArray(int arrayDimensionValue, int[] randomValues) {                  // СортировОчка (пузырьковая) по возрастанию

        System.out.print("\nSorted ascending array (Bubble): \n");
        for (int i = 0; i < arrayDimensionValue; i++) {
            for (int j = arrayDimensionValue - 1; j > i; j--) {
                if (randomValues[j] < randomValues[j - 1]) {
                    int tempValue = randomValues[j - 1];
                    randomValues[j] = randomValues[j - 1];
                    randomValues[j - 1] = tempValue;
                }
            }
            System.out.print(randomValues[i] + "  ");
        }
    }

    public void printDescendingBubbleSortedArray(int arrayDimensionValue, int[] randomValues) {                  // СортировОчка (пузырьковая) по убыванию

        System.out.print("\nSorted descending array (Bubble): \n");
        for (int i = arrayDimensionValue - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randomValues[j] > randomValues[j + 1]) {
                    int tempValue = randomValues[j + 1];
                    randomValues[j] = randomValues[j + 1];
                    randomValues[j + 1] = tempValue;
                }
            }
            System.out.print(randomValues[i] + "  ");
        }
    }

    public void printMinMaxAverageValuesOfArray(int arrayDimensionValue,int[] randomValues) {

        int arrayMaxValue = randomValues[0];
        int arrayMinValue = randomValues[0];
        float arrayAverageValue;
        float sumOfArrayValues = (float) randomValues[0];

        for (int i = 1; i < arrayDimensionValue; i++) {
            if (arrayMaxValue < randomValues[i]) {                                                // Нахождение наибольшего значения
                arrayMaxValue = randomValues[i];
            }
            if (arrayMinValue > randomValues[i]) {                                                // Нахождение наименьшего значения
                arrayMinValue = randomValues[i];
            }
            sumOfArrayValues += (float) randomValues[i];
        }
        arrayAverageValue = sumOfArrayValues / arrayDimensionValue;                               // Нахождение среднего значения
        System.out.printf("\nMax value = %d \nMin value = %d \nAverage value = %.2f", arrayMaxValue, arrayMinValue, arrayAverageValue);

    }

}
