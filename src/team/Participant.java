package team;

public class Participant {
    private String name;
    private int speed;
    private int stamina;
    private ParticipantResult result;

    public Participant(String name, int speed, int stamina) {
        this.name = name;
        this.speed = speed;
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public ParticipantResult getResult() {
        return result;
    }
}
