package org.student.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.student.model.Student;

import java.sql.ResultSet;
import java.util.List;


@Repository
public class StudentRepository {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void saveStudent(Student student) {
        String query = "insert into student (id,name) values (?,?)";
        template.update(query, student.getRollNo(), student.getName());
    }

    public void updateStudent(Student student) {
        String query = "update student set name = ? where id = ?";
        template.update(query, student.getName(), student.getRollNo());
    }

    public void deleteStudent(int id) {
        String query = "delete from student where id = ?";
        template.update(query, id);
    }

    public List<Student> getAllStudents() {

        String query = "select * from student";
        RowMapper<Student> rm = (ResultSet rs, int rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("id"));
            student.setName(rs.getString("name"));
            return student;
        };

        return template.query(query, rm);
    }
}
