package model;

public class AlunoModel {

    private Integer idAluno;
    private String cpf;
    private String nome;
    private String plano;;
    public String diaPagamento;

    public AlunoModel() {
    }

    public AlunoModel(Integer idAluno, String cpf, String nome, String plano, String diaPagamento) {
        this.idAluno = idAluno;
        this.cpf = cpf;
        this.nome = nome;
        this.plano = plano;
        this.diaPagamento = diaPagamento;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getDiaPagamento() {
        return diaPagamento;
    }

    public void setDiaPagamento(String diaPagamento) {
        this.diaPagamento = diaPagamento;
    }
}
