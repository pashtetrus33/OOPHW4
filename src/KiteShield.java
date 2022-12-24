public class KiteShield implements Shield {

    @Override
    public int blockStability() {
        return 40;
    }

    @Override
    public int blockStrength() {
        return 15;
    }

    @Override
    public String toString() {
        return "Каплевидный щит: Стабильность: " + blockStability() + " Стойкость: " + blockStrength();
    }
}
