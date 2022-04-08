package lb3;

public class exm { //головний клас
    public static void main(String[] srgs) {
        try {
            System.out.println("0"); //вивід числа 0
            throw new RuntimeException("Непроверяемая ошибка"); //викидається помилка
        } catch (RuntimeException e) { //виключення перехоплено
            System.out.println("1 " + e); //виключення оброблено
        }
        System.out.println("2");//вивід числа 2
    }
}
