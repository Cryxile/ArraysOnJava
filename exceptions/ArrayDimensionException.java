package exceptions;

public class ArrayDimensionException extends Exception{

    public ArrayDimensionException() {

        super("Array dimension value can't be less then 1!");
    }
}
