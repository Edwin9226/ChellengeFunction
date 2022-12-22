package com.ks.poo.challenge;

import java.util.function.Function;

public class AppFunctions {

    public static  void main(String[] args){

        Function<A,String> func1= x-> x.toString();
                A a= new A(20.1, "prueba", 68);

                String apply= func1.apply(a);
                System.out.println(apply);

        Function<B,String> func2= y-> y.toString();
        B b= new B(12.5, "prueba", "68");

        String applyb = func2.apply(b);
        System.out.println(applyb);



    }

    }
