public class Bolsista extends Aluno {

    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);  // Chama o construtor da superclasse Pessoa
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga com desconto.");
    }
}