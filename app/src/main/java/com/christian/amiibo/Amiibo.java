package com.christian.amiibo;

/**
 * Created by Christian on 12/6/2015.
 */
public class Amiibo {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Amiibo[] amiibo = {
            new Amiibo("Mewtwo", "A Pokemon Amiibo that can be used in the newest Super Smash Bros. game for the Wii U", R.drawable.a),
            new Amiibo("Splatoon", "Three new amiibos for the game Splatoon for the Wii U. The three amiibos are Inkling Girl, Inkling Squid and Inkling Boy.", R.drawable.b),
            new Amiibo("Retro NES Characters", "The three retro characters from the NES. It includes R.O.B, Mr. Game & Watch and Duck Hunt Duo.", R.drawable.c),

    };

    private Amiibo(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    public String toString()
    {
        return this.name;
    }
}
