package Ejer3;

public class ClienteController {
    private Cliente cliente[];
    private int contador;

    public ClienteController(Cliente[] cliente, int contador) {
        this.cliente = cliente;
        this.contador = contador;
    }

    public Cliente agregarCliente(Cliente cliente){
        return cliente;
    }
    public void listarCliente(String nombres,String apepat,String apemat,int dni){
        for (int i=0;i<cliente.length;i++){
            System.out.println("nombres: "+nombres);
            System.out.println("apepat: "+apepat);
            System.out.println("apemat: "+apemat);
            System.out.println("dni: "+dni);
        }
    }
    public void buscarCliente(){

    }
    public void editarCliente(){

    }
    public void eliminarCliente(){

    }
}
