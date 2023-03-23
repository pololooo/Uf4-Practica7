package uf4.practica7;

public class Professor {

    private String nom;
    private String cognom;
    private String formacio;

    public Professor(String nom, String cognom, String formacio) {
        this.nom = nom;
        this.cognom = cognom;
        this.formacio = formacio;
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

    public String getFormacio() {
        return formacio;
    }

    public void setFormacio(String formacio) {
        this.formacio = formacio;
    }

    public String toString() {
        return "Professor: " + nom + " " + cognom + " amb formació: " + formacio;
    }
}
