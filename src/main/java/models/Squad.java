package models;
import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String name;
    private int size;
    private String cause;
    private int id;
    private static ArrayList<Squad> instances = new ArrayList<Squad>();
    private List<Hero> heroes = new ArrayList<Hero>();
}