package com.mission3.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MusicController {

    private MusicService musicService;

    public MusicController(MusicService musicService){
        this.musicService=musicService; // constructor
    }

    @GetMapping("/music/musicList")
    public List<MusicModel>all_music(){
        return musicService.getAllMusic();
    }

    @GetMapping("/music/{id}")
    public MusicModel getMusic(@PathVariable("id") String id) {
        return musicService.getMusic(id);
    }

    @PostMapping("/music/addMusic")
    public void addMusic(@RequestBody MusicModel musicModel){
         musicService.addMusic(musicModel);
    }

    @PutMapping("/music/updateMusic/{id}")
    public void updateMusic(@RequestBody MusicModel musicModel, @PathVariable("id") String id) {
        musicService.updateMusic(musicModel);
    }

    @DeleteMapping("/music/deleteMusic/{id}")
    public void deleteMusic(@PathVariable("id") String id) {
        musicService.deleteMusic(id);
    }

}
