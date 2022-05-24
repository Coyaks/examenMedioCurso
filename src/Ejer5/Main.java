package Ejer5;

public class Main {
    public static void main(String[] args) {
        String cursos[]={"Programacion", "Fisica", "Algebra"};
        Estudiante e=new Estudiante("Carlos","Casas Moreno",18,544,cursos,cursos.length);
        System.out.println(e.toString());
    }
}
