import java.util.Scanner;

public class InputWithCheck {

    Scanner inputScanner;

    public InputWithCheck() {

        inputScanner = new Scanner(System.in);
    }

    public int readAndCheckIntFromConsole(boolean isDimensionValue) {

        int enteredValue;

        while (true) {
            try {
                enteredValue = Integer.parseInt(inputScanner.nextLine());
                if (isDimensionValue && enteredValue < 1) {
                    throw new ArrayDimensionException();
                }
                break;
            } catch (ArrayDimensionException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Entered value isn't integer number!");
            }
        }
        return enteredValue;
    }

    public boolean readAndCheckStringFromConsole() {

        String arrayPrintQuestion;
        boolean answerVariable = false;

        while (true) {
            try {
                arrayPrintQuestion = inputScanner.nextLine();
                if (!arrayPrintQuestion.equals("y") && !arrayPrintQuestion.equals("n")) {
                    throw new NotYOrNException();
                }
                if (arrayPrintQuestion.equals("y")) {
                    answerVariable = true;
                }
                break;
            }
            catch (NotYOrNException e) {
                System.err.println(e.getMessage());
            }
        }
        return answerVariable;
    }
}
