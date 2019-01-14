package Varqina;

import java.security.PublicKey;

//Create a function that returns the name of the winner in a fight between two fighters.
//
//Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.
//
//Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//
//Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
public class Fight {
    public static void main(String[] args) {

    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker)
    {
        boolean isrunning=true;
        Fighter[] tab = {fighter2,fighter1};
        if(fighter1.name.equals(firstAttacker))
        {
            tab[0]=fighter1;
            tab[1]=fighter2;
        }
        int winner =0;
        while (isrunning)
        {
            tab[1].health=tab[1].health-tab[0].damagePerAttack;
            if(tab[1].health<=0)
            {
                winner=0;
                break;
            }
            tab[0].health=tab[0].health-tab[1].damagePerAttack;
            if(tab[0].health<=0)
            {
                winner=1;
                break;
            }
        }
        return tab[winner].name;
    }
}

class Fighter{
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
}}
