package org.example.case_study.repository;

import org.example.case_study.entity.Movie;
import org.example.case_study.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IMovieRepository {

    void addMovie(Movie movie) throws SQLException;

    boolean updateMovie(Movie movie) throws SQLException;

    boolean deleteMovie (int id) throws SQLException;

    List<Movie> showAllMovies();

    List<Movie> searchForMovie(String keyword) throws SQLException;

}
