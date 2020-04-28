package com.mission3.demo;
//Repository = a mechanism used to STORE, RETRIEVE, SEARCH actions on objects. DATA ACCESS LAYER.
//Row Mapper = Used in JDBC Templates, contains the rows that satisfy the conditions of a query.
//             Data is stored in ResultSet object that is retrieved through GET METHODS that allows access.

import org.springframework.stereotype.Repository;
import java.sql.SQLException;

import java.util.List;


@Repository
public interface MusicRepository {

        List<MusicModel> getAllMusic();
        MusicModel getMusic(String id);
        void addMusic (MusicModel musicModel);
        void updateMusic(MusicModel musicModel);
        void deleteMusic(String id);
}

        //@Autowired
      //  JdbcTemplate jdbcTemplate;
       // DataSource dataSource = new


        //TO GET DATA FROM SQL
       // abstract static class MusicRowMapper implements RowMapper <MusicModel> {
              //  @Override
                //public MusicModel mapRow(ResultSet resultSet, int rowNum) throws SQLException {

                 //       MusicModel musicModel = new MusicModel();
                    //    musicModel.setId(ResultSet.getString("id"));
                     //   musicModel.setName(ResultSet.getString("music"));
                    //    musicModel.setArtist(ResultSet.getString("artist"));
                    //    return MusicModel;

