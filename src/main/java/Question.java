/*
* Author: Tony Sandoval
* The Question class represents a class question from a
* specific module. The question has a class code, class name,
* and module number aside from the actual question text and answer
* */

public class Question {
    private String classCode;
    private String className;
    private int moduleNumber;
    private String question;
    private String answer;

    public Question(String cc, String name, int number, String q, String a) {
        this.classCode = cc;
        this.className = name;
        this.moduleNumber = number;
        this.question = q;
        this.answer = q;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getModuleNumber() {
        return moduleNumber;
    }

    public void setModuleNumber(int moduleNumber) {
        this.moduleNumber = moduleNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "classCode=" + classCode +
                ", className='" + className + '\'' +
                ", moduleNumber=" + moduleNumber +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
