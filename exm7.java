package lb3;

public class exm7 { //головний клас
    public static void main(String[] args) {
        try {
            System.out.println("0"); //вивід числа 0
            throw new NullPointerException("ошибка"); //викидається помилка
        } catch (NullPointerException e) { //перехоплення помилки
            try { //додано новий обробник
            System.out.println("1"); //вивід числа 1
            throw new ArithmeticException(); //викидається помилка
        } catch(ArithmeticException ex) { //перехоплення помилки
            System.out.println("2"); //вивід числа 2
        }}
        System.out.println("3"); //вивід числа 3
    }
}
