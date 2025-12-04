package tributavel;

public class Servico implements Tributavel{
    private String Descricao;
    private double valor;
    private double aliquotaINSS;

    @Override
    public double getValorImposto() {
        return this.valor * this.aliquotaINSS / 100;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAliquotaINSS() {
        return aliquotaINSS;
    }

    public void setAliquotaINSS(double aliquotaINSS) {
        this.aliquotaINSS = aliquotaINSS;
    }
}
