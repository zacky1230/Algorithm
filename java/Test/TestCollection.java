package Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        ArrayList testList = new ArrayList();
        testList.add(1);
        testList.add(2);

        System.out.println(arrayList.containsAll(testList));

        ArrayList addList = new ArrayList();
        addList.add(6);
        addList.add(7);

//        arrayList.add(addList);
        arrayList.addAll(addList);

        for(Object e : arrayList)
            System.out.println(e.toString());

        System.out.println(arrayList.toString());

        LinkedList linkedList = new LinkedList();
        linkedList.addAll(arrayList);
        linkedList.addFirst(0);
        linkedList.addLast(8);
        System.out.println(linkedList.toString());
    }
}
