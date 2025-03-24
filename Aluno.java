
package projeto2;


public class Aluno extends Pessoa {
    private String matricula;

    // Construtor
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); // Chamando o construtor da superclasse Pessoa
        this.matricula = matricula;
    }

    // Getter e Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Sobrescrita do método exibirDados
    @Override
    public void exibirDados() {
        super.exibirDados(); // Chama o método da superclasse Pessoa
        System.out.println("Matrícula: " + matricula);
    }
}
