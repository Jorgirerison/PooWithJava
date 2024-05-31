// Main.java
public class Main {
    public static void main(String[] args) {
        // Criação de uma instância anônima de Pessoa para testar
        Pessoa pessoa = new Pessoa("123.456.789-00", "João", 30) {};
        
        // Exibir idade atual
        System.out.println("Idade antes do aniversário: " + pessoa.getIdade());

        // Incrementar a idade
        pessoa.fazerAniversario();
        
        // Exibir idade após fazer aniversário
        System.out.println("Idade depois do aniversário: " + pessoa.getIdade());

        // Criação de um objeto Disciplina
        Disciplina disciplina = new Disciplina("N685", "Programação Orientada a Objetos", 1);
        System.out.println("Código: " + disciplina.getCodigo());
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Semestre: " + disciplina.getSemestre());
    }
}
