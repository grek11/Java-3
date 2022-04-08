package lb3;

public class exm10 { //головний клас
    public static int m(){
        try {
            System.out.println("0"); //вивід числа 0
            return 15; //повернення числа 15
        } finally {
            System.out.println("1"); //вивід числа 1
            return 20; //повернення числа 20
        } 
    }

        public static void main(String[] args) {
        System.out.println(m()); //виклик m()
        }
}