package org.example;

public class Emprendedor extends Feria{
    private String NomEmpr;
    private String NombreEmprendi;


    public Emprendedor(String idRegistro, String categoria, String NomEmpr, String NombreEmprendi){
        super(idRegistro, categoria);
        this.NomEmpr = NomEmpr;
        this.NombreEmprendi = NombreEmprendi;
    }

    public String getNombreEmprendi() {
        return NombreEmprendi;
    }

    public String getNomEmpr() {
        return NomEmpr;
    }

    public void setNombreEmprendi(String nombreEmprendi) {
        NombreEmprendi = nombreEmprendi;
    }

    public void setNomEmpr(String nomEmpr) {
        NomEmpr = nomEmpr;
    }

    @Override
    public void Detalle(){
        System.out.println("EMPRENDEDOR PARTICIPANTE");
        System.out.println("La feria numero: " + getIdRegistro() + "Con la categoria: " + getCategoria());
        System.out.println("Emprendedor: " + this.NomEmpr + "Emprendimiento: " + this.NombreEmprendi);
    }
}
