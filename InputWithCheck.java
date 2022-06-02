import java.util.Scanner;

public class InputWithCheck {

    Scanner inputScanner = new Scanner(System.in);

    public int readAndCheckDimensionValue() {

        int arrayDimensionValue;

        while (true) {
            try {
                arrayDimensionValue = Integer.parseInt(inputScanner.nextLine());
                if (arrayDimensionValue < 1) {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Wrong symbols!");
            }
        }
        return arrayDimensionValue;
    }

    public int readAndCheckMinAndMaxRandomValue() {

        int enteredValue;

        while (true) {
            try {
                enteredValue = Integer.parseInt(inputScanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Wrong symbols!");
            }
        }
        return enteredValue;
    }

    public String readAndCheckPrintQuestionOfArray() {

        String arrayPrintQuestion;

        while (true) {
            try {
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
