package br.com.clara.spolify.modelos;

public class Podcast extends Audio{
    private String descricao;
    private String host;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassificacao() {

        if(this.getCurtidas()>50){
            System.out.println("Podcast muito curtido");
        }else{
            System.out.println("Podcast OK!");
        }
        return super.getClassificacao();
    }
}
