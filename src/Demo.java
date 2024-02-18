import storage.MyArrayList;

import java.util.ArrayList;

public class Demo
{
    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();
        ArrayList<String> b = new ArrayList<>();
        b.add("hello");
        b.add("hello");
        b.add("hello");
        b.add("hello");
        System.out.println(b);
    }
}