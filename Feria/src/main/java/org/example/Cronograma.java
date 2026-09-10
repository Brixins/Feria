package org.example;

public class Cronograma extends Feria {
    private String fechaInicio;
    private String fechaFin;

    public Cronograma(String nombreFeria, String parqueSede, String direccion, String localidad, String fechaInicio, String fechaFin) {
        super(nombreFeria, parqueSede, direccion, localidad);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("[CRONOGRAMA]");
        System.out.println("Feria: " + getNombreFeria() + " (" + getParqueSede() + " - " + getLocalidad() + ")");
        System.out.println("Fecha de Inicio: " + this.fechaInicio + " | Fecha de Fin: " + this.fechaFin);
        System.out.println("--------------------------------------------------");
    }

    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
}