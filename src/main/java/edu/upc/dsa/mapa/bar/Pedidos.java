package edu.upc.dsa.mapa.bar;

import java.util.LinkedList;
import java.util.List;

public class Pedidos {
    float precio;
    int cantidad;
    char nombre;
    String nombreCliente;

    List<Pedidos> listaXprecio = new LinkedList<Pedidos>(); //ascendiente por precio
    List<Pedidos> listaXcantidad = new LinkedList<Pedidos>(); //descendiente por cantidad
    List<Pedidos> listaPedidosXcliente = new LinkedList<Pedidos>(); //pedidos por usuario


    public Pedidos(float precio, int cantidad, char nombre, String nombreCliente) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.nombreCliente = nombreCliente;
    }


    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public float getPrecio() {
       return this.precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public char getNombre() {
        return this.nombre;
    }
    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return"Pedido: Nombre Cliente="+nombreCliente+", producto"+nombre+", cantidad"+cantidad+"y precio="+precio+"Fin del pedido";
    }

}
