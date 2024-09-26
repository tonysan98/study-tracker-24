/*
* Author: Tony Sandoval
*
* This class records a study session object with the percentage
* of questions correct from that session
* */

public class StudySessionResult {
    private StudySession studySession;
    private double percentageCorrect;

    public StudySessionResult(StudySession studySession, double percentageCorrect) {
        this.studySession = studySession;
        this.percentageCorrect = percentageCorrect;
    }

    public StudySession getStudySession() {
        return studySession;
    }

    public void setStudySession(StudySession studySession) {
        this.studySession = studySession;
    }

    public double getPercentageCorrect() {
        return percentageCorrect;
    }

    public void setPercentageCorrect(double percentageCorrect) {
        this.percentageCorrect = percentageCorrect;
    }

    @Override
    public String toString() {
        return "StudySessionResult{" +
                "studySession=" + studySession +
                ", percentageCorrect=" + percentageCorrect +
                '}';
    }
}
