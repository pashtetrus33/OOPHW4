public class RoundShield implements Shield {

    @Override
    public int blockStability() {
        return 30;
    }

    @Override
    public int blockStrength() {
        return 25;
    }

    @Override
    public String toString() {
        return "Круглый щит: Стабильность: " + blockStability() + " Стойкость: " + blockStrength();
    }
}
