package storage;

public class MyIntegerArrayList {
    private final static int DEFAULT_STORAGE_CAPACITY = 10;
    private int size = 0;
    int[] storage;

    public MyIntegerArrayList() {
        storage = new int[DEFAULT_STORAGE_CAPACITY];

    }

    public MyIntegerArrayList(int initialCapacity) {
        storage = new int[initialCapacity];
    }

    public void add(int added) {
        int[] storage2;
        int i = storage.length * 2;
        storage2 = new int[i];
        if (storage.length == storage[size]) {
            for (int j = 0; j < storage.length; j++) {
                storage2[j] = storage[j];
            }
        } else {
            storage[size] = added;
        }
    }

    public int size() {
        for (int i = 0; i < storage.length; i++) {
            Integer check = storage[i];
            if (check == null) {
                return i;
            }
        }
        return 0;
    }

    public int get(int a) {
        return storage[a];
    }
    
}
