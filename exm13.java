package lb3;

public class exm13 {
    public static void main(String[] args) {
        try {
            int l = args.length; //присвоєння l значення довжини масиву
            System.out.println("Размер массива= " + l); //вивід довжини масиву
            int h=10/l; //викидається помилка при довжині масиву 0
            args[l + 1] = "10"; //викидується помилка при невикиданні попередньої помилки
        } catch (ArithmeticException e) { //перехоплення помилки
            System.out.println("Деление на ноль"); //вивід тексту
        } catch (ArrayIndexOutOfBoundsException e) { //перехоплення помилки
            System.out.println("Индекс не существует"); //вивід тексту
        } 
    }
}
