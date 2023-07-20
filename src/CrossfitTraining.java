
public class CrossfitTraining extends Training{

    private double WeightEquipment;

    public CrossfitTraining(int HeartRate, int time, double Weight, double WeightEquipment) {
        super(HeartRate, time, Weight);
        this.WeightEquipment = WeightEquipment;
    }

    @Override
    void displayInfo() {
        System.out.println("Кроссфит-тренировка:");
        System.out.println("Средний вес снаряда: " + WeightEquipment + " кг");
        System.out.println("Средний пульс: " + super.HeartRate);
        System.out.println("Длительность тренировки: " + super.time + " мин");
        System.out.println("Вес спортсмена: " + super.Weight + " кг");
        System.out.println("Килокалорий: " + 0.014*super.Weight*super.time*(0.12*HeartRate-7));
        System.out.println();
    }
}
