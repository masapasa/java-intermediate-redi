package exercise7;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.*;
//Exercise 7
//We have a map that has the friends of Peppa Pig and Zoe Zebra:
//Peppa Pig has following friends: Suzy Sheep, Emily Elephant, Rebecca Rabbit, Danny Dog, Pedro Pony.
//Zoe Zebra has following friends: Freddy Fox, Rebecca Rabbit, Gabriella Goat, Kylie Kangaroo, Danny Dog.
// Write a method that prints their common friends.
//TIP
//Write it in a flexible way, so that we can easily add new character with their friends without changing too much code.

public class Character {

    private String name;
    private List<String> characterFriends = new ArrayList<>();

    private Set<String> findCommonFriends(String character1, String character2) {
        Set<String> result = new HashSet<>();

//        List<String> character1Friends = characterFriends.get(character1);
//        List<String> character2Friends = characterFriends.get(character2);

//        for (String f : character1Friends) {
//            if (character2Friends.contains(f)) {
//                result.add(f);
//            }
//        }
//
//        for (String f : character2Friends) {
//            if (character1Friends.contains(f)) {
//                result.add(f);
//            }
//        }

        System.out.println(result);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCharacterFriends() {
        return characterFriends;
    }

    public void setCharacterFriends(List<String> characterFriends) {
        this.characterFriends = characterFriends;
    }

//    private static Set<String> intersection(Character character1, Character character2) {
//        Set<String> commonFriends = new HashSet<>();
//        Collection<List<String>> character2Friends = character2.getCharacterFriends().values();
//        for (List<String> friends1 : character1.getCharacterFriends().values()) {
//            for (String fr1 : friends1) {
//                if (character2Friends.contains(fr1)) {
//                    commonFriends.add(fr1);
//
//                }
//            }
//        }
//        System.out.println(commonFriends);
//        return commonFriends;
//    }

}
