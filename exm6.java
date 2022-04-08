package lb3;

public class exm6 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); //вивід числа 0
            throw new NullPointerException("ошибка"); //викидається помилка
        } catch (ArithmeticException e) { //не обробиться
            System.out.println("1");
        } catch (RuntimeException e) { //перехоплення помилки
            System.out.println("2"); //вивід числа 2
        } catch (Exception e) { //не обробиться
            System.out.println("3"); 
        }
        System.out.println("4"); //вивід числа 4
    }
}
