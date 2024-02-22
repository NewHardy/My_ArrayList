package storage;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
        private T[] storage;
        private int size = 0;

        public static final int DEFAULT_CAPACITY = 10;

        public MyArrayList() {
            storage = (T[]) new Object[DEFAULT_CAPACITY];
        }

        public MyArrayList(int capacity) {
            storage = (T[]) new Object[capacity];
        }

        public void add(T added) {
            storage[size] = added;
            size++;
            if (storage.length == size) {
                storage = Arrays.copyOf(storage, getNewLength());

            }
        }

        public int size() {
            return size;
        }

        public T get(int a) {
            return storage[a];
        }

        private int getNewLength() {
            return storage.length + storage.length / 2;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < size; i++) {
                sb.append(storage[i]);
                if (i != size - 1) {
                    sb.append(',');
                } else {
                    sb.append(']');
                }
            }
            return sb.toString();
        }

        public void delete(int index)
        {
            Objects.checkIndex(index,size);
            for (int i = index; i < size-1; i++)
            {
                storage[i]=storage[i-1];
            }
            storage [size-1]= null;
            size--;
        }
        public void clear()
        {
            for (int i = 0; i < size; i++) {
                storage[i]=null;
            }
            size=0;
        }
    }
