package com.company;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите тип сортировки");
        System.out.println("1. Сортировка по убыванию цены");
        System.out.println("2. Сортировка по возрастанию цены");
        System.out.println("3. Сортировка по приоритету от самого важного");
        System.out.println("4. Сортировка по приоритету от низкого приоритета");
        System.out.println("Введите идентификатор сортировки:");
        String id = sc.nextLine();

        Comparator<Wish> comparator; // Создаем переменную компоратор которая будет сортировать по выбору id
        if (id.equals("1")) {
            comparator = new SortByPrice(Sort.MIN);
        } else if (id.equals("2")) {
            comparator = new SortByPrice(Sort.MAX);
        } else if (id.equals("3")) {
            comparator = new SortByPriority(Sort.MIN);
        } else if (id.equals("4")) {
            comparator = new SortByPriority(Sort.MAX);
        } else {
            System.out.println("Некорректный идентификатор сортировки");
            return;
        }

        Set<Wish> wishlist = new TreeSet<>(comparator);

        while (true) {
            System.out.println("Введите что бы вы хотели купить (введите пустую строку для выхода):");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Цена в рублях:");
            double price = Double.parseDouble(sc.nextLine());
            System.out.println("Приоритет важности (0 - не очень важно, 5 - очень важно):");
            int priority = Integer.parseInt(sc.nextLine());

            wishlist.add(new Wish(name, price, priority));
            System.out.println("Добавлено!");
        }

        System.out.println("Ваш список:");
        wishlist.forEach(System.out::println);



    }
}
