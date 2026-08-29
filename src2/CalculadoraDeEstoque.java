public class CalculadoraDeEstoque {

    public static void main(String[] args) {

        Autor a = new Autor("Julio Werner","jw@gmail.com");
        Livro livro20leguas = new Livro("20.000 Léguas Submarinas",19.90,a);

        Autor b = new Autor("Sun Tzu","st@gmail.com");
        Livro arteDaGuerra = new Livro("A arte da Guerra", 9.90,a,-2000);

        CarrinhodeCompras c = new CarrinhodeCompras(3);

        System.out.println(c.adicionarLivro(livro20leguas));
        System.out.println(c.adicionarLivro(arteDaGuerra));
        System.out.println(c.adicionarLivro(livro20leguas));
        System.out.println(c.removeLivro(arteDaGuerra));
        System.out.println(c.adicionarLivro(livro20leguas));

        c.listarLivros();

    }
}

