package main.model;

public class LightInfantry extends Infantry {


    public LightInfantry(String name, int _id, int _hp, int _armor, int _cost, Weapon weapon) {
        super(name, _id, _hp, _armor, _cost, weapon);

    }
    public void Shoot(Entity target){
        _weapon.Fire(target);
    }
}
