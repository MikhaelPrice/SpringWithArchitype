package org.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {

    public List<String> rockMusicList = new ArrayList<>(Arrays.asList("Hero", "Whispers in the dark", "Monster"));

    @Override
    public String getSong() {
        return rockMusicList.get(MusicPlayer.randomChoice(rockMusicList.size()));
    }
}
