package org.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private static List<Music> musicList;

    public static Integer randomChoice(int size) {
        return (int) (Math.random() * size);
    }

    public MusicPlayer(List<Music> musicList) {
        MusicPlayer.musicList = musicList;
    }

    public String playMusic() {
        return musicList.get(randomChoice(musicList.size())).getSong();
    }
}