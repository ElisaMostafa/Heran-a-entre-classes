
package projeto2;


import javax.swing.JOptionPane;

public class Projeto2 {
    public static void main(String[] args) {
        // Entrada de dados via JOptionPane
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
        String matricula = JOptionPane.showInputDialog("Digite a matrícula do aluno:");

        // Criação do objeto Aluno
        Aluno aluno = new Aluno(nome, idade, matricula);

        // Exibição dos dados do aluno
        JOptionPane.showMessageDialog(null, "Dados do Aluno Cadastrado:");
        aluno.exibirDados();
    }
}
