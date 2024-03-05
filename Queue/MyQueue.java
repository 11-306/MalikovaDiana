package Queue;

public class MyQueue {
    private int q_right;                   //индекс указывает на правый
    private int q_left;                    //и левый конец очереди
    private int size;
    private int[] array;    //массив, в котором хранятся элементы очереди

    MyQueue(int SIZE) {
        array = new int[SIZE];
        q_right = 0;
        q_left = 0;
        size = 0;
    }

    void push(int x) {        //добавление эл-та x
        if (size == array.length + 1) {
            throw new IllegalArgumentException("Очередь заполнена");
        }

        array[q_right] = x;
        q_right = (q_right + 1) % array.length;
        size++;

    }

    int size() {
        return (size);
    }   //текущий размер

    int front() {                   //возвращение эл-та из начала очереди без его удаления
        if (is_empty()) {
            throw new IllegalArgumentException("Очередь пуста");
        } else {
            return array[q_left];
        }
    }

    int pop() {                    //удаление и возвращение эл-та из начала очереди
        if (is_empty()) {
            throw new IllegalArgumentException("Очередь пуста");
        } else {
            size--;
            return array[q_left++];
        }
    }

    boolean is_empty() {            //проверка на пустоту
        if (q_left == q_right) {
            return true;
        } else {
            return false;
        }
    }

    void clear() {                  //очистка
        q_left = q_right = 0;
        size = 0;
    }
}

