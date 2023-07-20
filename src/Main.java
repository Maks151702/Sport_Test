
public class Main {
    public static void main(String[] args) {
        //массив тренировок за неделю
        Training[] weeklyTrainings = new Training[4];
        weeklyTrainings[0] = new CrossfitTraining(140, 75, 75, 30);
        weeklyTrainings[1] = new CrossfitTraining(150, 40, 80, 25);
        weeklyTrainings[2] = new BoxingTraining(140, 70, 78);
        weeklyTrainings[3] = new RunningTraining(150, 80, 77.5, 14);


        for (Training training : weeklyTrainings) {
            training.displayInfo();
        }
    }
}