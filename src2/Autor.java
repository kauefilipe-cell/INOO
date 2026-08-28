public class Autor {

    private String nome;
    private String email;

    public Autor(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.email);
    }

}
