package modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


    public String exibeFichaTecnica(){
        return "Nome do filme: " + nome +
                "\nAno de lançamento: " + anoLancamento;
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
