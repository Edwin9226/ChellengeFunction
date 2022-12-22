package com.ks.poo.interfaces;

public class Comensal {
    String nombre;
    double monto;
    int menssage;

    public Comensal(String nombre, double monto, int menssage) {
        this.nombre = nombre;
        this.monto = monto;
        this.menssage = menssage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMenssage() {
        return menssage;
    }

    public void setMenssage(int menssage) {
        this.menssage = menssage;
    }
}
