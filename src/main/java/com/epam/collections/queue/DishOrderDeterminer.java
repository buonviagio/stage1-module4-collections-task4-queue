package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        int element;
        for (int i = 1; !queue.isEmpty(); i++) {
            element = queue.poll();
            if (i == everyDishNumberToEat) {
                list.add(element);
                i = 0;
                continue;
            }
            queue.add(element);
        }
        return list;
    }
}
