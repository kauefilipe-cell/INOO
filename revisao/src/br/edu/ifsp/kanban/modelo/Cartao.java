package br.edu.ifsp.kanban.modelo;

public class Cartao {

    //1.1
    public static final int BACKLOG = 0;
    public static final int TODO = 1;
    public static final int DOING = 2;
    public static final int DONE = 3;

    private static final String[] NOMES_DAS_FASES = {"BACKLOG", "TODO", "DOING", "DONE"};

    //1.2
    private int codigo;
    private String titulo;
    private String responsavel;
    private int estimativaEmHoras;
    private int fase;

    private static int totalDeCartoes = 0;

    //1.2
    public Cartao(String titulo){
        this.titulo = titulo;
        this.fase = BACKLOG;
        this.responsavel = null;
        this.estimativaEmHoras = 1;

        totalDeCartoes++;
        this.codigo = totalDeCartoes;
    }

    //1.3
    public Cartao(String titulo, int estimativaEmHoras, String responsavel){
        this(titulo);
        reestima(estimativaEmHoras);
        atribui(responsavel);
    }

    //1.4
    public boolean reestima(int horas){
        if(estaConcluido() || horas <= 0){
            return false;
        }
        this.estimativaEmHoras = horas;
        return true;
    }

    public boolean atribui(String responsavel){
        if(estaConcluido() || responsavel == null){
            return false;
        }
        this.responsavel = responsavel;
        return true;
    }

    //1.5
    public boolean avanca(){
        if (fase == DONE){
            return false;
        }
        if (fase == TODO && responsavel == null){
            return false;
        }
        fase++;
        return true;
    }

    public boolean estaConcluido(){
        if (fase == DONE){
            return true;
        }
        return false;
    }

    public String getNomeDaFase(){
        return NOMES_DAS_FASES[fase];
    }

    public void mostrarDetalhes(){
        System.out.println("#" + codigo + " " + titulo + " [" + getNomeDaFase() + "] | responsavel: " + responsavel + " | " + estimativaEmHoras + "h");
    }

    //1.5
    public int getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getResponsavel(){
        return responsavel;
    }

    public int getEstimativaEmHoras(){
        return estimativaEmHoras;
    }

    public int getFase(){
        return fase;
    }

    public static int getTotalDeCartoes(){
        return totalDeCartoes;
    }

}
