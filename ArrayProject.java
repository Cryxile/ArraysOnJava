public class ArrayProject {


    public static void main(String[] args) {

        InputWithCheck inputWithCheck = new InputWithCheck();

        System.out.print("Enter the dimension value of the array: ");
        int arrayDimensionValue = inputWithCheck.readAndCheckDimensionValue();

        System.out.print("Enter the minimal random value: ");
        int arrayMinRandomValue = inputWithCheck.readAndCheckMinAndMaxRandomValue(); // это метод, который просто принимает число с клавиатуры. То, что ты его используешь для определения
                                                                                    //минимального и максимального рандомного значения не отменяет его смысла: просто ввод числа с
                                                                                    //клавиатуры. А значит почему бы не назвать этот метод как-нибудь типа:
                                                                                    //readIntFromConsole()? А лучше еще больше обобщить и назвать readValueFromConsole.
                                                                                    //чтобы потом применять его и к int и к String и к чему угодно (потом расскажу как)

        System.out.print("Enter the maximum random value: ");
        int arrayMaxRandomValue = inputWithCheck.readAndCheckMinAndMaxRandomValue();

        System.out.print("Do you want to print arrays to console? (y/n) ");
        boolean arrayPrintQuestion = inputWithCheck.readAndCheckPrintQuestionOfArray(); // я бы вообще избавился и как-то по-другому сделал эту часть, но давай доведем ее до ума.
                                                                                        //Что делает твой метод? В чем его смысл? Добиться от пользователя правильного ввода ответа
                                                                                        //на твой вопрос. Т.е. ты ждешь от пользователя ответа да или нет. Ответ да или нет конечно похож
                                                                                        //на строку, но он еще больше похож на кое-что другое. Отгадай на что он больше похож и поправь


        OperationsWithArray operationsWithArray = new OperationsWithArray();

        int[] randomValues = operationsWithArray.create(arrayDimensionValue, arrayMinRandomValue, arrayMaxRandomValue);

        ArrayPrint arrayPrint = new ArrayPrint();

        if (arrayPrintQuestion) {                                            // Вывод значений массива в консоль

            arrayPrint.printArray(randomValues);

            arrayPrint.printEvenOddValues(randomValues);

            arrayPrint.printSelectionSort(randomValues);

            arrayPrint.printBubbleSort(randomValues);
        }
        arrayPrint.printMinMaxAverageValues(randomValues);
    }
}