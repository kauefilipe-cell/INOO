package br.edu.ifsp.kanban.modelo;

public class Quadro {

    //2.1
    public static final int CAPACIDADE = 5;
    public static final int LIMITE_EM_ANDAMENTO = 2;

    private String nome;
    private Cartao[] cartoes;
    private int quantidade;

    //2.1
    public Quadro(String nome){
        this.nome = nome;
        this.cartoes = new Cartao[CAPACIDADE];
        this.quantidade = 0;
    }

    //2.2
    public boolean adiciona(Cartao cartao){
        if (cartao == null || quantidade == cartoes.length || buscarPorTitulo(cartao.getTitulo()) != null){
            return false;
        }
        cartoes[quantidade] = cartao;
        quantidade++;
        return true;
    }

    //2.3
    public Cartao buscarPorTitulo(String titulo){
        for (int i = 0; i < quantidade; i++){
            if (cartoes[i].getTitulo() == (titulo)){
                return cartoes[i];
            }
        }
        return null;
    }

    //2.4
    public boolean avanca(String titulo){
        Cartao cartao = buscarPorTitulo(titulo);
        if(cartao == null || cartao.getFase() == Cartao.TODO && contaPorFase(Cartao.DOING) >= LIMITE_EM_ANDAMENTO){
            return false;
        }
        return cartao.avanca();
    }

    public int calculaHorasPendentes(){
        int soma = 0;
        for (int i = 0; i < quantidade; i++){
            if (!cartoes[i].estaConcluido()){
                soma += cartoes[i].getEstimativaEmHoras();
            }
        }
        return soma;
    }

    //2.5
    public int contaPorFase(int fase){
        int total = 0;
        for (int i = 0; i < quantidade; i++){
            if (cartoes[i].getFase() == fase){
                total++;
            }
        }
        return total;
    }

    public int contaSemResponsavel(){
        int total = 0;
        for (int i = 0; i < quantidade; i++){
            if (cartoes[i].getResponsavel() == null){
                total++;
            }
        }
        return total;
    }

    //2.6
    public Cartao obtemMaiorEstimativa(){
        if (quantidade == 0){
            return null;
        }
        Cartao maior = cartoes[0];
        for (int i = 1; i < quantidade; i++){
            if (cartoes[i].getEstimativaEmHoras() > maior.getEstimativaEmHoras()){
                maior = cartoes[i];
            }
        }
        return maior;
    }

    //2.7
    public void listaCartoes(){
        System.out.println("== " + nome + " (" + quantidade + "/" + CAPACIDADE + ") ==");
        if (quantidade == 0){
            System.out.println("nenhum cartao cadastrado");
            return;
        }
        for (int i = 0; i < quantidade; i++){
            cartoes[i].mostrarDetalhes();
        }
    }

}
