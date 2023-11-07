package classes;

import java.util.Objects;

public class Disciplina {

    String disciplina;
    int nota;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return getNota() == that.getNota() && Objects.equals(getDisciplina(), that.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDisciplina(), getNota());
    }

    @Override
    public String toString() {
        return "\nDisciplina = {" +
                "disciplina = '" + disciplina + '\'' +
                ", nota=" + nota +
                "}\n";
    }
}