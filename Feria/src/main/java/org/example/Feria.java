package org.example;

public abstract class Feria {
    private String nombreFeria;
    private String parqueSede;
    private String direccion;
    private String localidad;

    public Feria(String nombreFeria, String parqueSede, String direccion, String localidad) {
        this.nombreFeria = nombreFeria;
        this.parqueSede = parqueSede;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    public abstract void mostrarDetalle();

    public String getNombreFeria() { return nombreFeria; }
    public void setNombreFeria(String nombreFeria) { this.nombreFeria = nombreFeria; }

    public String getParqueSede() { return parqueSede; }
    public void setParqueSede(String parqueSede) { this.parqueSede = parqueSede; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }
}