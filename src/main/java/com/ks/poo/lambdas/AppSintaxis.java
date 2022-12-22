package com.ks.poo.lambdas;

public class AppSintaxis {

    public static  void main(String[] args){


        //ClassSintaxis interfaceNormal = new ClassSintaxis();
       // interfaceNormal.aceptar();

        Sintaxis f= (val, valor1)->{
            System.out.println("Hola mundo desde lamda"+ val+ valor1);
        };
        //utilizacion desde una  expresion lamda
        f.aceptar(12,3);

        //clase anonima
         StringProcessor nSP= new StringProcessor() {
             @Override
             public String process(String x) {
                 return x.toUpperCase();
             }
         };

         //imprimir
        System.out.println(nSP.process("hola"));

        //inferencia de tipo de expresion: asociar con el tipo de dato que se esta utilizando.
    InferenciaTipo f1=()->{
        System.out.println("Hola mundo");
    };
        // creando un objeto del mismo tipo de la clase
        AppSintaxis testF= new AppSintaxis();
testF.metodo(f1);

    }

    public void metodo(InferenciaTipo parametro){
        parametro.accept();
    }
}


