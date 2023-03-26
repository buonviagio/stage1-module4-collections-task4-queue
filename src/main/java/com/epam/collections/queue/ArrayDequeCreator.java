package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        if ((firstQueue.size() % 2 != 0 || firstQueue.size() < 2) || (secondQueue.size() % 2 != 0 || secondQueue.size() < 2)) {
            return null;
        } else {
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(Objects.requireNonNull(firstQueue.poll()));
            arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));
            arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));

            while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
                firstQueue.add(arrayDeque.pollLast());
                if (!firstQueue.isEmpty()) {
                    arrayDeque.addLast(firstQueue.poll());
                    if (!firstQueue.isEmpty()) {
                        arrayDeque.addLast(firstQueue.poll());
                    }
                }
                secondQueue.add(arrayDeque.pollLast());
                if (!secondQueue.isEmpty()) {
                    arrayDeque.addLast(secondQueue.poll());
                    if (!secondQueue.isEmpty()) {
                        arrayDeque.addLast(secondQueue.poll());
                    }
                }
            }
        }
        return arrayDeque;
    }
}
