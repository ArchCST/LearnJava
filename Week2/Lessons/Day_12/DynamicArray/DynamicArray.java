package Week2.Lessons.Day_12.DynamicArray;

import Week1.Lessons.Day_2;
import Week2.Lessons.Day_12.Animal.Cat;

import java.io.ObjectStreamException;
import java.util.ArrayList;

/*
实现简单的动态数组
    让数组可以存储各种数据类型
    长度不固定
 */
public class DynamicArray {
    private int length;
    private int size = 10;
    private int increase = 10;
    private Object[] data;

    // constructor
    public DynamicArray() {
        length = 0;
        data = new Object[10];
    }

    // add new object to the dynamic array
    public void add(Object object) {
        if (length < size) {
            data[length++] = object;
        } else {
            size += increase;
            Object[] newData = new Object[size];
            int i = 0;
            for (Object obj : data) {
                newData[i++] = obj;
            }
            newData[length++] = object;
            data = newData;
        }
    }

    // remove an object from index
    public void remove(int index) {
        if (index == length - 1) {
            data[index] = null;
            length--;
        } else if (index < length - 1){
            for (int i = index; i < length; i++) {
                data[i] = data[i + 1];
            }
            length--;
        } else {
            System.out.println("error!");
        }

    }

    // update object with index and an object
    public void update(int index, Object object) {
        data[index] = object;
    }

    // validate index error
    private boolean indexError(int index){
        if (index > length - 1 || index < 0) {
            System.out.println("Wrong index!");
            return true;
        } else {
            return false;
        }
    }

    // return length of the dynamic array
    public int getLength() {
        return length;
    }


    public Object getItem(int index) {
        return data[index];
    }

    // print all the objects in the dynamic array
    public void each() {
        for (int i = 0; i < length; i++) {
            System.out.println(data[i]);
        }
    }



    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 5; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.remove(5);

        dynamicArray.each();
    }
}
