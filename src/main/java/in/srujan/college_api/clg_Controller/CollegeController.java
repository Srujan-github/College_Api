package in.srujan.college_api.clg_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.srujan.college_api.dao.CollegeDAO;
import in.srujan.college_api.model.Colleges;

@RestController
public class CollegeController {
@Autowired(required = false)	
private CollegeDAO cDAO;
@GetMapping("/colleges")
public List<Colleges> getColleges(){
	return cDAO.getAll();
}
@GetMapping("/colleges/{course_name}")
public List<Colleges> getCollegesByCourseName(@PathVariable String course_name) {
	return cDAO.getByCourse_name(course_name);
}
}
