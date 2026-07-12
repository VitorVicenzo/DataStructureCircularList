package edu.vitor.dio.data_structure;

public class Main {
    public static void main (String[] args){
        CircularList<String> myCircularList = new CircularList<>();

        myCircularList.add("c0");
        System.out.println(myCircularList);

        myCircularList.remove(0);
        System.out.println(myCircularList);

        myCircularList.add("c1");
        System.out.println(myCircularList);

        myCircularList.add("c2");
        myCircularList.add("c3");
        System.out.println(myCircularList);

        System.out.println(myCircularList.get(0));
        System.out.println(myCircularList.get(1));
        System.out.println(myCircularList.get(2));
        System.out.println(myCircularList.get(3));
        System.out.println(myCircularList.get(4));
        System.out.println(myCircularList.get(5));

        for (int i = 0; i < 20; i++) {
            System.out.println(myCircularList.get(i));
        }
    }
}
