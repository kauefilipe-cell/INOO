public class Livro {

    private String titulo;
    private double valor;
    private Autor autor;
    private int anoDeLancamento;
    private double maxDesconto;

    public Livro(String titulo, double valor, Autor a){
        this.valor = valor;
        this.titulo = titulo;
        this.autor = a;
        this.anoDeLancamento = 1900;
    }

    public Livro(String titulo, double valor, Autor a, int anoDeLancamento){
        this(titulo,valor,a);
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean aplicaDesconto(){
        System.out.println();
        return this.aplicaDesconto(0.1);
    }

    public boolean aplicaDesconto(double valor){
        if(valor <= 0.3){
            this.valor = this.valor * (1 - valor);
            return true;
        }

        return false;
    }

    void imprimir(){
        System.out.println(titulo);
        autor.imprimir();
        System.out.println(valor);
        System.out.println(anoDeLancamento);
//        System.out.println();
    }
}

