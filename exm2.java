package lb3;

public class exm2 { //головний клас
    public static void main(String[] srgs) {
        try {
            System.out.println("0"); //вивід числа 0
            throw new RuntimeException("Непроверяемая ошибка"); //викидається помилка
            System.out.println("1"); //не оброблено
        } catch (Exception e) { //виключення перехоплено
            System.out.println("2 " + e); //виключення оброблено
        }
        System.out.println("3"); //вивід числа 3
    }
}
