import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        this.professor = professor;
    }

    public void listarAlunos() {
        System.out.println("Alunos na turma de código:" + codigo + " (" + disciplina.getNome() + "):");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
        System.out.println("Professor:" + professor.getNome());
        System.out.println("================================================================");
    }
}
