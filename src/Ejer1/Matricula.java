package Ejer1;

public class Matricula {
    private int id;
    private String semestre;

    public Matricula(int id, String semestre) {
        this.id = id;
        this.semestre = semestre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
