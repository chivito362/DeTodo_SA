
package com.mycompany.detodo_sa.logica;


public class Producto implements Comparable<Producto>{
private int codigo_prod;
private String desc;
private double precio;
private int stock;
private Categoria rubro;

    public Producto() {
    }

    public Producto(int codigo_prod, String desc, double precio, int stock, Categoria rubro) {
        this.codigo_prod = codigo_prod;
        this.desc = desc;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(int codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto o) {
       if(codigo_prod== o.codigo_prod){
           return 0;
       }else if(codigo_prod > o.codigo_prod){
           return 1;
       }else{
           return -1;
       }
    }
     

}
