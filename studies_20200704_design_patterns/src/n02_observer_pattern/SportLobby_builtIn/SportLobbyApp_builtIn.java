package n02_observer_pattern.SportLobby_builtIn;

import java.util.ArrayList;

public class SportLobbyApp_builtIn {

    public static void main(String[] args) {
        CommentaryObjectObservable obj = new CommentaryObjectObservable("Soccer Match [2014AUG24]");
        
        SMSUsersObserver observer = new SMSUsersObserver(obj, "Adam Warner [New York]");
        observer.subscribe();
        
        SMSUsersObserver observer2 = new SMSUsersObserver(obj, "Tim Ronney [London]");
        observer2.subscribe();
        
        obj.setDesc("Welcome to live Soccer match");
        obj.setDesc("Current score 0-0");
        
        observer.unSubscribe();
        
        obj.setDesc("It’s a goal!!");
        obj.setDesc("Current score 1-0");

    }
}