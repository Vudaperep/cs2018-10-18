package by.it.kvasov.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        switch (b) {
            case 1:
                System.out.println((a));break;
            case 2:
                System.out.println((31+a));break;
            case 3:
                System.out.println((59+a));break;
            case 4:
                System.out.println((90+a));break;
            case 5:
                System.out.println((120+a));break;
            case 6:
                System.out.println((151+a));break;
            case 7:
                System.out.println((181+a));break;
            case 8:
                System.out.println((212+a));break;
            case 9:
                System.out.println((243+a));break;
            case 10:
                System.out.println((273+a));break;
            case 11:
                System.out.println((304+a));break;
            case 12:
                System.out.println((334+a));break;


        }

    }

}
