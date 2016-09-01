package main.model;

public class Infantry extends Entity {
    private int _morale;
    private TrainingLevel _training;
    protected Weapon _weapon;

    public Infantry(String name, int _id, int _hp, int _armor, int _cost, Weapon weapon) {
        super(name, _id, _hp, _armor, _cost);
        _weapon = weapon;
    }

    public int GetRemainingAmmo(){
        return _weapon.GetRemainingAmmo();
    }
}
