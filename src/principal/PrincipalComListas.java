package principal;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(9);

        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(6);

        var filmeDaMaki = new Filme("Devil wears Prada", 2010);
        filmeDaMaki.avalia(10);

        Serie serie = new Serie("La casa de papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaMaki);
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);
        for (Titulo maca : lista) {
            System.out.println(maca.getNome());
            if (maca instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jackeline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenacao");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Títulos ordenados" + lista);
        Collections.sort(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + lista);
    }
}