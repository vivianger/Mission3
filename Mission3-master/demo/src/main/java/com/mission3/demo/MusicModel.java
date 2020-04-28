package com.mission3.demo;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@ToString

public class MusicModel {

    @Id
    private String id;
    private String name;
    private  String artist;

//    public MusicModel(String id, String name, String artist) {this.id=id;
//        this.name = name;
//        this.artist = artist;
   // }
}