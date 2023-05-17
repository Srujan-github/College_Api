package in.srujan.college_api.dao;

import java.util.List;

import in.srujan.college_api.model.Colleges;
import in.srujan.college_api.model.CourseFee;

public interface CollegeDAO {
int save(Colleges college);
List<Colleges> getAll();
List<CourseFee> getAllCourseFee();
List<Colleges> getByCourse_name(String name);
int delete(int id);
int update(Colleges college,int id);
}
