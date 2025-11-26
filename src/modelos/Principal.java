package modelos;

public class Principal{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Moana");
        meuFilme.setAnoLancamento(2016);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDasAvaliacoes());

    }
}