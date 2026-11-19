/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author carla
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String Tipo;
    private double precioBase;
    private double precioBruto;
    private double GananciaEsperada;
    private int Cantidad;

    public Producto(String codigo, String nombre, String Tipo, double precioBase, double precioBruto, double GananciaEsperada, int Cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Tipo = Tipo;
        this.precioBase = precioBase;
        this.precioBruto = precioBruto;
        this.GananciaEsperada = GananciaEsperada;
        this.Cantidad = Cantidad;
        
        calcularGananciaEsperada();
        calcularPrecioBruto();
    }
        private void calcularPrecioBruto() {
            if (Tipo.equals ("Alimentos")){
                precioBruto =precioBase * 0.20 + precioBase;
            } else if (Tipo.equals ("Bebidas")){
                precioBruto = precioBase * 0.30 + precioBase;
            } else if (Tipo.equals("Higiene")){
                precioBruto = precioBase * 0.25 +precioBase + 500;
            } else if (Tipo.equals("Limpieza")){
                precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
            }
             
        private void calcularGananciaEsperada() {
           GananciaEsperada = (precioBruto - precioBase) * cantidad;
       } 

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGananciaEsperada() {
        return GananciaEsperada;
    }

    public void setGananciaEsperada(double GananciaEsperada) {
        this.GananciaEsperada = GananciaEsperada;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", Tipo=" + Tipo + ", precioBase=" + precioBase + ", precioBruto=" + precioBruto + ", GananciaEsperada=" + GananciaEsperada + ", Cantidad=" + Cantidad + '}';
    }
    
    
    
}
