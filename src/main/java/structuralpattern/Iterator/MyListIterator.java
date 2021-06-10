package structuralpattern.Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class MyListIterator<T>{
    LinkedList<T> list;

    MyListIterator(LinkedList<T> list){
        this.list = list;
    }

    public Iterator<T> iterator() {
        return new ListIterator();
    }

    public class ListIterator implements Iterator<T>{
        private int index;

        {
            index = list.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return list.get(index);
        }
    }
}
