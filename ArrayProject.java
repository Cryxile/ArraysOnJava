import java.util.*;

public class ArrayProject {

    public static void main(String[] args) {
        //input from console min val - v
        //input from console max val - v
        //input from console array volume - v
        //запросить у пользователя желает ли он вывод массива в консоль - v
        //сортировОЧКу - v

        int arrayDimensionValue = 0;
        int arrayMinRandomValue = 0;
        int arrayMaxRandomValue = 0;
        int arrayMaxValue;
        int arrayMinValue;
        float arrayAverageValue;
        String arrayPrintQuestion = "";
        Scanner inputScanner = new Scanner(System.in);

        boolean correctInput = false;
        while (!correctInput) {
            System.out.print("Enter the dimension value of the array: "); // сейчас ты вводишь неправильные символы и только после ввода всех символов утебя выскакивает "wrong symbol"
            String arrayDimensionValueStr = inputScanner.nextLine(); //сделай так, чтобы сразу же после ввода хотя бы одного неправильно значения у тебя перезапускался весь блок ввода
            // спойлер: нужно сделать здесь же в цикле, с 1 try catch, скомбинировав твой прошлый подход и текущий
            System.out.print("Enter the minimal random value: ");
            String arrayMinRandomValueStr = inputScanner.nextLine();

            System.out.print("Enter the maximum random value: ");
            String arrayMaxRandomValueStr = inputScanner.nextLine();

            System.out.print("Do you want to print array to console? (y/n) ");
            String arrayPrintQuestionStr = inputScanner.nextLine();

            try {
                arrayDimensionValue = Integer.parseInt(arrayDimensionValueStr);
                arrayMinRandomValue = Integer.parseInt(arrayMinRandomValueStr);
                arrayMaxRandomValue = Integer.parseInt(arrayMaxRandomValueStr);
                arrayPrintQuestion = arrayPrintQuestionStr;
                if (!arrayPrintQuestion.equals("y") && !arrayPrintQuestion.equals("n") || arrayDimensionValue < 1) {
                    throw new Exception();
                }
                correctInput = true;
            } catch (Exception e) {
                System.out.println("Wrong symbols!");
                correctInput = false;
            }
        }

        Random rand = new Random();
        int[] randomValues = new int[arrayDimensionValue];

        for (int i = 0; i < arrayDimensionValue; i++) {                                    // Заполнение массива случайными числами
            randomValues[i] = Math.round(rand.nextInt(arrayMinRandomValue, arrayMaxRandomValue + 1));
        }

        if (arrayPrintQuestion.equals("y")) {                                              // Вывод значений массива в консоль
            System.out.print("Original array: \n");                                        // Вывод оригинального массива
            for (int i = 0; i < arrayDimensionValue; i++) {
                System.out.print(randomValues[i] + "  ");
            }

            int arrayEvenValuesCount = 0;
            int arrayOddValuesCount = 0;

            for (int i = 0; i < arrayDimensionValue; i++) {                                 // Подсчёт четных и нечетных значений
                int tempValue = randomValues[i];
                if (tempValue % 2 == 0) {
                    arrayEvenValuesCount += 1;
                }
                else {
                    arrayOddValuesCount += 1;
                }
            }

            int[] arrayEvenValues = new int[arrayEvenValuesCount];
            int[] arrayOddValues = new int[arrayOddValuesCount];
            int arrayElementNumber = 0;

            System.out.print("\nArray even values: \n");                                    // Вывод четных значений массива
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

            arrayElementNumber = 0;

            System.out.print("\nArray odd values: \n");                                       // Вывод нечетных значений массива
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

            System.out.print("\nSorted ascending array (Selection): \n");                     // СортировОчка (выбором) по возрастанию
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

            System.out.print("\nSorted descending array (Selection): \n");                     // СортировОчка (выбором) по убыванию
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

            System.out.print("\nSorted ascending array (Bubble): \n");                          // СортировОчка (пузырьковая) по возрастанию
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

            System.out.print("\nSorted descending array (Bubble): \n");                         // СортировОчка (пузырьковая) по убыванию
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

        arrayMinValue = arrayMaxValue = randomValues[0];
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
        System.out.printf("\nMax value = %d \nMin value = %d \nAverage value = %.2f", arrayMaxValue, arrayMinValue,  arrayAverageValue);
        inputScanner.close();
    }

}

// 5 7 2 6 1 2
//           n
// 5 2 7 6 1 2
// 5 2 6 7 1 2
// 5 2 6 1 7 2
// 5 2 6 1 2 7
//         n
// 2 5 6 1 2 7
// 2 5 1 6 2 7
// 2 5 1 2 6 7
//       n
// 2 1 5 2 6 7
// 2 1 2 5 6 7
//     n
// 1 2 2 5 6 7