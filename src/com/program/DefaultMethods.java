package com.program;

interface A{
    default void display(){
        System.out.println("A");
    }
}


//interface B{
//    default void display(){
//        System.out.println("B");
//    }
//}



//class C implements A,B{
//    public void display(){
//        B.super.display();
//        A.super.display();
//        System.out.println("C");
//
//    }
//}


//public class DefaultMethods extends C {
//    public static void main (String[]args){
//        DefaultMethods d = new DefaultMethods();
//        d.display();
//    }
//}

public class DefaultMethods implements A {
    public static void main (String[]args){
        DefaultMethods d = new DefaultMethods();
        d.display();
    }
}
