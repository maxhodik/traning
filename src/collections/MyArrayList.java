package collections;

//Work with any type
// Iterable
public class MyArrayList {
    // ins end
    // ins middle (start)
    // get by index
    // delete by index
    // get size

    // [OPTIONAL] add List (array of elements) (addAll())

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

    // ins end
    public void add(Object obj) {
        if (size == 0) {
            array[0] = obj;
            size++;
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
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            arrayNew[size] = obj;
            size++;
            array = arrayNew;
        }
    }

    //ins middle (start)
    // if array is empty
    public void insert(Object obj, int indexIns) {
        if (indexIns > size) {
            System.out.println("Index > Size" + indexIns);
            return;
        }

        if (size == 0) {
            array[indexIns] = obj;
            size++;
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
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        System.out.println("after copy");
        for (Object o : arrayNew) {
            System.out.println("el: " + o);
        }
        for (int i = indexIns; i < size; i++) {
            arrayNew[i + 1] = array[i];
        }
        System.out.println("after shift");
        for (Object o : arrayNew) {
            System.out.println("el: " + o);
        }
        arrayNew[indexIns] = obj;
        size++;
        array = arrayNew;
    }

    public void show() {
        System.out.println(array.length);
        for (Object o : array) {
            System.out.println("el: " + o);
        }
    }

    // get by index
    public void getByIndex(int index) {
        System.out.println("el ( " + index + " ) = " + array[index]);
    }

    // delete by index
    public void delByIndex(int index) {
        if (index > size) {
            System.out.println("Index > Size " + index);
            return;
        }
        Object[] arrayNew = new Object[array.length];
        if (index == 0){
            for (int i=1;  i< size; i++ ){
                arrayNew [i-1]= array[i];
            }
        } else {
            arrayNew =array;
            for (int i = size - 1; i > index; i--) {
                arrayNew[i - 1] = array[i];

            }
        }
        arrayNew[size-1]= null;
        size--;
        array=arrayNew;
    }
// [OPTIONAL] add List (array of elements) (addAll())
    public void addList (Object [] list, int index) {
        if (index > size) {
            System.out.println("Index > Size " + index);
            return;
        }

        Object[] arrayNew = new Object[array.length + list.length];
        Object[] arrayNew2 = new Object[array.length - index];
        int j=0;
        for (int i = index ; i < array.length; i++) {

            arrayNew2[j] = array[i];
            j++;
        }
        for (int i = 0; i < list.length; i++) {

            arrayNew[index+i] = list[i];

        }
        for (int i = 0 ; i < arrayNew2.length; i++){
            arrayNew [index+ list.length+i] = arrayNew2 [i];
        }
        for (int i= 0; i<index;  i++){
            arrayNew[i]= array[i];
        }
        size += list.length;
        array=arrayNew;
    }

}
