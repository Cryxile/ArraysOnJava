public class OperationsWithArray {

    private int[] toPrintMethod; //что? метод? переменная, в которой массив назвывается "метод печатать"? ааа?

    public void arrayPrintMethod(int[] array) {

        for (int i : array) {
            System.out.print(i + "  ");
        }
    }

    public void printArray(int[] randomValues) {                        // Вывод массива

        System.out.print("Array: \n");
        arrayPrintMethod(randomValues);
    }

    public void printEvenValuesOfArray(int[] randomValues) {            // Вывод четных значений массива

        int arrayEvenValuesCount = 0;                           // через список!!

        for (int i : randomValues) {
            if (i % 2 == 0) {
                arrayEvenValuesCount++;
            }
        }

        int[] arrayEvenValues = new int[arrayEvenValuesCount]; // оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        int arrayElementNumber = 0;

        System.out.print("\nArray even values: \n");
        for (int i = 0; i < arrayEvenValuesCount; i++) {
            for (int j = arrayElementNumber; j < randomValues.length; j++) {
                int tempValue = randomValues[j];
                if (tempValue % 2 == 0) {
                    arrayEvenValues[i] = tempValue;
                    arrayElementNumber = j + 1;
                    break;
                }
            }
        }
        toPrintMethod = arrayEvenValues;
        arrayPrintMethod(toPrintMethod);
    }

    //подсказка. объедени и поставь внутри условие
    public void printOddValuesOfArray(int[] randomValues) {            // Вывод нечетных значений массива // оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        int arrayOddValuesCount = 0;// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        for (int i : randomValues) {// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
            if (i % 2 != 0) {// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
                arrayOddValuesCount++;// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
            }// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        }// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        int[] arrayOddValues = new int[arrayOddValuesCount];// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        int arrayElementNumber = 0;// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        System.out.print("\nArray odd values: \n");// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        for (int i = 0; i < arrayOddValuesCount; i++) {// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
            for (int j = arrayElementNumber; j < randomValues.length; j++) {// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
                int tempValue = randomValues[j];// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
                if (tempValue % 2 != 0) {// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
                    arrayOddValues[i] = tempValue;// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
                    arrayElementNumber = j + 1;// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
                    break;// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
                }// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
            }// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        }// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        toPrintMethod = arrayOddValues;// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
        arrayPrintMethod(toPrintMethod);// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай
    }// оооочень много повторяющегося кода. ООООЧОЕНЬ МНОГОГОГГГГОГОГОГОГОГОГОГОГГОГОГ сокращай

    public void printAscendingSelectionSortedArray(int[] randomValues) {               // СортировОчка (выбором) по возрастанию

        int[] selectionSortUp = new int[randomValues.length];

        System.out.print("\nSorted ascending array (Selection): \n");
        for (int i = 0; i < randomValues.length; i++) {
            int minValue = randomValues[i];
            int minValueNumber = i;
            for (int j = i + 1; j < randomValues.length; j++) {
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
            selectionSortUp[i] = randomValues[i];
        }
        toPrintMethod = selectionSortUp; //опять у тебя есть переменная, которую ты можешь напрямую передать, а ты используешь поле класса для этого. зачем? а еще это достаточно
                                        //опасно и неправильно. Опасно потому что где-то когда ты забудешь, что у тебя там массив и обратишься к нему, либо щабудешь заменить или еще
                                        //чего всякого может быть, а там старые данные. Неправильно, потому что ты пишешь универсальный класс для работы с массивами. Всеми. Всякими.
                                        //любыми. И тут у тебя в поле лежит какой-то непонятный странный массив. (а еще он нигде не нужен, но тебе он похоже очень понравился ;)))))) )
        arrayPrintMethod(toPrintMethod);
    }

    public void printDescendingSelectionSortedArray(int[] randomValues) {              // СортировОчка (выбором) по убыванию

        //int[] selectionSortDown = new int[randomValues.length];
       // int elementNumber = 0;

        System.out.print("\nSorted descending array (Selection): \n");
        for (int i = randomValues.length - 1; i >= 0; i--) {
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
           // selectionSortDown[elementNumber] = randomValues[i]; //по-моему, это тоже можно объеденить
            //elementNumber++;
        }
        arrayPrintMethod(randomValues);
    }

    public void printAscendingBubbleSortedArray(int[] randomValues) { //опять вопрос к названию. твой метод ничего не отрисовывает. он сортирует. То что ыт добавил в него отрисовку                  // СортировОчка (пузырьковая) по возрастанию
                                                                    //может не быть хорошо. Тут зависит от ситуаиции. И конкретно в этом случае я не вижу необходимости отрисовывать
                                                                    //массив при сортировке. Отсортируй, а потом отрисуй. А если ты разделишь эти два метода, то нужно будет данный метод
                                                                    //переименовать на просто "пузырьковая сортировка", а где-то снаружи потом после сортировки вызовешь отрисовку
        int[] bubbleSortUp = new int[randomValues.length];

        System.out.print("\nSorted ascending array (Bubble): \n");
        for (int i = 0; i < randomValues.length; i++) {
            for (int j = randomValues.length - 1; j > i; j--) {
                if (randomValues[j] < randomValues[j - 1]) {
                    int tempValue = randomValues[j - 1];
                    randomValues[j] = randomValues[j - 1];
                    randomValues[j - 1] = tempValue; // а вот тут новый код. объединять не с чем. оставляем
                }
            }
            bubbleSortUp[i] = randomValues[i];       // отрисовку в отдельный класс!!
        }
        toPrintMethod = bubbleSortUp; // ;(
        arrayPrintMethod(toPrintMethod);
    }

    public void printDescendingBubbleSortedArray(int[] randomValues) {                  // СортировОчка (пузырьковая) по убыванию

        int[] bubbleSortDown = new int[randomValues.length];
        int elementNumber = 0;

        System.out.print("\nSorted descending array (Bubble): \n");
        for (int i = randomValues.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randomValues[j] > randomValues[j + 1]) {
                    int tempValue = randomValues[j + 1];  //я поторопился :DDDD видел этот код где-то. Ну, ты знаешь, что делать
                    randomValues[j] = randomValues[j + 1];
                    randomValues[j + 1] = tempValue;
                }
            }
            bubbleSortDown[elementNumber] = randomValues[i];
            elementNumber++;
        }
        toPrintMethod = bubbleSortDown;
        arrayPrintMethod(toPrintMethod);
    }

    public void printMinMaxAverageValuesOfArray(int[] randomValues) {

        int arrayMaxValue = randomValues[0];
        int arrayMinValue = randomValues[0];
        float arrayAverageValue;
        float sumOfArrayValues = (float) randomValues[0];

        for (int i = 1; i < randomValues.length; i++) {
            if (arrayMaxValue < randomValues[i]) {                                                // Нахождение наибольшего значения
                arrayMaxValue = randomValues[i];
            }
            if (arrayMinValue > randomValues[i]) {                                                // Нахождение наименьшего значения
                arrayMinValue = randomValues[i];
            }
            sumOfArrayValues += (float) randomValues[i];
        }
        arrayAverageValue = sumOfArrayValues / randomValues.length;                               // Нахождение среднего значения
        System.out.printf("\nMax value = %d \nMin value = %d \nAverage value = %.2f", arrayMaxValue, arrayMinValue, arrayAverageValue);
    }
}
