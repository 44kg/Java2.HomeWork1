package team;

public class Team {
    private Participant[] participants;
    private boolean isTeamDidIt;

    public Team(Participant[] participants) {
        this.participants = participants;
        isTeamDidIt = false;
    }

    public void teamInfo() {
        for (int i = 0; i < participants.length; i++) {
            System.out.println(participants[i].getName() + ", скорость: " + participants[i].getSpeed() +
                    ", выносливость: " + participants[i].getStamina());
        }
    }

    public void showResult() {
        if (isTeamDidIt) {

        }
        else {
            System.out.println("Команда еще не прошла полосу препятствий");
        }
    }

    public Participant[] getParticipants() {
        return participants;
    }
}
