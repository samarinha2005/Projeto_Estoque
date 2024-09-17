package visao;

import java.util.ArrayList;
import java.time.LocalDate;
import dominio.ClasseProduto;
import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {

    public ClasseProdutoVisao() {
    }

    public void Exibir() {

        // ClasseProdutoFakeDB db = new ClasseProdutoFakeDB();
        // ArrayList<ClasseProduto> lista = db.getTabela();

        // ClasseProdutoRepo repo = new ClasseProdutoRepo();
        // ArrayList<ClasseProduto> lista = repo.Browse();]

        ClasseProdutoServico srv = new ClasseProdutoServico();
        ArrayList<ClasseProduto> lista = srv.Navegar();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        for (ClasseProduto cp : lista) {
            this.Imprimir(cp);
        }
    }

    private void Imprimir(ClasseProduto alvo) {
        System.out.println("Classe de Produto:");
        System.out.println("Código: " + alvo.getCodigo());
        System.out.println("Descrição: " + alvo.getDescricao());
        System.out.println("Data de Inclusão: " + alvo.getDataDeInclusao());
        System.out.println("-------------//-------------//-------------//-------------");

    }

    public void Criar() {
        ClasseProduto novo = new ClasseProduto(0, "Teste", LocalDate.now());
        ClasseProdutoServico srv = new ClasseProdutoServico();
        srv.Adicionar(novo);
        Imprimir(novo);
    }
}