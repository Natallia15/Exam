import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main (String [] args) {

        // тип byte является 8-разрядным знаковым числом (от -2^7(-128) до 2^7-1 (127))
        byte a = 127;
        // тип short является 16-разрядным знаковым числом (от -2^15(-32768) до 2^7-1 (32767))
        short s = 10000;
        // тип int является 32-разрядным знаковым числом (от -2^31(-2147483648) до 2^15-1 (2147483647))
        int i = 2147112252;
        // тип long является 64-разрядным знаковым числом (от -2^63 до 2^63-1 (9.223.372.036.854.775.807))
        long l = 1000000L;
        // тип float является c одинарной точностью 32-битный IEEE754 с плав. точкой
        float f = 234.5f;
        // тип double является c двойной точностью 64-битный IEEE754 с плав. точкой, исп. для десятичный знач.
        double d = 123.4;
        // тип boolean представляет собой один бит информации, true и false, по умолчанию false
        boolean one = true;
        // тип char является одним 16- разрядным символом Юникода. (от 0 до  65535 вкл.)
        char letterA = 'A';
        char c = 167;
        //String - не примитивный тип данных, предназначен для хранения строк текста.
        String str = "Привет!";

        //2.1 Продемонстрировать работу конструкци if-else

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи число ");
            int sc = scanner.nextInt();
            if (sc%2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Нечетное");}


        //2.2 Продемонстрировать работу конструкци switch-case
        System.out.println("Введи число от 1 до 7");
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();
        switch (x) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("неправильное число");
        }

        //3. Создать двумерный массив типа double размерностью 18х11,
        // заполнить его случайными числами, вывести на экран.
        Random random = new Random();
        DecimalFormat dF = new DecimalFormat( "#.##" );
        double [][] array = new double[18][11];
        for (int q=0; q<18; q++){
            for (int k=0; k<11; k++ ){
                array[q][k]= Math.random()*10;
                System.out.print(array[q][k]);

            }
            System.out.println();
        }



            }}
