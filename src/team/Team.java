package team;

public class Team {
    private String name;
    private Participant[] participants;
    private boolean isTeamDidIt;

    public Team(String name, Participant[] participants) {
        this.name = name;
        this.participants = participants;
        isTeamDidIt = false;
    }

    public void teamInfo() {
        System.out.println("Команда " + name + ":");
        for (int i = 0; i < participants.length; i++) {
            System.out.println(participants[i].getName() + ", скорость: " + participants[i].getSpeed() +
                    ", выносливость: " + participants[i].getStamina());
        }
    }

    public void showResult() {
        if (isTeamDidIt) {
            System.out.println("Команда " + name + ". Результат прохождения полосы препятствий:");
            for (int i = 0; i < participants.length; i++) {
                if (participants[i].getResult().getTimeResult() != -1) {
                    System.out.println(participants[i].getName() + " прошел полосу препятсвий за " +
                            participants[i].getResult().getTimeResult() + " едениц времени");
                }
                else {
                    System.out.println(participants[i].getName() + " не смог пройти полосу препятствий");
                }
            }
        }
        else {
            System.out.println("Команда еще не прошла полосу препятствий");
        }
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public String getName() {
        return name;
    }

    public void setTeamDidIt(boolean teamDidIt) {
        this.isTeamDidIt = teamDidIt;
    }
}
