package structuralpattern.Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Zmain {
    public static void main(String[] args) {
        /**
         * 迭代器模式：
         * 迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据
         *
         */
        LinkedList list = new LinkedList();
        list.add("123");list.add("456");list.add("789");
        MyListIterator<String> mylist = new MyListIterator<>(list);
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
