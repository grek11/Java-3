package lb3;

public class exm5 { //головний клас
    public static void main(String[] args) {
        try {
            System.out.println("0"); //вивід числа 0
            throw new RuntimeException("ошибка"); //викидається помилка
        } catch (NullPointerException e) { //не обробиться
            System.out.println("1");
        }
        System.out.println("2"); //не обробиться
    }
}
