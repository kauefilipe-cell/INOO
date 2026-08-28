public class CalculadoraDeEstoque {

    public static void main(String[] args) {

        Autor a = new Autor("Julio Werner","jw@gmail.com");
        Livro livro20leguas = new Livro("20.000 Léguas Submarinas",19.90,a);

        Autor b = new Autor("Sun Tzu","st@gmail.com");
        Livro arteDaGuerra = new Livro("A arte da Guerra", 9.90,a,-2000);

       boolean descontoAplicado = livro20leguas.aplicaDesconto(0.4);

       if(descontoAplicado)
           System.out.println("O desconto foi aplicado");
       else
           System.out.println("O desconto não foi aplicado");


        System.out.println(livro20leguas.getValor());

       livro20leguas.imprimir();
       arteDaGuerra.imprimir();

    }
}
