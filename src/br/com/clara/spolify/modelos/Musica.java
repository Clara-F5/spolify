package br.com.clara.spolify.modelos;

public class Musica extends Audio{
    private String cantor;
    private String compositores;
    private String produtores;
    private String album;
    private String genero;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getCompositores() {
        return compositores;
    }

    public void setCompositores(String compositores) {
        this.compositores = compositores;
    }

    public String getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void informacoesBasicas(){
        System.out.println("Música: "+getTitulo());
        System.out.println("Artista: "+getCantor());
        System.out.println("Gênero: "+getGenero());

    }

    @Override
    public int getClassificacao(){
        if(this.getCurtidas()>50){
            System.out.println("Música muito curtida");
        }else{
            System.out.println("Música OK!");
        }
        return super.getClassificacao();
    }

    @Override
    public String toString() {
        return "Musica: " +this.getTitulo() + "(" +this.getCantor() +")";
    }
}
