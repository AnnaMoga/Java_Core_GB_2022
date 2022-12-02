package lesson_1;

public class Obstruction {
    String result;
    private int running;
    private int swimming;
    private int jumping;

    public Obstruction(int running, int swimming, int jumping) {
        this.running = running;
        this.swimming = swimming;
        this.jumping = jumping;
    }

    public String doIt(Team team) {
        result = "Команда: " + team.getName() + " " + '\n';
        for (Person person : team.getPeoples()) {
            result += "имя спортсмена: " + person.getName() + " " + '\n';
            int value = person.getCanDo();
            testRunning(value);
            testSwimming(value);
            testJumping(value);
        }
        return result;
    }

        private void testRunning(int value) {
            if(value<running) result = result + "Бег - справился с препятсвием "+ '\n';
            else result += "Бег - не справился с препятсвием"+ '\n';

        }

        private void testSwimming(int value) {
            if(value<swimming + 50) result += "Плавание - справился с препятсвием "+ '\n';
            else result += "Плавание - не справился с препятсвием "+ '\n';
        }

        private void testJumping(int value) {
            if(value<jumping - 100) result += "Прыжки - справился с препятсвием "+ '\n';
            else result += "Прыжки - не справился с препятсвием "+ '\n';
        }
    }