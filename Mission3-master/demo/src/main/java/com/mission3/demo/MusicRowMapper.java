package com.mission3.demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MusicRowMapper implements RowMapper<MusicModel> {
    @Override
    public MusicModel mapRow(ResultSet rs, int rowNum) throws SQLException {

        MusicModel musicModel = new MusicModel();
        musicModel.setId(rs.getString("id"));
        musicModel.setName(rs.getString("music"));
        musicModel.setArtist(rs.getString("artist"));
        return musicModel;
    }
}
