package org.example;

public class Friend {

    String name;
    static int numberOfFriendsStatic;
    int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriendsStatic++;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have "+numberOfFriendsStatic+" friends");
    }

}
