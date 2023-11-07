package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    String nome;
    int idade;
    String dataNascimento;
    String nomePai;
    String nomeMae;
    String numeroRg;
    String numeroCpf;
    String nomeEscola;
    String serieMatriculado;

    List<Disciplina> disciplinas = new ArrayList<>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getMedia(){
        double somaNotas = 0;
        for (Disciplina disciplinas: disciplinas
        ) {
            somaNotas += disciplinas.getNota();
        }
        return somaNotas / disciplinas.size();
    }

    public String alunoAprovado(){
        if (getMedia() > 50){
            if (getMedia() > 70){
                return "Aluno Aprovado com média igual a: " +getMedia()+ ".";
            }else {
                return "Aluno em recuperação com média igual a: " +getMedia()+ ".";
            }
        }else {
            return "Aluno reprovado com média igual a: " +getMedia()+ ".";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getNome(), aluno.getNome()) && Objects.equals(getNumeroRg(), aluno.getNumeroRg()) && Objects.equals(getNumeroCpf(), aluno.getNumeroCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroRg(), getNumeroCpf());
    }

    @Override
    public String toString() {
        return "\nAluno\n{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", numeroRg='" + numeroRg + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", \ndisciplinas=\n" + disciplinas +
                '}';
    }
}
