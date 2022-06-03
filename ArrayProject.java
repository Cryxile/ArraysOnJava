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
        int arrayMinRandomValue = inputWithCheck.readAndCheckMinAndMaxRandomValue(); // это метод, который просто принимает число с клавиатуры. То, что ты его используешь для определения
                                                                                    //минимального и максимального рандомного значения не отменяет его смысла: просто ввод числа с
                                                                                    //клавиатуры. А значит почему бы не назвать этот метод как-нибудь типа:
                                                                                    //readIntFromConsole()? А лучше еще больше обобщить и назвать readValueFromConsole.
                                                                                    //чтобы потом применять его и к int и к String и к чему угодно (потом расскажу как)

        System.out.print("Enter the maximum random value: ");
        int arrayMaxRandomValue = inputWithCheck.readAndCheckMinAndMaxRandomValue();

        System.out.print("Do you want to print arrays to console? (y/n) ");
        String arrayPrintQuestion = inputWithCheck.readAndCheckPrintQuestionOfArray(); // я бы вообще избавился и как-то по-другому сделал эту часть, но давай доведем ее до ума.
                                                                                        //Что делает твой метод? В чем его смысл? Добиться от пользователя правильного ввода ответа
                                                                                        //на твой вопрос. Т.е. ты ждешь от пользователя ответа да или нет. Ответ да или нет конечно похож
                                                                                        //на строку, но он еще больше похож на кое-что другое. Отгадай на что он больше похож и поправь


        int[] randomValues = arrayCreation(arrayDimensionValue, arrayMinRandomValue, arrayMaxRandomValue);

        OperationsWithArray operationsWithArray = new OperationsWithArray();

        if (arrayPrintQuestion.equals("y")) {  //некорректная проверка, если ты поправишь метод   readAndCheckPrintQuestionOfArray                                          // Вывод значений массива в консоль

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