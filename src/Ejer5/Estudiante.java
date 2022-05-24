package Ejer5;

import java.util.Arrays;

public class Estudiante extends Persona{
    private int codigo;
    private String cursos[];
    private int nCursos;

    public Estudiante(String nombre, String apellidos, int edad, int codigo, String[] cursos, int nCursos) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
        this.cursos = cursos;
        this.nCursos = nCursos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo=" + codigo +
                ", cursos=" + Arrays.toString(cursos) +
                ", nCursos=" + nCursos +
                '}';
    }
}
