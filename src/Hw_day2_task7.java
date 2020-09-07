import java.util.Scanner;

public class Hw_day2_task7 {
    public static void main(String[] args) {
        System.out.println("Введите код города:");
        Scanner scanner = new Scanner(System.in);
        //( Москва(905) - 4.15руб. Ростов(194) -
        //1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
        //руб. )
        switch (scanner.nextInt()){
            case (905):
                System.out.println("Москва. Стоимость разговора:"+(4.15*10));
                break;
            case (194):
                System.out.println("Ростов. Стоимость разговора:"+(1.98*10));
                break;
            case (491):
                System.out.println("Краснодар. Стоимость разговора:"+(2.69*10));
                break;
            case (800):
                System.out.println("Киров. Стоимость разговора:"+(5.00*10));
                break;
            default:
                System.out.println("Не правильный код города.");
                break;
        }

    }
}
