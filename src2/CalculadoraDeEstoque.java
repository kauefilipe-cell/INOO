public class CalculadoraDeEstoque {
    public static void main(String[] args) {

        Autor julio = new Autor();
        julio.nome = "Julio Werner";
        julio.email = "julio@gmail.com";

        Autor c = new Autor();
        c.nome = "Julio Werner";
        c.email = "julio@gmail.com";

        Autor d = new Autor();
        d = julio;

        Livro livro20leguas = new Livro();
        livro20leguas.titulo = "20.000 leguas submarinas";
        livro20leguas.autor = julio;
        livro20leguas.valor = 10.57;

        Autor jeff = new Autor();
        jeff.nome = "Jeff Kinney";
        jeff.email = "jeff@gmail.com";

        Livro DiarioDeUmBanana = new Livro();
        DiarioDeUmBanana.titulo = "Diario de um Banana";
        DiarioDeUmBanana.autor = jeff;
        DiarioDeUmBanana.valor = 20;

//        DiarioDeUmBanana.valor = DiarioDeUmBanana.descontao();
        DiarioDeUmBanana.aplicaDesconto(.2);

        livro20leguas.imprimir();
        DiarioDeUmBanana.imprimir();

        if(julio == c){
            System.out.println("São iguais");
        }else{
            System.out.println("Diferentes");
        }

        if(julio == d){
            System.out.println("São iguais");
        }else{
            System.out.println("Diferentes");
        }

    }
}
