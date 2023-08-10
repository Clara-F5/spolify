package br.com.clara.spolify.principal;

import br.com.clara.spolify.modelos.Musica;
import br.com.clara.spolify.modelos.Audio;
import com.sun.jdi.PathSearchingVirtualMachine;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("ETA");
        musica.setCantor("New Jeans");
        musica.setGenero("K-pop");

        musica.informacoesBasicas();

        for(int i = 0; i< 1000; i++) {
            musica.curte();
        }

        for(int i = 0; i< 1000; i++) {
            musica.reproduz();
        }
        System.out.println("Total de curtidas: "+musica.getCurtidas());

        musica.getClassificacao();

    }

}
