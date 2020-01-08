package Tutorials.Tutorial23;

public class Main {

    final static int N = 3;

    public static void main(String[] args){
        Hero[] heros = new Hero[N];
        heros[0] = new Archer("Archer");
        heros[1] = new Warrior("Warrior");
        heros[2] = new Magician("Magician");

        for(int i = 0; i< heros.length; i++){
            heros[i].punchAttack();

            if(heros[i] instanceof Warrior){
                Warrior temp = (Warrior) heros[i];
                temp.cuttingGround();
            }else if(heros[i] instanceof Archer){
                Archer temp = (Archer)heros[i];
                temp.fireArrow();
            }else if(heros[i] instanceof Magician){
                Magician temp = (Magician)heros[i];
                temp.freezing();
            }
        }
    }
}