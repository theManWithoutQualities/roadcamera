package com.konst007.testRoadCamera.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class RegistrationDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Registration registration) {
        String sql = "INSERT INTO registration(number) VALUES(?)";
        jdbcTemplate.update(sql, new Object[]{registration.getNumber()});
    }

    public List<Registration> getAll() {
        String sql = "SELECT * FROM registration";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Registration.class));
    }

    public List<Registration> getAllByCarNumber(String number) {
        String sql = "SELECT * FROM registration WHERE number=?";
        return jdbcTemplate.query(sql, new Object[]{number}, new BeanPropertyRowMapper<>(Registration.class));
    }

    public Long count() {
        String sql = "SELECT count(*) FROM registration";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }
}
