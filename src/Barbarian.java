public class Barbarian extends Warrior<Axe, RoundShield>{

    public Barbarian(String name, int healthpoint, Axe leftHand, RoundShield rightHand) {
        super(name, healthpoint, leftHand, rightHand);
    }


    @Override
    public String toString() {
        return "Варвор: "+super.toString();
    }
}
