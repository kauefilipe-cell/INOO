public class Main {
    public static void main(String[] args) {
        double livroTDD = 59.90;
        double livroJava8 = 59.90;

//        String resposta = livroTDD > livroJava8 ? "Livro TDD é mais caro" : "Livro Java 8 é mais caro";
        String resposta = livroTDD > livroJava8 ? "Livro TDD é mais caro" : livroJava8 > livroTDD ? "Livro Java 8 é mais caro" : "iguais";
        System.out.println(resposta);

//        if(livroTDD < livroJava8){
//            System.out.println("Livro TDD é mais barato");
//        }else if(livroTDD > livroJava8){
//            System.out.println("Livro Java 8 é mais barato");
//        }else{
//            System.out.println("Os livros tem o mesmo valor");
//        }
//
//        System.out.println("O livro Java 8 custa " + livroJava8);
//        System.out.println("O livro TDD custa " + livroTDD);

//        int x = 0;
//        while (x < 10){
//            System.out.println(x);
//            x++;
//        }

//        for(int x = 0; x < 100; x++){
//            if (x == 7){
//                continue;
//            }
//
//            if(x == 13){
//                break;
//            }
//
//            System.out.println(x);
//        }

//        int livroInteiro = (int) livroJava8;
//
//        System.out.println("O livro inteiro vale " + livroInteiro);

    }
}