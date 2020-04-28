package com.mission3.demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
//Where all the logic exists

import javax.sql.DataSource;
import java.util.*;

@Service
public class MusicService implements MusicRepository {

    DataSource dataSource = new MusicConfigJdbc().mysqlDataSource();

    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

    public List<MusicModel> getAllMusic() {
        String sql = "SELECT * FROM music";
        return jdbcTemplate.query(sql,new MusicRowMapper());
    }

    public MusicModel getMusic(String id) {
        String sql = "select * from music where id = ?";
        return (MusicModel) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(MusicModel.class));
    }

    public void addMusic(MusicModel musicModel) {
        String sql = "insert into music (id, name, artist) values (?,?,?)";
        Object[] values = new Object[]{musicModel.getId(), musicModel.getName(), musicModel.getArtist()};
        jdbcTemplate.update(sql, values);
    }

    public void updateMusic(MusicModel musicModel) {
        String sql = "update music set name = ?, publisher =? where id = ? ";
        jdbcTemplate.update(sql, musicModel.getName(), musicModel.getArtist(), musicModel.getId());
    }

    public void deleteMusic(String id) {
        String sql = "delete from game where id = "+id+"";
        jdbcTemplate.update(sql);
    }

}

//stream - is used to process collections OR ARRAYS who provides data to the stream
//stream() - filtering to select the element
//findFirst - is to find the first element in the string
