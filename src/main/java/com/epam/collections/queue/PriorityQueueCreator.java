package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {

    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(new MyComparator().reversed());

        queue.addAll(firstList);
        queue.addAll(secondList);

        return queue;
    }

    private static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}
