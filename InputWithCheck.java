import java.util.Scanner;

public class InputWithCheck {

    Scanner inputScanner = new Scanner(System.in); //плохая практика инициализировать поля прям в полях. В будущем приведет к проблемам. Для этого нужен конструктор. Вынеси в конструктор это

    public int readAndCheckDimensionValue() { //я уже писал о чем-то похожем, но напишу еще раз. Твой метод просто считывает значения из консоли. Он не имеет никакого
                                        //логического отношения к массивам. У тебя в методе даже массива нет, тогда почему в названии фигурирует какой-то массив?
                                        //Переименуй свой метод, чтобы он отображал суть

        int arrayDimensionValue;

        while (true) {
            try {
                arrayDimensionValue = Integer.parseInt(inputScanner.nextLine());
                if (arrayDimensionValue < 1) {
                    throw new Exception(); // создай свой класс исключений, посмотри как это делается, заодно поймешь, что такое наследование, для чего оно нужно и как с ним работать
                                            //и используй новый класс там, где это необходимо
                }
                break;
            }
            catch (Exception e) { // перехвати тут свой новый класс
                System.out.println("Wrong symbols!");
            }
        }
        return arrayDimensionValue;
    }

    public int readAndCheckMinAndMaxRandomValue() {  //где-то

        int enteredValue; //я

        while (true) { //уже
            try { // видел
                enteredValue = Integer.parseInt(inputScanner.nextLine()); //подобный
                break; //код
            } catch (Exception e) { //зачем
                System.out.println("Wrong symbols!"); //его
            }
        }
        return enteredValue; //повторяешь?
    }

    public String readAndCheckPrintQuestionOfArray() { //возвращаемся к смыслу метода. Ждем ввод и на основании ввода отвечаем да или нет. Зачем мы возвращаем строку?

        String arrayPrintQuestion;

        while (true) {
            try {
                arrayPrintQuestion = inputScanner.nextLine();
                if (!arrayPrintQuestion.equals("y") && !arrayPrintQuestion.equals("n")) {
                    throw new Exception();
                }
                break;
            }
            catch (Exception e) { //новый класс тут будет
                System.out.println("Wrong symbols!");
            }
        }
        return arrayPrintQuestion;
    }
}
