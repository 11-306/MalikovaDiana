package Queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        MyQueue q = new MyQueue(15);

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        q.push(8);
        q.push(9);
        q.push(10);

        System.out.println("Размер: " + q.size());

        System.out.println("Первый элемент: " + q.front());

        System.out.println("Удалённый элемент из начала очереди: " + q.pop());

        q.push(11);
        q.push(12);
        q.push(13);
        q.push(14);
        q.push(15);
        q.push(16);

        System.out.println("Размер: " + q.size());

        q.clear();

        System.out.println("Размер: " + q.size());

        System.out.println(q.pop());
    }
}

