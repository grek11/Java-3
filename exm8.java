package lb3;

public class exm8 {
    public static int m() {
        try {
            System.out.println("0"); //вивід числа 0
            throw new RuntimeException(); //викидається помилка
        } finally {
            System.out.println("1"); //вивід числа 1
        }
    }
    
    public static void main(String[] args) {
        System.out.println(m()); //виклик m()
    }
}
