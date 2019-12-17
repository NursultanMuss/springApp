package kz.nurs.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private String name;
    private String volume;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(){}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void playMusic(){
        for(Music music:musicList){
            System.out.println("Playing: " + music.getSong());
        }
    }
}
