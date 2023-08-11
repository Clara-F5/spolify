package br.com.clara.spolify.principal;

import br.com.clara.spolify.modelos.Audio;
import br.com.clara.spolify.modelos.Musica;
import br.com.clara.spolify.modelos.Podcast;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        Musica jeans = new Musica("SuperShy", 3);
        jeans.setCantor("New jeans");
        Musica blink = new Musica("Typa Girl", 3);
        blink.setCantor("BlackPink");
        Podcast modus = new Podcast("Modus Operandi", 50);
        modus.setHost("Carol Moreira e Mabê Bonafé");

        ArrayList<Audio> lista = new ArrayList<>();
        lista.add(jeans);
        lista.add(blink);
        lista.add(modus);

        for(int i=0; i<1000;i++){
           jeans.curte();
        }

        for(int i=0; i<800;i++){
            blink.curte();
        }

        for (Audio item: lista) {
            System.out.println("Nome: "+item.getTitulo());
            if(item instanceof Musica musica && musica.getCurtidas()>999){
                System.out.println("Curtidas: "+musica.getCurtidas());
            }
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}
