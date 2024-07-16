package day02_array;

import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyObject obj3 = obj1;

        // 참조값과 유사한 정보를 얻기 위해 identityHashCode 사용
        System.out.printf("obj1 identityHashCode: %x%n", System.identityHashCode(obj1));
        System.out.printf("obj2 identityHashCode: %x%n", System.identityHashCode(obj2));
        System.out.printf("obj3 identityHashCode (same as obj1): %x%n", System.identityHashCode(obj3));
    }
}

class MyObject {
    int value;
}