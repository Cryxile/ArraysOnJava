public class ArrayPrint {

    private void arrayPrinter(int[] randomValues) {

        for (int i : randomValues) {
            System.out.print(i + "  ");
        }
    }

    public void printArray(int[] randomValues) {

        System.out.print("Array: \n");
        arrayPrinter(randomValues);
    }

    public void printEvenOddValues(int[] randomValues) {

        boolean sortTypeVar;
        OperationsWithArray operationsWithArray = new OperationsWithArray();

        System.out.print("\nArray even values: \n");
        sortTypeVar = true;
        arrayPrinter(operationsWithArray.sortEvenOddValues(randomValues, sortTypeVar));

        System.out.print("\nArray odd values: \n");
        sortTypeVar = false;
        arrayPrinter(operationsWithArray.sortEvenOddValues(randomValues, sortTypeVar));
    }

    public void printSelectionSort(int[] randomValues){

        boolean sortTypeVar;
        OperationsWithArray operationsWithArray = new OperationsWithArray();

        System.out.print("\nSorted ascending array (Selection): \n");
        sortTypeVar = true;
        arrayPrinter(operationsWithArray.doSelectionSort(randomValues, sortTypeVar));

        System.out.print("\nSorted descending array (Selection): \n");
        sortTypeVar = false;
        arrayPrinter(operationsWithArray.doSelectionSort(randomValues, sortTypeVar));
    }

    public void printBubbleSort(int[] randomValues) {

        boolean sortTypeVar;
        OperationsWithArray operationsWithArray = new OperationsWithArray();

        System.out.print("\nSorted ascending array (Bubble): \n");
        sortTypeVar = true;
        arrayPrinter(operationsWithArray.doBubbleSort(randomValues, sortTypeVar));

        System.out.print("\nSorted descending array (Bubble): \n");
        sortTypeVar = false;
        arrayPrinter(operationsWithArray.doBubbleSort(randomValues, sortTypeVar));
    }

    public void printMinMaxAverageValues(int[] randomValues) {

        OperationsWithArray operationsWithArray = new OperationsWithArray();

        float[] returnableValuesArray = operationsWithArray.calculateMinMaxAverageValues(randomValues);
        int arrayMaxValue = (int) returnableValuesArray[0];
        int arrayMinValue = (int) returnableValuesArray[1];
        float arrayAverageValue = returnableValuesArray[2];
        System.out.printf("\nMax value = %d \nMin value = %d \nAverage value = %.2f", arrayMaxValue, arrayMinValue, arrayAverageValue);
    }
}
