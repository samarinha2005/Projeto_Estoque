package dominio;

import java.time.LocalDate;

public class Produto extends BaseParametro {
    private int codigoSubclasse;
    private double valor;

    public int getCodigoSubclasse() {
        return codigoSubclasse;
    }

    public void setCodigoSubclasse(int codigoSubclasse) {
        this.codigoSubclasse = codigoSubclasse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto() {
        super();
    }

    public Produto(int codigo, String descricao, LocalDate dataDeInclusao, int codigoSubclasse, double valor) {
        super(codigo, descricao, dataDeInclusao);
        this.codigoSubclasse = codigoSubclasse;
        this.valor = valor;
    }

    @Override
    public String toString() {
        String msg = "SubclasseProduto";
        msg += "\n\tcodigo=" + this.codigo;
        msg += "\n\tdescricao=" + this.descricao;
        msg += "\n\tdataDeInclusao=" + this.dataDeInclusao;
        msg += "\n\tcodigoSubClasse=" + this.codigoSubclasse;
        msg += "\n\tvalor=" + this.valor;
        return msg;
    }
}