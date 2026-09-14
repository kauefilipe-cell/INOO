package br.edu.ifsp.kanban.app;

import br.edu.ifsp.kanban.modelo.Cartao;
import br.edu.ifsp.kanban.modelo.Quadro;

// Avaliacao 1 - Versao B - classe FORNECIDA pelo professor.
// Salve este arquivo em src/br/edu/ifsp/kanban/app/SistemaKanban.java
// Nao altere o codigo. Voce so pode:
//   - comentar as linhas que usam metodos que voce NAO implementou, para o projeto compilar;
//   - descomentar o bloco da Etapa 3 (desafio), se implementar o metodo arquiva;
//   - escrever a resposta do item 3.2 no comentario indicado no final.
public class SistemaKanban {
    public static void main(String[] args) {
        Quadro quadro = new Quadro("Semestre 2026-2");

        Cartao ad1 = new Cartao("Fazer a AD1", 4, "Ana");
        Cartao ad2 = new Cartao("Fazer a AD2", 6, "Bruno");
        Cartao arrays = new Cartao("Estudar arrays", 3, "Ana");
        Cartao slides = new Cartao("Preparar slides", 5, "Carla");

        Cartao pacotes = new Cartao("Revisar pacotes");
        System.out.println("reestima 2: " + pacotes.reestima(2));
        System.out.println("reestima -1: " + pacotes.reestima(-1));
        System.out.println("atribui null: " + pacotes.atribui(null));

        System.out.println("adiciona AD1: " + quadro.adiciona(ad1));
        System.out.println("adiciona AD2: " + quadro.adiciona(ad2));
        System.out.println("adiciona arrays: " + quadro.adiciona(arrays));
        System.out.println("adiciona slides: " + quadro.adiciona(slides));

        Cartao ad1Repetido = new Cartao("Fazer a AD1");
        System.out.println("adiciona AD1 repetido: " + quadro.adiciona(ad1Repetido));

        System.out.println("adiciona pacotes: " + quadro.adiciona(pacotes));

        Cartao listas = new Cartao("Corrigir listas", 2, "Bruno");
        System.out.println("adiciona listas: " + quadro.adiciona(listas));

        System.out.println("avanca AD1: " + quadro.avanca("Fazer a AD1"));
        System.out.println("avanca AD1: " + quadro.avanca("Fazer a AD1"));
        System.out.println("avanca AD2: " + quadro.avanca("Fazer a AD2"));
        System.out.println("avanca AD2: " + quadro.avanca("Fazer a AD2"));
        System.out.println("avanca arrays: " + quadro.avanca("Estudar arrays"));
        System.out.println("avanca arrays: " + quadro.avanca("Estudar arrays"));
        System.out.println("avanca AD1: " + quadro.avanca("Fazer a AD1"));
        System.out.println("avanca pacotes: " + quadro.avanca("Revisar pacotes"));
        System.out.println("avanca pacotes: " + quadro.avanca("Revisar pacotes"));
        System.out.println("avanca arrays: " + quadro.avanca("Estudar arrays"));
        System.out.println("avanca TCC: " + quadro.avanca("Escrever TCC"));
        System.out.println("reestima AD1: " + ad1.reestima(10));

        quadro.listaCartoes();

        System.out.println("horas pendentes: " + quadro.calculaHorasPendentes());
        System.out.println("em DOING: " + quadro.contaPorFase(Cartao.DOING));
        System.out.println("em DONE: " + quadro.contaPorFase(Cartao.DONE));
        System.out.println("sem responsavel: " + quadro.contaSemResponsavel());

        Cartao maior = quadro.obtemMaiorEstimativa();
        System.out.println("maior estimativa: " + maior.getTitulo());

        System.out.println("cartoes criados: " + Cartao.getTotalDeCartoes());

        // ===== Etapa 3 (desafio): descomente se implementar o metodo arquiva =====
        // System.out.println("arquiva AD2: " + quadro.arquiva("Fazer a AD2"));
        // System.out.println("arquiva AD1: " + quadro.arquiva("Fazer a AD1"));
        // quadro.listaCartoes();

        // Resposta do item 3.2:
        //
    }
}
