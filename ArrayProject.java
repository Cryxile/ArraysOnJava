public class ArrayProject {

    public static void main(String[] args) {

        InputWithCheck inputWithCheck = new InputWithCheck();

        System.out.print("Enter the dimension value of the array: ");
        int arrayDimensionValue = inputWithCheck.readAndCheckIntFromConsole(true);

        System.out.print("Enter the minimal random value: ");
        int arrayMinRandomValue = inputWithCheck.readAndCheckIntFromConsole(false);         //А лучше еще больше обобщить и назвать readValueFromConsole.
                                                                                                        //чтобы потом применять его и к int и к String и к чему угодно (потом расскажу как)

                                                                                                        //Ну тогда я жду :D (P.s. DimAss)

        System.out.print("Enter the maximum random value: ");
        int arrayMaxRandomValue = inputWithCheck.readAndCheckIntFromConsole(false);

        System.out.print("Do you want to print arrays to console? (y/n) ");
        boolean arrayPrintQuestion = inputWithCheck.readAndCheckStringFromConsole();


        OperationsWithArray operationsWithArray = new OperationsWithArray();

        int[] randomValues = operationsWithArray.create(arrayDimensionValue, arrayMinRandomValue, arrayMaxRandomValue);

        ArrayPrint arrayPrint = new ArrayPrint();

        if (arrayPrintQuestion) {

            arrayPrint.printArray(randomValues);

            arrayPrint.printEvenOddValues(randomValues);

            arrayPrint.printSelectionSort(randomValues);

            arrayPrint.printBubbleSort(randomValues);
        }
        arrayPrint.printMinMaxAverageValues(randomValues);
    }
}