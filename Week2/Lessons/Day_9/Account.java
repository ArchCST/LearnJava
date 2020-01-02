package Week2.Lessons.Day_9;

public class Account {
    private boolean auth;
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean setUsername(String username) {
        this.username = (auth) ? username : this.username;
        return auth;
    }
    public String getUsername() {
        return (auth) ? username : null;
    }

    public boolean setPassword(String password) {
        this.password = (auth) ? password : this.password;
        return auth;
    }

    public String getPassword() {
        return (auth) ? this.password : null;

    }
}
