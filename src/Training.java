
abstract class Training {

    public int time; // время тренировки

    public  int Weight; //вес спортсмена

    public double HeartRate; // средний пульс во время тренировки

    public Training(int time, int Weight, double HeartRate) {
        this.time = time;
        this.Weight = Weight;
        this.HeartRate = HeartRate;
    }

    abstract void displayInfo();
}
