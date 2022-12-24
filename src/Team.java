import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();
    private Commander commandor;

    public Team(Commander commandor){

        this.commandor = commandor;
    }

    public Commander getCommandor() {
        return commandor;
    }

    public void addWarrior(T warrior){
        warriors.add(warrior);

    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }
    public int getAllDamage(){
        int sumDamage = 0;
        for (T item:this) {
            sumDamage+=item.getLeftHandWeapon().damage();

        }
        return sumDamage + commandor.getLeftHandWeapon().damage();
    }

    public int getAllShieldStrength(){
        int sumStrength = 0;
        for (T item:this) {
            sumStrength +=item.getRightHandShield().blockStrength();

        }
        return sumStrength + commandor.getRightHandShield().blockStrength();
    }

    public int getAllHealthPoint(){
        int health = 0;
        for (T item:this) {
            health+=item.getHealthpoint();

        }
        return health + commandor.getHealthpoint();
    }

    public int getMaxRadius(){
        int maxRange = 0;
        for (T item:this) {
           Weapon weapon = item.getLeftHandWeapon();
           if (weapon instanceof Bow) {
               Bow bow = (Bow) weapon;
               if (maxRange< bow.range()){
                   maxRange = bow.range();
               }
           }
        }
        Weapon comWeapon = commandor.getLeftHandWeapon();
        if (comWeapon  instanceof Bow){
            Bow comBow = (Bow) comWeapon;
            if (comBow.range() > maxRange)
                maxRange = comBow.range();
        }

        return maxRange;
    }
}
