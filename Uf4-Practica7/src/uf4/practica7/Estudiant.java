package uf4.practica7;

public class Estudiant {

    private String dni;
    private String nom;
    private String cognom;
    private double notaFinal;

    public Estudiant(String dni, String nom, String cognom, double notaFinal) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.notaFinal = notaFinal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String toString() {
        return "Estudiant: " + nom + " " + cognom + " amb nota final: " + notaFinal;
    }
}
