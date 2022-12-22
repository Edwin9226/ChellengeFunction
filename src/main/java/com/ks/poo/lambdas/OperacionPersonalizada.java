package com.ks.poo.lambdas;

public class OperacionPersonalizada {

    public static  void main(String[] args){
        // generar expresiones con devoluciones
        // Operacion con parametros y mas genericos para enviar el parametro de operacion como argumento
    engine((CalculadoraInt) (x,y)->x+y);

    CalculadoraInt cal1=(x,y)->x-y;
        engine(cal1);



    }

    public static void engine(CalculadoraInt calc){
        int x=2, y=3;
        int resultado= calc.imprieSuma(x,y);
        System.out.println(resultado);

    }

    public static void engine(CalculadoraLong calc){
        Long x=2L, y=3L;
        Long resultado= calc.imprieSuma(x,y);
        System.out.println(resultado);

    }

    public static CalculadoraLong create(){
        return (x,y)->x/y;
    }
}
