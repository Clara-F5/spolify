package br.com.clara.spolify.principal;

import br.com.clara.spolify.modelos.Musica;
import br.com.clara.spolify.modelos.Audio;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("ETA");
        musica.setCantor("New Jeans");
        musica.setGenero("K-pop");

        Musica outraMusica = new Musica();
        outraMusica.setTitulo("Blue Flame");
        outraMusica.setCantor("Le Sserafim");
        outraMusica.setGenero("K-pop");

        musica.informacoesBasicas();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        outraMusica.informacoesBasicas();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        for(int i = 0; i< 1000; i++) {
            musica.curte();
            outraMusica.curte();
        }

        for(int i = 0; i< 1000; i++) {
            musica.reproduz();
            outraMusica.reproduz();
        }
        System.out.println("Total de curtidas: "+musica.getCurtidas());
        System.out.println("Total de curtidas: "+outraMusica.getCurtidas());

        musica.getClassificacao();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        ArrayList<Musica> minhasMusicas = new ArrayList<>();
        minhasMusicas.add(musica);
        minhasMusicas.add(outraMusica);

        System.out.println("Tamanho da lista: " +minhasMusicas.size());
        System.out.println("Primeira Música: " +minhasMusicas.get(0));
        System.out.println(minhasMusicas);



    }

}
