package org.springcourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RapMusic implements Music{

    public static List<String> rapMusicList = new ArrayList<>(Arrays.asList("99 problem", "Bandana", "Dirt"));

    @Override
    public String getSong() {
        return rapMusicList.get(MusicPlayer.randomChoice(rapMusicList.size()));
    }
}
