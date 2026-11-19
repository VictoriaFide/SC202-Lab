/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author carla
 */
public class ServicioAlCliente {
    
    public static int pedirCantidadProductos() {
        int cantidad;
        do {
            cantidad = Integer.parseInt(
                    JOptionPane.showInputDialog("¿Cuantos productos va a registrar"));
        } while (cantidad <= 0);
        return cantidad;
    }
    
    public static SuperMercado pedirSuperMercado(){
        String nombre = JOptionPane.showInputDialog("Nombre del empleado:");
        String cedula = JOptionPane.showInputDialog("Cedula del empleado:");
        return new Empleado(nombre, cedula);
    }
    
    public  static void LLenarProductos(Producto[] productos) {
        for (int i = 0; i < productos.length; i++) {
            JOptionPane.showMessageDialog(null,"Datos del producto" + (i + 1));
            
            String codigo = JOptionPane.showInputDialog("Codigo del producto:");
            String nombre = JOptionPane.showInputDialog("Nombre del producto");
            
            String tipo:
            do {
                tipo =JOptionPane.showInputDialog(
                        "Tipo de producto, Alimentos, Bebidas, Productos de higiene o Productos de limpieza");
            }
