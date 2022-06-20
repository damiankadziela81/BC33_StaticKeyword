package org.example;

public class Main {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member

        Friend friend1 = new Friend("Cartman");
        Friend friend2 = new Friend("Kenny");
        Friend friend3 = new Friend("Stan");
        Friend friend4 = new Friend("Kyle");


        System.out.println(Friend.numberOfFriendsStatic);

        System.out.println(friend1.numberOfFriends);
        //best practice is to access static member by a class Name reference, though this will work too
        System.out.println(friend2.numberOfFriendsStatic);

        //to call the method use the ClassName.method
        Friend.displayFriends();


    }
}