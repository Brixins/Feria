package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROYECTO: LOCALIDAD EMPRENDE");
        System.out.print("Nombre de la Feria: ");
        String nombreFeria = scanner.nextLine();
        System.out.print("Parque / Sede: ");
        String parqueSede = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Localidad: ");
        String localidad = scanner.nextLine();

        System.out.println("\n--- Datos del Organizador ---");
        System.out.print("Nombre del Organizador: ");
        String nombreOrganizador = scanner.nextLine();
        System.out.print("Contacto: ");
        String contacto = scanner.nextLine();
        Organizador organizador = new Organizador(nombreFeria, parqueSede, direccion, localidad, NombreOrg, Contacto);

        System.out.println("\n--- Datos del Emprendedor ---");
        System.out.print("Nombre del Emprendedor: ");
        String nombreEmprendedor = scanner.nextLine();
        System.out.print("Nombre del Negocio: ");
        String nombreNegocio = scanner.nextLine();
        Emprendedor emprendedor = new Emprendedor(nombreFeria, parqueSede, direccion, localidad, NomEmpr, NombreEmprendi);

        System.out.println("\n--- Datos del Catálogo ---");
        System.out.print("Producto: ");
        String producto = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine()); // Se usa Double.parseDouble para prevenir errores de búfer
        Catalogo catalogo = new Catalogo(nombreFeria, parqueSede, direccion, localidad, producto, precio);

        System.out.println("\n--- Datos del Cronograma ---");
        System.out.print("Fecha de Inicio: ");
        String fechaInicio = scanner.nextLine();
        System.out.print("Fecha de Fin: ");
        String fechaFin = scanner.nextLine();
        Cronograma cronograma = new Cronograma(nombreFeria, parqueSede, direccion, localidad, fechaInicio, fechaFin);

        Feria[] listaFeria = new Feria[4];
        listaFeria[0] = organizador;
        listaFeria[1] = emprendedor;
        listaFeria[2] = catalogo;
        listaFeria[3] = cronograma;

        System.out.println("IMPRESION DATOS REGISTRADOS DE LA FERIA (POLIMORFISMO)");

        for (Feria elemento : listaFeria) {
            elemento.mostrarDetalle();
        }

        scanner.close();
    }
}