public class Main {
    public static void main(String[] args) {
        // 3 objetos de disciplina
        Disciplina d1 = new Disciplina("N685", "Programação Orientada a Objetos", 1);
        Disciplina d2 = new Disciplina("N683", "Raciocíno Lógico e Algorítmos", 1);
        Disciplina d3 = new Disciplina("N680", "Matemática para a computação", 1);

        // 3 objetos aluno (2 regulares e 1 bolsista)
        Aluno r1 = new Regular("12456789", "Leticia Diogenes", 22, "475555");
        Aluno r2 = new Regular("987654321", "Jorgirerison Leite", 23, "475556");
        Aluno b1 = new Bolsista("678912345", "Raphaela Maria", 17, "475542");

        // 1 objeto professor
        Professor p1 = new Professor("123456889", "André Wescley", 30, "Tecnologia da Informação");
        
        // 2 objetos visitante
        Pessoa v1 = new Visitante("8934272", "Gian Gabriel", 19);
        Pessoa v2 = new Visitante("9784200", "Carla Thuany", 19);

        // 3 objetos Turma
        Turma t1 = new Turma("T101", d1, p1);
        Turma t2 = new Turma("T102", d2, p1);
        Turma t3 = new Turma("T103", d3, p1);
        
        // imprimindo turma, código da turma, professor da turma, disciplina e lista 
        t1.adicionarProfessor(p1);
        t2.adicionarProfessor(p1);
        t3.adicionarProfessor(p1);

        t1.adicionarAluno(r1);
        t1.adicionarAluno(r2);
        t1.adicionarAluno(b1);

        t2.adicionarAluno(r1);
        t2.adicionarAluno(r2);
        t2.adicionarAluno(b1);

        t3.adicionarAluno(r1);
        t3.adicionarAluno(r2);
        
        t1.listarAlunos();
        t2.listarAlunos();
        t3.listarAlunos();

        System.out.println("Visitante 1: " + v1.getNome());
        System.out.println("Visitante 2: " + v2.getNome());
    }
}
