package Chapter3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SuperPower implements Comparable<SuperPower> {

    private int damage;
    private String name;

    public SuperPower(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public int compareTo(SuperPower o) {
        if ( this.getDamage() < o.getDamage() ) return -1;
        if (this.getDamage() == o.getDamage() ) return 0;
        else return 1;
    }


    public boolean equals(SuperPower o) {
        return (this.getDamage() == o.getDamage());
    }

    public static SuperPower max(Collection<SuperPower> coll) {
        SuperPower candidate = coll.iterator().next();
        for (SuperPower elt : coll) {
            if (candidate.compareTo(elt) < 0) candidate = elt;
        }
        return candidate;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.getName() + ": " +  String.valueOf(this.damage) + " dmg";
    }

    public static void main(String[] args) {
        SuperPower sunstrike = new SuperPower(400, "sunstrike");
        SuperPower meteor = new SuperPower(300, "meteor");
        SuperPower tornado = new SuperPower(300, "tornado");
        SuperPower punch = new SuperPower(80, "punch");
        SuperPower cataclysm = new SuperPower(800, "cataclysm");

        System.out.println("Contract for Comparable");
        System.out.println("meteor.compareTo(sunstrike) == -sunstrike.compareTo(meteor) = "
                + (meteor.compareTo(sunstrike) == -sunstrike.compareTo(meteor)));

        System.out.println("if (punch.compareTo(meteor) < 0) = " +
                (punch.compareTo(meteor) < 0) + " and (meteor.compareTo(sunstrike) < 0) = " + (meteor.compareTo(sunstrike) < 0) +
                " then (punch.compareTo(sunstrike) < 0) = " + (punch.compareTo(sunstrike) < 0));

        System.out.println("if meteor.compareTo(tornado) = " + (meteor.compareTo(tornado)) + " then meteor.compareTo(punch) == tornado.compareTo(punch) = "  + (meteor.compareTo(punch) == tornado.compareTo(punch)));

        System.out.println("if (meteor.equals(tornado)) = "
                + (meteor.equals(tornado)) + " then (meteor.compareTo(tornado) == 0) = " + (meteor.compareTo(tornado) == 0) );

        List<SuperPower> collection = Arrays.asList(punch, sunstrike, cataclysm, meteor, tornado);

        System.out.println(max(collection));











    }


}
