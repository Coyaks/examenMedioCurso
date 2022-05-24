package Ejer4;

public class Main {
    public static void main(String[] args) {

        Distrito dis=new Distrito("Chorrillos");
        Provincia p=new Provincia("Lima",dis);
        Departamento d=new Departamento("Lima",p);
        
        System.out.println(d.toString());
    }
}
