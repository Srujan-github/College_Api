package in.srujan.college_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class CourseFee {
int id;
private String course_fee;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCourse_fee() {
	return course_fee;
}
public void setCourse_fee(String course_fee) {
	this.course_fee = course_fee;
}
}
