package br.com.clara.spolify.modelos;

public class Audio implements Comparable<Audio>{
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public Audio(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

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

    @Override
    public int compareTo(Audio outroAudio) {
        return this.getTitulo().compareTo(outroAudio.getTitulo());
    }
}
