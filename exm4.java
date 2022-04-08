package lb3;

public class exm4 { //головний клас
    public static void main(String[] args) {
        try {
            System.out.println("0"); //вивід числа 0
            throw new RuntimeException("ошибка"); //викидається помилка
        } catch (NullPointerException e) { //не обробиться
            System.out.println("1");
        } catch (Exception e) { //перехоплення помилки
            System.out.println("2"); //вивід числа 2
        } catch (Error e) { //не обробиться
            System.out.println("3");
        }
        System.out.println("4"); //вивід числа 4
    }
}
