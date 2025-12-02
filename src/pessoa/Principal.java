package pessoa;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carol");
        pessoa1.setIdade(18);


        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Mauro");
        pessoa2.setIdade(16);

        System.out.println(pessoa1.exibir());
        pessoa1.verificarIdade();

        System.out.println(pessoa2.exibir());
        pessoa2.verificarIdade();

    }
}
