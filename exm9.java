package lb3;

public class exm9 { //головний клас
    public static int m() {
        try {
            System.out.println("0"); //вивід числа 0
            return 55; //повернення числа 55
            //вихід з методу
        } finally {
            System.out.println("1"); //вивід числа 1
        } }
    public static void main(String[] args) {
        System.out.println(m()); //виклик m()
    }
}