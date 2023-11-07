import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        int cadastrarNovoAluno = 0;

        List<Aluno> alunos = new ArrayList<Aluno>();

        do {

            String nome = JOptionPane.showInputDialog("Digite o nome do Aluno:");
            String dataNascimento = JOptionPane.showInputDialog("Digite a data de Nascimento do Aluno:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Aluno:"));
            String nomePai = JOptionPane.showInputDialog("Digite o nome do Pai do Aluno:");
            String nomeMae = JOptionPane.showInputDialog("Digite o nome da mãe do Aluno:");
            ;
            String rg = JOptionPane.showInputDialog("Digite o RG do Aluno:");
            String cpf = JOptionPane.showInputDialog("Digite o CPF do Aluno");
            String nomeEscola = JOptionPane.showInputDialog("Digite o nome da Escola");
            String serie = JOptionPane.showInputDialog("Digite a série que o Aluno está matriculado:");
            int quantidadesDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Quantas Disciplinas você deseja cadastrar?"));

            Aluno aluno = new Aluno();

            aluno.setNome(nome);
            aluno.setIdade(idade);
            aluno.setDataNascimento(dataNascimento);
            aluno.setNomeMae(nomeMae);
            aluno.setNomePai(nomePai);
            aluno.setNumeroRg(rg);
            aluno.setNumeroCpf(cpf);
            aluno.setNomeEscola(nomeEscola);
            aluno.setSerieMatriculado(serie);

            for (int pos = 1; pos <= quantidadesDisciplina; pos++) {

                String materia = JOptionPane.showInputDialog("Digite o nome da Disciplina " + pos + ".");
                int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota " + pos + "."));

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(materia);
                disciplina.setNota(nota);
                aluno.getDisciplinas().add(disciplina);
            }
            int excluirDisciplina = JOptionPane.showConfirmDialog(null, "Deseja excluir alguma Disciplina?");

            if (excluirDisciplina == 0) {
                int disciplinaEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Digite o número correspondente da Disciplina para excluir: " + aluno.getDisciplinas()));
                aluno.getDisciplinas().remove(disciplinaEscolhida - 1);
                JOptionPane.showMessageDialog(null, "Disciplina Excluida com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma Disciplina excluida.");
            }

            alunos.add(aluno);

            cadastrarNovoAluno = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar um novo Aluno?");
        } while (cadastrarNovoAluno == 0);

        System.out.println("Lista de Alunos:");
        for (Aluno aluno: alunos
             ) {
            System.out.println(aluno.getNome()+"\n");
            System.out.println("-------------------------------------------------------------------------------");

        }


        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            System.out.println("Média do aluno: " + aluno.getMedia());
            System.out.println(aluno.alunoAprovado());
            System.out.println("-------------------------------------------------------------------------------");
        }

    }
}