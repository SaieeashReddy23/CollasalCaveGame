package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Map<Integer,Location> locations = new HashMap<>();
    public static void main(String[] args) {
	// write your code here
        Scanner sn = new Scanner(System.in);

        locations.put(0,new Location(0,"Sitting befrore the computer learning java"));
        locations.put(1,new Location(1,"On the road"));
        locations.put(2,new Location(2,"On the top of the hill"));
        locations.put(3,new Location(3,"you are now in a building"));
        locations.put(4,new Location(4,"ypu are in a valley"));
        locations.put(5,new Location(5,"Ypu are in Forest"));

        locations.get(1).addExits("N",5);
        locations.get(1).addExits("E",3);
        locations.get(1).addExits("W",2);
        locations.get(1).addExits("S",4);

        locations.get(2).addExits("E",1);
        locations.get(2).addExits("N",5);

        locations.get(3).addExits("W",1);

        locations.get(4).addExits("N",1);
        locations.get(4).addExits("W",2);

        locations.get(5).addExits("S",1);
        locations.get(5).addExits("W",2);



        int loc=1;
        while(true){
            System.out.println(locations.get(loc).getDescryption());
            if(loc==0){
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            for(String exit : exits.keySet()){
                System.out.print(exit + " ");
            }
            System.out.println();

            String direction = sn.nextLine();

            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else{
                System.out.println("you cant go in that direction");
            }
        }

    }
}
