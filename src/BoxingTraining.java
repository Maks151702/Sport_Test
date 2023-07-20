
public class BoxingTraining extends Training {
    public BoxingTraining(int HeartRate, int time, double Weight) {
        super(HeartRate, time, Weight);
    }

    @Override
    void displayInfo() {
        System.out.println("Боксерская тренировка:");
        System.out.println("Средний пульс: " + super.HeartRate);
        System.out.println("Длительность тренировки: " + super.time + " мин");
        System.out.println("Вес спортсмена: " + super.Weight + " кг");
        System.out.println("Килокалорий: " + 0.014*super.Weight*super.time*(0.12*HeartRate-7));
        System.out.println();
    }
}