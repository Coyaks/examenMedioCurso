package Ejer3;

public class Main {
    public static void main(String[] args) {
        Cliente c1=new Cliente("Carlos","Lopez","Sanchez",76555432);
        Cliente c2=new Cliente("Nelson","Lopez2","Sanchez2",76555432);
        Cliente c3=new Cliente("Mario","Lopez2","Sanchez3",76555432);
        Cliente cliente[]={c1,c2,c3};
        ClienteController cc=new ClienteController(cliente,1);
        cc.agregarCliente(c1);
    }
}
