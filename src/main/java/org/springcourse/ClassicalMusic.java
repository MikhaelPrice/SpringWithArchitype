package org.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music {

    public static List<String> classicalMusicList = new ArrayList<>(Arrays.asList("Poloness", "Wedding march", "Moon"));

    @Override
    public String getSong() {
        return classicalMusicList.get(MusicPlayer.randomChoice(classicalMusicList.size()));
    }
}
