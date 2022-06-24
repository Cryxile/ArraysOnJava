import java.util.Random;

public class OperationsWithArray {

    private int firstSwappableElement;
    private int secondSwappableElement;
    private int arrayEvenValuesCount;
    private int arrayOddValuesCount;

    public int[] create(int arrayDimensionValue, int arrayMinRandomValue, int arrayMaxRandomValue) {
        Random rand = new Random();
        int[] randomValues = new int[arrayDimensionValue];
        for (int i = 0; i < arrayDimensionValue; i++) {
            randomValues[i] = Math.round(rand.nextInt(arrayMinRandomValue, arrayMaxRandomValue + 1));
        }
        return randomValues;
    }

    private void countEvenOddValues(int[] randomValues) {
        arrayEvenValuesCount = 0;
        arrayOddValuesCount = 0;

        for (int arrayElement : randomValues) {
            if (arrayElement % 2 == 0) {
                arrayEvenValuesCount++;
            }
            else {
                arrayOddValuesCount++;
            }
        }
    }

    public int[] sortEvenOddValues(int[] randomValues, boolean sortTypeVar) {
        countEvenOddValues(randomValues);

        int[] arrayEvenValues = new int[arrayEvenValuesCount];
        int[] arrayOddValues = new int[arrayOddValuesCount];
        int evenElementNumber = 0;
        int oddElementNumber = 0;

        for (int arrayElement : randomValues) {
            if (arrayElement % 2 == 0 && arrayEvenValuesCount != evenElementNumber) {
                arrayEvenValues[evenElementNumber] = arrayElement;
                evenElementNumber++;
            }
            else if (arrayElement % 2 != 0 && arrayOddValuesCount != oddElementNumber) {
                arrayOddValues[oddElementNumber] = arrayElement;
                oddElementNumber++;
            }
        }

        if (sortTypeVar) {
            return arrayEvenValues;
        }
        else {
            return arrayOddValues;
        }
    }

    public int[] doSelectionSort(int[] randomValues, boolean sortTypeVar) {
        for (int i = 0; i < randomValues.length; i++) {
            int limitValue = randomValues[i];
            int limitValueNumber = i;
            for (int j = i + 1; j < randomValues.length; j++) {
                if (sortTypeVar) {
                    if (randomValues[j] < limitValue) {
                        limitValue = randomValues[j];
                        limitValueNumber = j;
                    }
                }
                else {
                    if (randomValues[j] > limitValue) {
                        limitValue = randomValues[j];
                        limitValueNumber = j;
                    }
                }
            }
            if (i != limitValueNumber) {
                int tempVariable = randomValues[i];
                randomValues[i] = limitValue;
                randomValues[limitValueNumber] = tempVariable;
            }
        }
        return randomValues;
    }

    private void swapArrayElementsInBubbleSort(int firstValue, int secondValue) {
        firstSwappableElement = secondValue;
        secondSwappableElement = firstValue;
    }

    public int[] doBubbleSort(int[] randomValues, boolean sortTypeVar) {
        for (int i = 0; i < randomValues.length; i++) {
            for (int j = randomValues.length - 1; j > i; j--) {
                if (sortTypeVar) {
                    if (randomValues[j] < randomValues[j - 1]) {
                        swapArrayElementsInBubbleSort(randomValues[j], randomValues[j - 1]);
                        randomValues[j] = firstSwappableElement;
                        randomValues[j - 1] = secondSwappableElement;
                    }
                } else {
                    if (randomValues[j] > randomValues[j - 1]) {
                        swapArrayElementsInBubbleSort(randomValues[j], randomValues[j - 1]);
                        randomValues[j] = firstSwappableElement;
                        randomValues[j - 1] = secondSwappableElement;
                    }
                }
            }
        }
        return randomValues;
    }

    public float[] calculateMinMaxAverageValues(int[] randomValues) {
        int arrayMaxValue = randomValues[0];
        int arrayMinValue = randomValues[0];
        float sumOfArrayValues = (float) randomValues[0];
        float[] returnableValuesArray = new float[3];

        for (int i = 1; i < randomValues.length; i++) {
            if (arrayMaxValue < randomValues[i]) {
                arrayMaxValue = randomValues[i];
            }
            if (arrayMinValue > randomValues[i]) {
                arrayMinValue = randomValues[i];
            }
            sumOfArrayValues += (float) randomValues[i];
        }

        returnableValuesArray[0] = arrayMaxValue;
        returnableValuesArray[1] = arrayMinValue;
        returnableValuesArray[2] = sumOfArrayValues / randomValues.length;

        return returnableValuesArray;
    }
}