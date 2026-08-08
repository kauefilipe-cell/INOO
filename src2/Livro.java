public class Livro {
    String titulo;
    double valor;
    Autor autor;


    void imprimir(){
        System.out.println(titulo);
        autor.imprimirAutor();
        System.out.println(valor);
        System.out.println();
    }

//    void aplicaDesconto(double desconto){
//        valor = valor * (1 - desconto);
//    }

    void aplicaDesconto(double valor){
        this.valor = this.valor * (1 - valor);
    }

//    double descontao(){
//        return valor*.9;
//    }
}