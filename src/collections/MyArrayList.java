package collections;


//Work with any type
// [Optional] make list iterable by foreach
//todo: 1) extend from Iterable.class
//      2) implement method iterator
//          1. Create class MyArrayListIterator implements Iterator<>
//          2. init in method Iterator your MyArrayListIterator


import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

    // ins end
    // ins middle (start)
    // get by index
    // delete by index
    // get size

    // [OPTIONAL] add List (array of elements) (addAll())

    @Override
    //       // 2) implement method iterator
    public Iterator<T> iterator() {
        Iterator<T> iterator = new MyIterator<>(array);

        //          1. Create class MyArrayListIterator
        //          2. init in method Iterator your MyArrayListIterator
        return iterator;
    }

    static class MyIterator<T> implements Iterator<T> {
        private Object[] array;
        private int size;
        private int i;


        public MyIterator(Object[] array) {
            this.array = array;
            size = array.length;
        }

        @Override
        public boolean hasNext() {
            return i <= size - 1;
        }

        @Override
        public T next() {
            return (T) array[i++];
        }
    }


    private Object[] array;
    private int size;

    public MyArrayList() {
        this.array = new Object[3];
    }

    public MyArrayList(int capacity) {
        this.array = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean insEmpty(T obj, int insIndex) {
        if (size == 0) {
            array[insIndex] = obj;
            size++;
            return true;
        }
        return false;

    }

    public boolean overSize(int indexIns) {
        if (indexIns > size) {
            System.out.println("Index > Size " + indexIns);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
public enum Suusu {jvkd,jhoe,grearg,rgwr,}
    // ins end
    public void add(T obj) {
        System.out.println("add " + obj + "in the end");
        if (insEmpty(obj, 0)) {
            return;
        }

        if (size < array.length) {
            array[size] = obj;
            size++;

            return;
        }

        // insert in the end when array is full
        if (size == array.length) {
            //create new array with size /2+1
            //copy elements from old to new (arr -> arrNew)
            //add obj by size index
            Object[] arrayNew = new Object[size + size / 2 + 1];
            System.arraycopy(array, 0, arrayNew, 0, array.length);

            arrayNew[size] = obj;
            size++;
            array = arrayNew;
        }
    }

    //ins middle (start)
    // if array is empty
    public void insert(T obj, int indexIns) {
        System.out.println("add " + obj + " in the " + indexIns);
        if (overSize(indexIns)) {
            return;
        }

        //insert in the middle when array is not empty
        //create new array with size /2+1
        //copy elements from old to new (arr -> arrNew)
        // remove elements with index >= of indexIns
        //add obj by indexIns
        int n = 0;

        if (size == array.length) {
            n = size / 2 + 1;
        }

        Object[] arrayNew = new Object[array.length + n];
        System.arraycopy(array, 0, arrayNew, 0, array.length);


        System.arraycopy(array, indexIns, arrayNew, indexIns + 1, size - indexIns);


        arrayNew[indexIns] = obj;
        size++;
        array = arrayNew;
    }

//    public void show() {
//        System.out.println("array length " + array.length);
//        for (Object o : array) {
//            System.out.println("el: " + o);
//        }
//    }

    // get by index
    public T getByIndex(int index) {
        System.out.println("el ( " + index + " ) = " + array[index]);
        return (T) array[index];
    }

    // delete by index
    public void delByIndex(int index) {
        System.out.println("DEL by index " + index);
        if (overSize(index)) {
            return;
        }
        Object[] arrayNew = new Object[array.length];
        System.arraycopy(array, 0, arrayNew, 0, index);
        System.arraycopy(array, index + 1, arrayNew, index, array.length - index - 1);
        array = arrayNew;
        array[size - 1] = null;
        size--;
    }

    // [OPTIONAL] add List (array of elements) (addAll())
    public void addList(Object[] list, int index) {
        System.out.println("ADD List by index" + index);
        if (overSize(index)) {
            return;
        }

        Object[] arrayNew = new Object[array.length + list.length];
//        Object[] arrayNew2 = new Object[array.length - index];
        System.arraycopy(array, 0, arrayNew, 0, index);
        System.arraycopy(list, 0, arrayNew, index, list.length);
        System.arraycopy(array, index, arrayNew, index + list.length, size - index);
        size += list.length;
        array = arrayNew;
    }
    public void print () {
        for(Object obj : array){
            System.out.print(obj+", ");
            }
        System.out.println();
    }
//    @Override
//    public Iterator iterator() {
//       // 2) implement method iterator
//        //          1. Create class MyArrayListIterator
//        //          2. init in method Iterator your MyArrayListIterator
//    }
}
