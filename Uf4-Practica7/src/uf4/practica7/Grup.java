package uf4.practica7;

public class Grup {

    private String nom;
    private Estudiant[] estudiants;
    private Professor tutor;

    public Grup(String nom, Estudiant[] estudiants, Professor tutor) {
        this.nom = nom;
        this.estudiants = estudiants;
        this.tutor = tutor;
    }

    public Grup(String nom, int numEstudiants, Professor tutor) {
        this.nom = nom;
        this.estudiants = new Estudiant[numEstudiants];
        this.tutor = tutor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Estudiant[] getEstudiants() {
        return estudiants;
    }

    public void setEstudiants(Estudiant[] estudiants) {
        this.estudiants = estudiants;
    }

    public Professor getTutor() {
        return tutor;
    }

    public void setTutor(Professor tutor) {
        this.tutor = tutor;
    }
}
