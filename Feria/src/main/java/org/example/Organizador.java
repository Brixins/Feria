package org.example;

public class Organizador extends Feria {
    private String NombreOrg;
    private String Contacto;


    public Organizador(String idRegistro, String categoria, String NombreOrg, String Contacto) {
        super(idRegistro, categoria);
        this.Contacto = Contacto;
        this.NombreOrg = NombreOrg;
    }

    public String getNombreOrg() {
        return NombreOrg;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }

    public void setNombreOrg(String nombreOrg) {
        NombreOrg = nombreOrg;
    }

    @Override
    public void Detalles() {
        System.out.println("ORGANIZADOR DE LA FERIA");
        System.out.println("La feria numero: " + getIdRegistro() + "Con la categoria: " + getCategoria());
        System.out.println("Encargado: " + this.NombreOrg + "Entidad" + this.Contacto);

    }
}
