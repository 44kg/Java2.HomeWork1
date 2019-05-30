package team;

public class ParticipantResult {
    private int timeResult;
    private boolean isDid;

    public ParticipantResult() {
        timeResult = 0;
        isDid = false;
    }

    public int getTimeResult() {
        return timeResult;
    }

    public void setTimeResult(int timeResult) {
        this.timeResult = timeResult;
    }

    public boolean isDid() {
        return isDid;
    }

    public void setDid(boolean did) {
        isDid = did;
    }
}
