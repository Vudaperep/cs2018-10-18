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


/*public static void main(String[] args){
        for(int i=1;i<=10;i++){
        for(int j=1;j<=10;j++){
        switch(i){
        case 1:
        System.out.print("один ");
        break;
        case 2:
        System.out.print("два ");
        break;
        case 3:
        System.out.print("три ");
        break;
        case 4:
        System.out.print("четыре ");
        break;
        case 5:
        System.out.print("пять ");
        break;
        case 6:
        System.out.print("шесть ");
        break;
        case 7:
        System.out.print("семь ");
        break;
        case 8:
        System.out.print("восемь ");
        break;
        case 9:
        System.out.print("девять ");
        break;
        case 10:
        System.out.print("десять ");
        break;
        }
        dig(i);
        System.out.print("умножить на ");
        switch(j){
        case 1:
        System.out.print("один ");
        break;
        case 2:
        System.out.print("два ");
        break;
        case 3:
        System.out.print("три ");
        break;
        case 4:
        System.out.print("четыре ");
        break;
        case 5:
        System.out.print("пять ");
        break;
        case 6:
        System.out.print("шесть ");
        break;
        case 7:
        System.out.print("семь ");
        break;
        case 8:
        System.out.print("восемь ");
        break;
        case 9:
        System.out.print("девять ");
        break;
        case 10:
        System.out.print("десять ");
        break;
        }
        dig(j);
        System.out.print("равно ");
        if((i*j)/10<2)switch(i*j){
        case 1:
        System.out.println("один");
        System.out.print("один");
        break;
        case 2:
        System.out.println("два");
        System.out.print("два");
        break;
        case 3:
        System.out.println("три");
        System.out.print("три");
        break;
        case 4:
        System.out.println("четыре");
        System.out.print("четыре");
        break;
        case 5:
        System.out.println("пять");
        System.out.print("пять");
        break;
        case 6:
        System.out.println("шесть");
        System.out.print("шесть");
        break;
        case 7:
        System.out.println("семь");
        System.out.print("семь");
        break;
        case 8:
        System.out.println("восемь");
        System.out.print("восемь");
        break;
        case 9:
        System.out.println("девять");
        System.out.print("девять");
        break;
        case 10:
        System.out.println("десять");
        System.out.print("десять");
        break;
        case 12:
        System.out.println("двенадцать");
        System.out.print("двенадцать");
        break;
        case 14:
        System.out.println("четырнадцать");
        System.out.print("четырнадцать");
        break;
        case 15:
        System.out.println("пятнадцать");
        System.out.print("пятнадцать");
        break;
        case 16:
        System.out.println("шестнадцать");
        System.out.print("шестнадцать");
        break;
        case 18:
        System.out.println("восемнадцать");
        System.out.print("восемнадцать");
        break;
        }
        else{
@ @ -170,40+108,45@@public static void main(String[]args){
        System.out.print("сто");
        break;
        }
        switch((i*j)%10){
        case 0:
        System.out.println();
        break;
        case 1:
        System.out.println("один ");
        break;
        case 2:
        System.out.println("два ");
        break;
        case 3:
        System.out.println("три ");
        break;
        case 4:
        System.out.println("четыре ");
        break;
        case 5:
        System.out.println("пять ");
        break;
        case 6:
        System.out.println("шесть ");
        break;
        case 7:
        System.out.println("семь ");
        break;
        case 8:
        System.out.println("восемь ");
        break;
        case 9:
        System.out.println("девять ");
        break;
        dig((i*j)%10);
        }
        System.out.println();
        }
        }
        }
public static void dig(int a){
        switch(a){
        case 1:
        System.out.print("один ");
        break;
        case 2:
        System.out.print("два ");
        break;
        case 3:
        System.out.print("три ");
        break;
        case 4:
        System.out.print("четыре ");
        break;
        case 5:
        System.out.print("пять ");
        break;
        case 6:
        System.out.print("шесть ");
        break;
        case 7:
        System.out.print("семь ");
        break;
        case 8:
        System.out.print("восемь ");
        break;
        case 9:
        System.out.print("девять ");
        break;
        case 10:
        System.out.print("десять ");
        break;
        }
        }
        }
*/