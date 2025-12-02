package aluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lulu", 10, 9, 8);

        Aluno aluno2 = new Aluno("Bia", 7, 6, 8);


        System.out.println("Aluno 1 " + aluno1.getNome());
        System.out.println("Média " + aluno1.calcularMedia());

        System.out.println("Aluno 2 " + aluno2.getNome());
        System.out.println("Média " + aluno2.calcularMedia());
    }
}
