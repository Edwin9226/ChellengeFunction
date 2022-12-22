package com.ks.poo.interfaces;

import com.ks.poo.PooApplication;
import org.springframework.boot.SpringApplication;

import java.util.function.Function;

public class AppFunction {
    public static void main(String[] args) {
// implementar la interfax function
        Function<Integer,String>  convertidor= x->Integer.toString(x);

        // como serisa normalmente
        Function<Integer,String>  convertidor2= new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                throw new UnsupportedOperationException("no soportada");
            }
        };

        System.out.println(convertidor.apply(12));

        //2 ejemplo
        // calcular el cuadrado
        Function<Integer, Integer> cuadrado = x-> x *x;
        System.out.println("el cuadrado de 5 es:"+ cuadrado.apply(5));

        // e exMPLE
        // contador de caracteres
        Function<String, Integer> contadorCaracters= str-> str.length();
        String tex= "hola mundo!";
        System.out.println("numero de caracteres es:"+ contadorCaracters.apply(tex));
    }
}
