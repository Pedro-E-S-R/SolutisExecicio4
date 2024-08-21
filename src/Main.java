import Questao2.AnimalAB;
import Questao3.Cachorro;
import Questao3.Elefante;
import Questao3.Gato;
import Questao3.Leao;
import Questao4.*;
import Questao5.Aguia;
import Questao5.Cavalo;
import Questao5.Orca;
import Questao5.TipoAnimal;

public class Main {
    public static void main(String[] args) {
        AnimalAB[] animal = new AnimalAB[4];
        animal[0] = new Cachorro(1,200,4);
        animal[1] = new Elefante(10,500,8);
        animal[2] = new Gato(15,10,24);
        animal[3] = new Leao(20,5000,2);

        for(AnimalAB a : animal){
            a.comer();
            a.moverse();
            a.dormir();
        }
        AnimalIF[] a2 = new AnimalIF[2];
        a2[0] = new Bagre(1,1,1);
        a2[1] = new Pombo(2,10,2);

        for(AnimalIF s : a2){
            s.comer();
            s.dormir();
            if(s instanceof AnimalMarinhoAB){
                ((AnimalMarinhoAB) s).nadar();
            }else{
                ((AnimalVoadorAB) s).voar();
            }
        }

        Questao5.AnimalAB[] ani = new Questao5.AnimalAB[3];
        ani[0] = new Aguia("Gallo", TipoAnimal.AEREO, 2, 3 ,2, 3,80
        ,"Floresta Amazonica",9.5,1.2,5);
        ani[1] = new Cavalo("hubet", TipoAnimal.TERRESTRE,2,3,4,
                80,"Fazenda",580.5,2.1,12);
        ani[2] = new Orca("Wylle", TipoAnimal.MARINHO, 5, 80,
                50,"Oceano Artico",1200,3.5,50);
        for(Questao5.AnimalIF a : ani){
            System.out.println(a.toString()+"\n");
        }

    }

}
