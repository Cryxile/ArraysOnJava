import service.ArrayPrint;
import service.InputWithCheck;
import service.OperationsWithArray;

public class ArrayProject {

    public static void main(String[] args) {

        InputWithCheck inputWithCheck = new InputWithCheck();

        System.out.print("Enter the dimension value of the array: ");
        int arrayDimensionValue = inputWithCheck.readAndCheckIntFromConsole(true);

        System.out.print("Enter the minimal random value: ");
        int arrayMinRandomValue = inputWithCheck.readAndCheckIntFromConsole(false);

        System.out.print("Enter the maximum random value: ");
        int arrayMaxRandomValue = inputWithCheck.readAndCheckIntFromConsole(false);

        System.out.print("Do you want to print arrays to console? (y/n) ");
        boolean arrayPrintQuestion = inputWithCheck.readAndCheckStringFromConsole();


        ArrayPrint arrayPrint = new ArrayPrint();
        OperationsWithArray operationsWithArray = new OperationsWithArray();

        int[] randomValues = operationsWithArray.create(arrayDimensionValue, arrayMinRandomValue, arrayMaxRandomValue);

        if (arrayPrintQuestion) {

            System.out.print("Array: \n");
            arrayPrint.arrayPrinter(randomValues);

            System.out.print("\nArray even values: \n");
            arrayPrint.arrayPrinter(operationsWithArray.sortEvenOddValues(randomValues, true));

            System.out.print("\nArray odd values: \n");
            arrayPrint.arrayPrinter(operationsWithArray.sortEvenOddValues(randomValues, false));

            System.out.print("\nSorted ascending array (Selection): \n");
            arrayPrint.arrayPrinter(operationsWithArray.doSelectionSort(randomValues, true));

            System.out.print("\nSorted descending array (Selection): \n");
            arrayPrint.arrayPrinter(operationsWithArray.doSelectionSort(randomValues, false));

            System.out.print("\nSorted ascending array (Bubble): \n");
            arrayPrint.arrayPrinter(operationsWithArray.doBubbleSort(randomValues, true));

            System.out.print("\nSorted descending array (Bubble): \n");
            arrayPrint.arrayPrinter(operationsWithArray.doBubbleSort(randomValues, false));
        }

        float[] returnableValuesArray = operationsWithArray.calculateMinMaxAverageValues(randomValues);
        System.out.printf("\nMax value = %d \nMin value = %d \nAverage value = %.2f", (int) returnableValuesArray[0], (int) returnableValuesArray[1], returnableValuesArray[2]);
    }
}