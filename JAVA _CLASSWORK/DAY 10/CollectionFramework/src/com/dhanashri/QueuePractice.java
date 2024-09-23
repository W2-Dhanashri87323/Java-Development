package com.dhanashri;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new PriorityQueue<>(); // prints elements in natural ordering (Sorted)

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);

        System.out.println(q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.poll());

        }

        // *******DEQUE*********--->

        // Deque<String> dq = new ArrayDeque<>();
        Deque<String> dq = new LinkedList<>();

        System.out.println("Deque as Stack --->");

        // ArrayDeque as Stack --->
        // LinkedList as Stack --->
        dq.offerFirst("A");
        dq.offerFirst("B");
        dq.offerFirst("C");
        dq.offerFirst("D");

        System.out.println(dq);

        while (!dq.isEmpty()) {
            System.out.println(dq.poll());
        }

        System.out.println();
        System.out.println("Deque as Queue --->");

        // ArrayDeque as queue ---->
        // LinkedList as queue ---->
        dq.offerLast("a");
        dq.offerLast("b");
        dq.offerLast("c");
        dq.offerLast("d");

        System.out.println(dq);

        System.out.println(" peekLast : " + dq.peekLast());
        System.out.println(" getLast : " + dq.getLast());

        System.out.println(" peek : " + dq.peek());
        System.out.println(" peekFirst : " + dq.peekFirst());
        System.out.println(" getFirst : " + dq.getFirst());

        System.out.println();
        while (!dq.isEmpty()) {
            System.out.println(dq.poll());
        }

    }

}
