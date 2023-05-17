package in.srujan.college_api.clg_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.srujan.college_api.dao.CollegeDAO;
import in.srujan.college_api.model.Colleges;
import in.srujan.college_api.model.CourseFee;

@RestController
public class CollegeController {
@Autowired(required = false)	
private CollegeDAO cDAO;
@ResponseBody@RequestMapping("/")
public String start() {
	return "Your Application is Working";
}
@GetMapping("/colleges")
public List<Colleges> getColleges(){
	return cDAO.getAll();
}
@GetMapping("/colleges/{course_name}")
public List<Colleges> getCollegesByCourseName(@PathVariable String course_name) {
	return cDAO.getByCourse_name(course_name);
}
@GetMapping("/colleges/course_fee")
public List<CourseFee> getCourseFees() {
	return cDAO.getAllCourseFee();
}
	@PostMapping("/colleges")
	public String saveCollege(@RequestBody Colleges college) {
		return cDAO.save(college)+"  College Added";
	}
	@DeleteMapping("/colleges/{id}")
	public String deleteCollege(@PathVariable  int id) {
		 
		return cDAO.delete(id)+" College is Deleted";
	}
	@PutMapping("/colleges/{id}")
	public String updateCollege(@RequestBody Colleges college,@PathVariable int id) {
		return cDAO.update(college, id)+" College is updated";
	}
	
}
