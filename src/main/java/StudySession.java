import java.util.Date;
import java.util.List;

/*
* Author: Tony Sandoval
*
* The StudySession Class records a study session for a user.
* It contains the class code, module number, a list of questions,
* total number of questions, number of correct answers, number of
* incorrect answers, and the study session date
* */

public class StudySession {
    private String classCode;
    private int moduleNumber;
    private List<Question> sessionQuestions;
    private int totalQuestions;
    private int correctAnswers;
    private int incorrectAnswers;
    private Date studySessionDate;

    public StudySession(String classCode, int moduleNumber, List<Question> questions, int totalQuestions, int correctAnswers, int incorrectAnswers, Date studySessionDate) {
        this.classCode = classCode;
        this.moduleNumber = moduleNumber;
        this.sessionQuestions = questions;
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.incorrectAnswers = incorrectAnswers;
        this.studySessionDate = studySessionDate;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public int getModuleNumber() {
        return moduleNumber;
    }

    public void setModuleNumber(int moduleNumber) {
        this.moduleNumber = moduleNumber;
    }

    public List<Question> getSessionQuestions() {
        return sessionQuestions;
    }

    public void setSessionQuestions(List<Question> sessionQuestions) {
        this.sessionQuestions = sessionQuestions;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(int incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }

    public Date getStudySessionDate() {
        return studySessionDate;
    }

    public void setStudySessionDate(Date studySessionDate) {
        this.studySessionDate = studySessionDate;
    }

    @Override
    public String toString() {
        return "StudySession{" +
                "classCode='" + classCode + '\'' +
                ", moduleNumber=" + moduleNumber +
                ", questions=" + sessionQuestions +
                ", totalQuestions=" + totalQuestions +
                ", correctAnswers=" + correctAnswers +
                ", incorrectAnswers=" + incorrectAnswers +
                ", studySessionDate=" + studySessionDate +
                '}';
    }
}
