package visao;

import java.util.ArrayList;
import dominio.ClasseProduto;
import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {

    private ClasseProdutoServico srv;

    public ClasseProdutoVisao() {
        this.srv = new ClasseProdutoServico();
    }

    public void Exibir() {

        // ClasseProdutoFakeDB db = new ClasseProdutoFakeDB();
        // ArrayList<ClasseProduto> lista = db.getTabela();

        // ClasseProdutoRepo repo = new ClasseProdutoRepo();
        // ArrayList<ClasseProduto> lista = repo.Browse();]

        ArrayList<ClasseProduto> lista = this.srv.Navegar();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        for (ClasseProduto cp : lista) {
            this.Imprimir(cp);
        }
    }

    public void ExibirPorLinha() {
        ArrayList<ClasseProduto> lista = this.srv.Navegar();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        for (ClasseProduto cp : lista) {
            this.ImprimirPorLinha(cp);
        }
    }

    public void Imprimir(ClasseProduto alvo) {
        System.out.println("Classe de Produto:");
        System.out.println("Código: " + alvo.getCodigo());
        System.out.println("Descrição: " + alvo.getDescricao());
        System.out.println("Data de Inclusão: " + alvo.getDataDeInclusao());
        System.out.println("-------------//-------------//-------------//-------------");

    }

    public void ImprimirPorLinha(ClasseProduto cp) {
        String mensagem = "";
        mensagem += "Classe deProduto: ";
        mensagem += "Código: " + cp.getCodigo() + " | ";
        mensagem += "Descrição: " + cp.getDescricao() + " | ";
        mensagem += "Data de Inclusão: " + cp.getDataDeInclusao();
        System.out.println(mensagem);
    }

    public void ImprimirPorLinha(int chave) {
        ClasseProduto cp = this.srv.Ler(chave);
        this.ImprimirPorLinha(cp);
    }

    public void Criar(ClasseProduto novo) {
        this.srv.Adicionar(novo);
    }

    public void Editar(int chave, ClasseProduto alt) {
        ClasseProduto cp = this.srv.Ler(chave);
        if (cp != null) {
            cp.setDescricao(alt.getDescricao());
        } else {
            System.out.println("Item não localizado.");
        }

    }

    public void Remover(int chave) {
        ClasseProduto cp = this.srv.Ler(chave);
        if (cp != null) {
            this.srv.Remover(chave);

        } else {
            System.out.println("Item não localizado.");
        }

    }
}