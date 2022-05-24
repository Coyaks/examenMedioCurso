package Ejer4;

public class Departamento {
    private String nombre;
    private Provincia provincia;

    public Departamento(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", provincia=" + provincia +
                '}';
    }
}
