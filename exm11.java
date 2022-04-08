package lb3;

public class exm11 { //головний клас
    public static void main(String[] args) {
        try {
            System.out.println("0"); //вивід числа 0
            throw new NullPointerException("ошибка"); //викидається помилка
        } catch (NullPointerException e) { //перехоплення вкилючення
            System.out.println("1"); //вивід числа 1
        } finally {
            System.out.println("2"); //вивід числа 2
        }
        System.out.println("3"); //вивід числа 3
    }
}