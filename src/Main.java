import team.Participant;
import team.Team;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[4];
        participants[0] = new Participant("Василий", 30, 10);
        participants[1] = new Participant("Леонид", 25, 6);
        participants[2] = new Participant("Анатолий", 35, 8);
        participants[3] = new Participant("Петр", 27, 7);
        Team team = new Team(participants);
        team.teamInfo();
    }
}
