public abstract class Warrior <T extends Weapon, E extends Shield>  {
    private  String name;
    private int healthpoint;
    private T leftHandWeapon;
    private E rightHandShield;

    @Override
    public String toString() {
        return String.format("name: %s, здоровье: %d, вооружен: левая рука %s  правая рука %s", name,healthpoint,leftHandWeapon.toString(), rightHandShield.toString());
    }

    public Warrior(String name, int healthpoint, T leftHandWeapon, E rightHandShield) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.rightHandShield = rightHandShield;
        this.leftHandWeapon = leftHandWeapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public E getRightHandShield() {
        return rightHandShield;
    }
    public T getLeftHandWeapon() {
        return leftHandWeapon;
    }

    public void setRightHandWeapon(E shield) {
        this.rightHandShield = shield;
    }
    public void setLeftHandWeapon(T weapon) {
        this.leftHandWeapon = weapon;
    }
}
