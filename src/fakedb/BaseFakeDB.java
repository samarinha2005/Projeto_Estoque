package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {
    // atributo protegido
    protected ArrayList<TDominio> tabela;

    // propriedade somente leitura
    public ArrayList<TDominio> getTabela() {
        return this.tabela;
    }

    // metodos abstratos
    // não podem ter codigo, devem ser codificados nas classes filhas (reais), e
    // este metodo deve ser executado toda vez que a classe filha for instanciada
    public abstract void preencherDados();

    public BaseFakeDB() {
        this.preencherDados();
    }
}