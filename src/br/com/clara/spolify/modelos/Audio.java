package br.com.clara.spolify.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }


    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
       this.curtidas++;
    }

    public void reproduz(){
       this.totalReproducoes++;
    }
}
