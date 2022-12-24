public class TowerShield implements Shield {

    @Override
    public int blockStability() {
        return 50;
    }

    @Override
    public int blockStrength() {
        return 10;
    }

    @Override
    public String toString() {
        return "Башенный щит: Стабильность: " + blockStability() + " Стойкость: " + blockStrength();
    }
}
