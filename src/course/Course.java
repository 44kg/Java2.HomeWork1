package course;

import team.Team;

public class Course {
    private Barrier[] barriers;

    public Course(Barrier[] barriers) {
        this.barriers = barriers;
    }

    public void doIt(Team team) {
        System.out.println("Команда " + team.getName() + " проходит полосу препятсвий");
        for (int i = 0; i < team.getParticipants().length; i++) {
            int stamina = team.getParticipants()[i].getStamina();
            int timeResult = 0;
            if (!team.getParticipants()[i].getResult().isDid()) {
                for (int j = 0; j < barriers.length; j++) {
                    timeResult += (barriers[j].getComplexity() / team.getParticipants()[i].getSpeed());
                    stamina -= 2;
                }
            }
            if (stamina > 0) {
                team.getParticipants()[i].getResult().setTimeResult(timeResult);
            }
            else {
                team.getParticipants()[i].getResult().setTimeResult(-1);
            }
        }
        team.setTeamDidIt(true);
    }
}
