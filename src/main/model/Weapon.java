package main.model;

public class Weapon {
    private int _damage;
    private int _ammoCount = 11;
    private int _ammoBox = 1;
    private int _maxAmmo = 10;

    public Weapon(int _damage) {
        this._damage = _damage;
    }

    public void Fire(Entity target){
        if(_ammoCount > 0) {
            target.ReceiveDamage(_damage);
            _ammoCount--;
        }
        else
        {
            Reload();
        }
    }
    private void Reload(){
        if(_ammoBox > 0)
        {
            _ammoCount = _maxAmmo;
            _ammoBox--;
        }
        else
        {
            System.out.println("no ammo!!!");
        }
    }
    protected int GetRemainingAmmo(){
        return _ammoCount;
    }
}
