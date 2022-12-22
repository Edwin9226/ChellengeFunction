package com.ks.poo.lambdas;

public class AppOperations {

    public static  void main(String[] args){
        Operations op=(x,y)->{
          System.out.println(x+y);
        };
        op.imprieSuma(4,6);

        AppOperations obj= new AppOperations();
        obj.miMetodo(op,3,8);
    }

    public void miMetodo(Operations op, int x, int y){
        op.imprieSuma(x,y);
    }
}
