
public class RunningTraining extends Training{
    private double distanceKilometers;

    public RunningTraining(int HeartRate, int time, double Weight, double distanceKilometers) {
        super(HeartRate, time, Weight);
        this.distanceKilometers = distanceKilometers;
    }

    @Override
    void displayInfo() {
        System.out.println("Беговая тренировка:");
        System.out.println("Дистанция: " + distanceKilometers + " км");
        System.out.println("Средний пульс: " + super.HeartRate);
        System.out.println("Длительность тренировки: " + super.time + " мин");
        System.out.println("Вес спортсмена: " + super.Weight + " кг");
        System.out.println("Килокалорий: " + 0.014*super.Weight*super.time*(0.12*HeartRate-7));
        System.out.println();
    }
}
