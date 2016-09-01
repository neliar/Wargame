package main.model;

public class Entity {
    private String _name;
    private int _id;
    private int _hp;
    private int _armor;
    private int _cost;

    public Entity(String _name, int _id, int _hp, int _armor, int _cost) {
        this._name = _name;
        this._id = _id;
        this._hp = _hp;
        this._armor = _armor;
        this._cost = _cost;
    }

    public void ReceiveDamage(int damage){
        _hp -= damage;

        System.out.println(_name + " taking " + damage + " damage" + " . " + _hp + " left");
        if(_hp <= 0)
        {
            Die();
        }
    }
    private void Die(){
        try {
            this.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
