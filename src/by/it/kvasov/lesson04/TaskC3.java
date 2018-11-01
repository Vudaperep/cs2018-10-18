package by.it.kvasov.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        String s2 = "два ";
        String s3 = "три ";
        String s4 = "четыре ";
        String s5 = "пять ";
        String s6 = "шесть ";
        String s7 = "семь ";
        String s8 = "восемь ";
        String s9 = "девять ";
        String s10 = "десять ";
        String s12 = "двенадцать ";
        String s14 = "четырнадцать ";
        String s15 = "пятнадцать ";
        String s16 = "шестнадцать";
        String s18 = "восемнадцать ";
        String s20 = "двадцать ";
        String s21 = "двадцать один ";
        String s24 = "двадцать четыре ";
        String s25 = "двадцать пять";
        String s27 = "двадцать семь ";
        String s28 = "двадцать восемь ";
        String s30 = "тридцать ";
        String s32 = "тридцать два ";
        String s35 = "тридцать пять ";
        String s36 = "тридцать шесть ";
        String s40 = "сорок ";
        String s42 = "сорок два ";
        String s45 = "сорок пять ";
        String s49 = "сорок девять ";
        String s48 = "сорок восемь ";
        String s50 = "пятьдесят ";
        String s54 = "пятьдесят четыре";
        String s56 = "пятьдесят шесть ";
        String s60 = "шестьдесят ";
        String s63 = "шестьдесят три ";
        String s64 = "шестьдесят четыре ";
        String s70 = "семьдесят ";
        String s72 = "семьдесят два ";
        String s80 = "восемьдесят ";
        String s81 = "восемьдесят один ";
        String s90 = "девяносто ";
        String s100 = "сто ";
        String um = "умножить на ";
        String ravn = "равно ";
        System.out.println(s2+um+s2+ravn+s4);
        System.out.println(s2+um+s3+ravn+s6);
        System.out.println(s2+um+s4+ravn+s8);
        System.out.println(s2+um+s5+ravn+s10);
        System.out.println(s2+um+s6+ravn+s12);
        System.out.println(s2+um+s7+ravn+s14);
        System.out.println(s2+um+s8+ravn+s16);
        System.out.println(s2+um+s9+ravn+s18);
        System.out.println(s2+um+s10+ravn+s20);

        System.out.println(s3+um+s2+ravn+s6);
        System.out.println(s3+um+s3+ravn+s9);
        System.out.println(s3+um+s4+ravn+s12);
        System.out.println(s3+um+s5+ravn+s15);
        System.out.println(s3+um+s6+ravn+s18);
        System.out.println(s3+um+s7+ravn+s21);
        System.out.println(s3+um+s8+ravn+s24);
        System.out.println(s3+um+s9+ravn+s27);
        System.out.println(s3+um+s10+ravn+s30);

        System.out.println(s4+um+s2+ravn+s8);
        System.out.println(s4+um+s3+ravn+s12);
        System.out.println(s4+um+s4+ravn+s16);
        System.out.println(s4+um+s5+ravn+s20);
        System.out.println(s4+um+s6+ravn+s24);
        System.out.println(s4+um+s7+ravn+s28);
        System.out.println(s4+um+s8+ravn+s32);
        System.out.println(s4+um+s9+ravn+s36);
        System.out.println(s4+um+s10+ravn+s40);

        System.out.println(s5+um+s2+ravn+s10);
        System.out.println(s5+um+s3+ravn+s15);
        System.out.println(s5+um+s4+ravn+s20);
        System.out.println(s5+um+s5+ravn+s25);
        System.out.println(s5+um+s6+ravn+s30);
        System.out.println(s5+um+s7+ravn+s35);
        System.out.println(s5+um+s8+ravn+s40);
        System.out.println(s5+um+s9+ravn+s45);
        System.out.println(s5+um+s10+ravn+s50);

        System.out.println(s6+um+s2+ravn+s12);
        System.out.println(s6+um+s3+ravn+s18);
        System.out.println(s6+um+s4+ravn+s24);
        System.out.println(s6+um+s5+ravn+s30);
        System.out.println(s6+um+s6+ravn+s36);
        System.out.println(s6+um+s7+ravn+s42);
        System.out.println(s6+um+s8+ravn+s48);
        System.out.println(s6+um+s9+ravn+s54);
        System.out.println(s6+um+s10+ravn+s60);

        System.out.println(s7+um+s2+ravn+s14);
        System.out.println(s7+um+s3+ravn+s21);
        System.out.println(s7+um+s4+ravn+s28);
        System.out.println(s7+um+s5+ravn+s35);
        System.out.println(s7+um+s6+ravn+s42);
        System.out.println(s7+um+s7+ravn+s49);
        System.out.println(s7+um+s8+ravn+s56);
        System.out.println(s7+um+s9+ravn+s63);
        System.out.println(s7+um+s10+ravn+s70);

        System.out.println(s8+um+s2+ravn+s16);
        System.out.println(s8+um+s3+ravn+s24);
        System.out.println(s8+um+s4+ravn+s32);
        System.out.println(s8+um+s5+ravn+s40);
        System.out.println(s8+um+s6+ravn+s48);
        System.out.println(s8+um+s7+ravn+s56);
        System.out.println(s8+um+s8+ravn+s64);
        System.out.println(s8+um+s9+ravn+s72);
        System.out.println(s8+um+s10+ravn+s80);

        System.out.println(s9+um+s2+ravn+s18);
        System.out.println(s9+um+s3+ravn+s27);
        System.out.println(s9+um+s4+ravn+s36);
        System.out.println(s9+um+s5+ravn+s45);
        System.out.println(s9+um+s6+ravn+s54);
        System.out.println(s9+um+s7+ravn+s63);
        System.out.println(s9+um+s8+ravn+s72);
        System.out.println(s9+um+s9+ravn+s81);
        System.out.println(s9+um+s10+ravn+s90);

        System.out.println(s10+um+s2+ravn+s20);
        System.out.println(s10+um+s3+ravn+s30);
        System.out.println(s10+um+s4+ravn+s40);
        System.out.println(s10+um+s5+ravn+s50);
        System.out.println(s10+um+s6+ravn+s60);
        System.out.println(s10+um+s7+ravn+s70);
        System.out.println(s10+um+s8+ravn+s80);
        System.out.println(s10+um+s9+ravn+s90);
        System.out.println(s10+um+s10+ravn+s100);


    }
}