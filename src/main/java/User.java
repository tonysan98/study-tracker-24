/*
* Author: Tony Sandoval
*
* This class records a user and maintains a hashmap of
* studySessionResults
*
*/

import java.util.Date;
import java.util.Map;

public class User {
    private String username;
    private Map<Date, StudySessionResult> results;

    public User(String username, Map<Date, StudySessionResult> results) {
        this.username = username;
        this.results = results;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<Date, StudySessionResult> getResults() {
        return results;
    }

    public void setResults(Map<Date, StudySessionResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", results=" + results +
                '}';
    }
}
