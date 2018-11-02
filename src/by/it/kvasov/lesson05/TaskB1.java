package by.it.kvasov.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> mass = new ArrayList<>();
        mass.add("Красивый дом");
        mass.add("Теплое море");
        mass.add("Быстрая машина");
        mass.add("Красный цветок");
        mass.add("Большое дерево");
        int n = mass.size();
        System.out.println(n);
        for (int a=0;a<mass.size();a++) {
            int j= mass.size()-a-1;
            System.out.println(mass.get(j));


        }
    }
}
