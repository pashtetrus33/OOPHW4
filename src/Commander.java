public class Commander extends Warrior<Weapon, Shield>{
    public Commander(String name, int healthpoint, Weapon rightHand, Shield leftHand) {
        super(name, healthpoint, rightHand, leftHand);
    }

    @Override
    public String toString() {
        return "Командир: "+ super.toString();
    }
}
