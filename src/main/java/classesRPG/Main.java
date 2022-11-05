package classesRPG;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Jogador player1 = new Jogador( 1,"Frodo", 5,5,5,1,"ladrão", 5, 1);

    Monstro monstro1 = new Monstro(2, "Orc", 4,5,3,2,"guerreiro", 4, 2);


    Monstro monstro2 = new Monstro(3, "Laracna", 4,5,3,3,"guerreiro", 4, 3);

    player1.seApresentar();
    monstro1.seApresentar();

    monstro1.setClasse("batedor");

    ArrayList<Personagem> lista = new ArrayList<>();

    lista.add(monstro1);
    lista.add(monstro2);
    lista.add(player1);

    for (Personagem personagem : lista){
        personagem.seApresentar();
    }





    }
}
