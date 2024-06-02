public class Regular extends Aluno {

    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);  // Chama o construtor da superclasse Pessoa
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga integralmente.");
    }
}