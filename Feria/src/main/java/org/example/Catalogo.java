package org.example;

public class Catalogo extends Feria {
    private String producto;
    private double precio;

    public Catalogo(String nombreFeria, String parqueSede, String direccion, String localidad, String producto, double precio) {
        super(nombreFeria, parqueSede, direccion, localidad);
        this.producto = producto;
        this.precio = precio;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("[CATÁLOGO DE PRODUCTO]");
        System.out.println("Feria: " + getNombreFeria() + " (" + getParqueSede() + " - " + getLocalidad() + ")");
        System.out.println("Producto: " + this.producto + " | Precio: $" + this.precio);

        if (this.precio > 20000.0) {
            System.out.println(">> Estado: Producto de categoría mayor.");
        } else {
            System.out.println(">> Estado: Producto de categoría estándar.");
        }
        System.out.println("--------------------------------------------------");
    }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}