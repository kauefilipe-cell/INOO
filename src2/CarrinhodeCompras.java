public class CarrinhodeCompras {

    private Livro[] carrinho;
    private int contador;

    public CarrinhodeCompras(int tam){
        this.carrinho = new Livro[tam];
        this.contador = 0;
    }

    public boolean adicionarLivro(Livro l){

        if(this.contador < this.carrinho.length) {
            for (int i = 0; i < this.carrinho.length; i++) {
                if (carrinho[i] == null) {
                    this.carrinho[i] = l;
                    this.contador++;
                    return true;
                }
            }
        }

//        if(this.contador < this.carrinho.length) {
//            this.carrinho[this.contador] = l;
//            this.contador++;
//            return true;
//        }

        return false;
    }

    public boolean removeLivro(Livro l){

        for(int i = 0; i < this.carrinho.length; i++){
            if(this.carrinho[i].getTitulo().equalsIgnoreCase(l.getTitulo())){
                this.carrinho[i] = null;
                this.contador--;
                return true;
            }
        }
        return false;

//        for(int i = 0; i < this.contador; i++){
//            if(l == this.carrinho[i]){
//                this.carrinho[i] = null;
//                return true;
//            }
//        }
//        return false;
    }

    public void listarLivros(){

        System.out.println("------Livros------");
        for(Livro l : this.carrinho){
            if(l != null) {
                l.imprimir();
                System.out.println("------------");
            }
        }

//        for(int i = 0; i < this.contador; i++){
//            if(carrinho[i] != null) {
//                System.out.println("------------");
//                carrinho[i].imprimir();
//                System.out.println("------------");
//            }
//        }
    }

}

