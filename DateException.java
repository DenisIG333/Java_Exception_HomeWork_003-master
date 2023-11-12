package javaErrorException.HomeWork_003;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Ошибка: DateNotCorrectFormat");
        System.out.printf("Это неправильный формат:: %s", i);
        System.out.println();
    }
}
