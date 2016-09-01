package main;

import main.model.LightInfantry;
import main.model.Weapon;

public class app {
    public static void main(String[] args) {
        Weapon aK47 = new Weapon(2);
        LightInfantry datGuy = new LightInfantry("datGuy", 1, 10, 0, 0, aK47);
        LightInfantry thatGuy = new LightInfantry("thatGuy", 1, 20, 0, 0, aK47);
        for(int i = 0; datGuy.GetRemainingAmmo() > 0; i++)
        {
            datGuy.Shoot(thatGuy);
        }

    }
}
