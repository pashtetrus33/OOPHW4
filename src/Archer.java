public class Archer extends Warrior<Bow, Shield>{
     public Archer(String name, int healthpoint, Bow rightHand, Shield leftHand) {
        super(name, healthpoint, rightHand, leftHand );
    }

    @Override
    public String toString() {
        return "Лучник: "+super.toString();
    }
}
