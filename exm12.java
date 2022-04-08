package lb3;

public class exm12 { //головний клас
    public static void m(String str, double chislo){
        if (str==null) { //викид помилки при данній умові
            throw new IllegalArgumentException("Строка введена неверно"); //викидається помилка
        }
        if (chislo>0.001) { //викид помилки при данній умові, коли перший if не спрацював
            throw new IllegalArgumentException("Неверное число"); //викидається помилка
        } 
    }

    public static void main(String[] args) {
        m(null,0.000001); //виклик m()
    }
}