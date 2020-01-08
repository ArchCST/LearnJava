package Week4.Day_24.Lesson;

import playground.Faker;

/*
自实现 ArrayList 的源码
 */
public class MyArrayList {
    private Object[] objs;
    private static final Object[] DEFAULT_EMPTY_LIST = {};
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    public MyArrayList() {
        objs = DEFAULT_EMPTY_LIST;
    }

    // 增
    public void add(Object object) {
        ensureCapacity(size+1);
        objs[size++]=object;
    }

    private void ensureCapacity(int capacity) {
        if (objs == DEFAULT_EMPTY_LIST) {
            capacity = DEFAULT_CAPACITY;
        }
        if (capacity > objs.length) {
            grow(capacity);
        }
    }

    private void grow(int minCapacity) {
        int newCapacity = objs.length + (objs.length >> 1);

        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }

        Object[] new_objs = new Object[newCapacity];
        System.arraycopy(objs, 0, new_objs, 0, size);
        objs = new_objs;
    }

    // 删
    public void delete(int index) {
        checkRange(index);
        System.arraycopy(objs, index+1, objs, index, size - index - 1);
        objs[--size] = null;
    }

    public void checkRange(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("数组下标越界："+index);
        }
    }

    // 查
    public Object get(int index) {
        checkRange(index);
        return objs[index];
    }

    public int size(){
        return size;
    }

    // 改
    public void set(int index, Object object){
        checkRange(index);
        objs[index] = object;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
//            String sizeStr = "";
//            for (int j = 0; j < (""+size).length() - (""+i).length(); j++){
//                sizeStr += "0";
//            }
//            sizeStr += i;
//            sb.append("{").append(sizeStr).append("}: ").append(objs[i]).append("\n");
            String format = "%0"+(""+size).length()+"d";
            String sizeStr = String.format(format,i);
            sb.append("{").append(sizeStr).append("}: ").append(objs[i]).append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Faker faker = new Faker(1);
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i <= 5; i++) {
            myArrayList.add(faker.chineseName(2,3,false));
        }
        System.out.println(myArrayList);

        myArrayList.delete(4);
//        for(int i = 0; i < myArrayList.size(); i++) {
//            System.out.println(myArrayList.get(i));
//        }

        System.out.println(myArrayList);
    }
}
