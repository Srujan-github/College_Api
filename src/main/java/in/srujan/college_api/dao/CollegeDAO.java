package in.srujan.college_api.dao;

import java.util.List;

import in.srujan.college_api.model.Colleges;

public interface CollegeDAO {
int save(Colleges college);
List<Colleges> getAll();
List<Colleges> getByCourse_name(String name);
}
