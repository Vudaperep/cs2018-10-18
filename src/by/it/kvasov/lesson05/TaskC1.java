package by.it.kvasov.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception{
            Scanner sc= new Scanner(System.in);
    ArrayList<Integer> a=new ArrayList<>(),a3=new ArrayList<>(), a2=new ArrayList<>(),a0=new ArrayList<>();
       for(int i=0;i<20;i++){
        a.add(sc.nextInt());
        if (a.get(i)%3==0) a3.add(a.get(i));
        if (a.get(i)%2==0) a2.add(a.get(i));
        if (a.get(i)%3!=0 && a.get(i)%2!=0) a0.add(a.get(i));
    }
    printList(a3); printList(a2);printList(a0);
}
    {

    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
