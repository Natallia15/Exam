import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class CalcMain {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число ");
        double a = scanner.nextInt();
        System.out.println("Введи второе число ");
          double b = scanner.nextInt();
        System.out.println("Введи +, -, / или *");
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.nextLine();
        Calculator calculator = new Calculator();
        DecimalFormat dF = new DecimalFormat( "#.##" );


        switch (s){
            case ("+") :
                System.out.println(dF.format(calculator.summa (a, b)));
                break;
            case ("-") :
                System.out.println(dF.format(calculator.razn (a, b)));
                break;
            case ("*") :
                System.out.println(dF.format(calculator.proizv (a, b)));
                break;
            case ("/") :
                System.out.println(dF.format(calculator.chas (a, b)));
                break;

    }}}

