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

        OperationsWithArray operationsWithArray = new OperationsWithArray();

        System.out.print("\nArray even values: \n");
        arrayPrinter(operationsWithArray.sortEvenOddValues(randomValues, true));

        System.out.print("\nArray odd values: \n");
        arrayPrinter(operationsWithArray.sortEvenOddValues(randomValues, false));
    }

    public void printSelectionSort(int[] randomValues){

        OperationsWithArray operationsWithArray = new OperationsWithArray();

        System.out.print("\nSorted ascending array (Selection): \n");
        arrayPrinter(operationsWithArray.doSelectionSort(randomValues, true));

        System.out.print("\nSorted descending array (Selection): \n");
        arrayPrinter(operationsWithArray.doSelectionSort(randomValues, false));
    }

    public void printBubbleSort(int[] randomValues) {

        OperationsWithArray operationsWithArray = new OperationsWithArray();

        System.out.print("\nSorted ascending array (Bubble): \n");
        arrayPrinter(operationsWithArray.doBubbleSort(randomValues, true));

        System.out.print("\nSorted descending array (Bubble): \n");
        arrayPrinter(operationsWithArray.doBubbleSort(randomValues, false));
    }

    public void printMinMaxAverageValues(int[] randomValues) {

        OperationsWithArray operationsWithArray = new OperationsWithArray();

        float[] returnableValuesArray = operationsWithArray.calculateMinMaxAverageValues(randomValues);
        System.out.printf("\nMax value = %d \nMin value = %d \nAverage value = %.2f", (int) returnableValuesArray[0], (int) returnableValuesArray[1], returnableValuesArray[2]);
    }
}
