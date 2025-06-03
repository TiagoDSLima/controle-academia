package model;

public class InstrutorModel {

    private int idInstrutor;
    private String nomeInstrutor;
    private String crefInstrutor;

    public InstrutorModel() {
    }

    public InstrutorModel(int idInstrutor, String nomeInstrutor, String crefInstrutor) {
        this.idInstrutor = idInstrutor;
        this.nomeInstrutor = nomeInstrutor;
        this.crefInstrutor = crefInstrutor;
    }

    public int getIdInstrutor() {
        return idInstrutor;
    }

    public void setIdInstrutor(int idInstrutor) {
        this.idInstrutor = idInstrutor;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getCrefInstrutor() {
        return crefInstrutor;
    }

    public void setCrefInstrutor(String crefInstrutor) {
        this.crefInstrutor = crefInstrutor;
    }
}
