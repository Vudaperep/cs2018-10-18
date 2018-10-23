package by.it.kvasov.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int s = i + j;
        System.out.println("DEC:"+i+"+"+j+"="+s);
        String a = Integer.toBinaryString(i);
        String b = Integer.toBinaryString(j);
        String c = Integer.toBinaryString(s);
        System.out.println("BIN:"+a+"+"+b+"="+c);
        String d = Integer.toHexString(i);
        String e = Integer.toHexString(j);
        String f = Integer.toHexString(s);
        System.out.println("HEX:"+d+"+"+e+"="+f);
        String g = Integer.toOctalString(i);
        String h = Integer.toOctalString(j);
        String z = Integer.toOctalString(s);
        System.out.println("OCT:"+g+"+"+h+"="+z);



    }
}
