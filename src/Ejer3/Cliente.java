package Ejer3;

public class Cliente {
    private String nombres;
    private String apepat;
    private String apemat;
    private int dni;

    public Cliente(String nombres, String apepat, String apemat, int dni) {
        this.nombres = nombres;
        this.apepat = apepat;
        this.apemat = apemat;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombres='" + nombres + '\'' +
                ", apepat='" + apepat + '\'' +
                ", apemat='" + apemat + '\'' +
                ", dni=" + dni +
                '}';
    }
}
