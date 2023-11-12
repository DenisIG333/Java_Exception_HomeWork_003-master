package javaErrorException.HomeWork_003;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Ошибка: неправильный формат ввода данных пола");
        System.out.printf("Это некорректные данные: %s", i);
        System.out.println();
    }
}
