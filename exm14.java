package lb3;

public class exm14 { //головний клас
    public static void m(int x) throws ArithmeticException { //помилка при поділу на 0
        int h=10/x;
    }

    public static void main(String[] args) {
        try {
            int l = args.length; //присвоєння l значення довжини масиву
            System.out.println("Размер массива= " + l); //вивід довжини масиву
            m(l); //виклик m(х)
        } catch (ArithmeticException e) { //обробка помилки
            System.out.println("Ошибка: Деление на ноль"); //вивід тексту
        }
    }
}