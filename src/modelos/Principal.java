package modelos;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

//        favorito.exibirFichaTecnica();

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La casa de papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

//        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);
        filtro.filtra(outro);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("LA casa");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        var filmeDaMaki = new Filme();
        filmeDaMaki.setNome("Jujutsu Kaisen");
        filmeDaMaki.setAnoDeLancamento(2010);
        filmeDaMaki.setIncluidoNoPlano(true);
        filmeDaMaki.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaMaki);
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outro);

        System.out.println("Tamanho da Lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }
}