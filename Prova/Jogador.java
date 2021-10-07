public class Jogador {
    private String nome;
    private int idade;
    double categoria;
    private String email;
    private int qtdPartidas;
    private double bonus;
    //qtdPartidas representa a quantidade de partidas das quais o jogador já participou.
    /* A categoria do jogador poderia ser definida como o número de partidas mais o bônus que ele ganha dentro de cada uma.
      Isso poderia ser definido em uma classe denominada TesteJogador.java */

    public Jogador(String nome, int idade, double categoria, String email, int qtdPartidas, double bonus) {
        this.nome = nome;
        this.idade = idade;
        this.categoria = categoria;
        this.email = email;
        this.qtdPartidas = qtdPartidas;
        this.bonus = bonus;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPartidas(){
        return qtdPartidas;
    }

    public void setPartidas(int qtdPartidas){
        this.qtdPartidas = qtdPartidas;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
