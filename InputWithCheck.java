import java.util.Scanner;

public class InputWithCheck {

    Scanner inputScanner = new Scanner(System.in);

    public int readAndCheckDimensionValue() {

        int arrayDimensionValue;

        while (true) {
            try {
                System.out.print("Enter the dimension value of the array: ");
                arrayDimensionValue = Integer.parseInt(inputScanner.nextLine());
                if (arrayDimensionValue < 1) {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Wrong symbols!1");
            }
        }
        return arrayDimensionValue;
    }

    public int readAndCheckMinRandomValueOfArray() {

        int arrayMinRandomValue;

        while (true) {

            try {
                System.out.print("Enter the minimal random value: ");
                arrayMinRandomValue = Integer.parseInt(inputScanner.nextLine());
                break;
            }
            catch (Exception e) {
                System.out.println("Wrong symbols!2");
            }
        }
        return arrayMinRandomValue;
    }

    public int readAndCheckMaxRandomValueOfArray() {

        int arrayMaxRandomValue;

        while (true) {
            try {
                System.out.print("Enter the maximum random value: ");
                arrayMaxRandomValue = Integer.parseInt(inputScanner.nextLine());
                break;
            }
            catch (Exception e) {
                System.out.println("Wrong symbols!");
            }
        }
        return arrayMaxRandomValue;
    }

    public String readAndCheckPrintQuestionOfArray() {

        String arrayPrintQuestion;

        while (true) {
            try {
                System.out.print("Do you want to print arrays to console? (y/n) ");
                arrayPrintQuestion = inputScanner.nextLine();
                if (!arrayPrintQuestion.equals("y") && !arrayPrintQuestion.equals("n")) {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Wrong symbols!");
            }
        }
        return arrayPrintQuestion;
    }
}
