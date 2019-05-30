import course.Barrier;
import course.Course;
import team.Participant;
import team.Team;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[4];
        participants[0] = new Participant("Василий", 30, 10);
        participants[1] = new Participant("Леонид", 25, 12);
        participants[2] = new Participant("Анатолий", 35, 9);
        participants[3] = new Participant("Петр", 27, 7);
        Team team = new Team("Мстители", participants);
        team.teamInfo();
        Barrier[] barriers = new Barrier[4];
        barriers[0] = new Barrier(250);
        barriers[1] = new Barrier(200);
        barriers[2] = new Barrier(300);
        barriers[3] = new Barrier(220);
        Course course = new Course(barriers);
        course.doIt(team);
        team.showResult();
    }
}
