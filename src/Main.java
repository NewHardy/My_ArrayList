import storage.MyIntegerArrayList;

public class Main
{
    public static void main(String[] args)
    {
        MyIntegerArrayList myList = new MyIntegerArrayList(10);
        System.out.println(myList.size());
        myList.add(15);
        System.out.println(myList.get(1));
        System.out.println(myList.size());
    }
}