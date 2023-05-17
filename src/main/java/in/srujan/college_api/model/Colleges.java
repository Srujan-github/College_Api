package in.srujan.college_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class Colleges {
	private int id;
	private String clg_name;
	private String course_name;
	private String course_fee;
	private String course_dur;
	private String accommodation;
	private String accommodation_fee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClg_name() {
		return clg_name;
	}
	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_fee() {
		return course_fee;
	}
	public void setCourse_fee(String course_fee) {
		this.course_fee = course_fee;
	}
	public String getCourse_dur() {
		return course_dur;
	}
	public void setCourse_dur(String course_dur) {
		this.course_dur = course_dur;
	}
	public String getAccommodation() {
		return accommodation;
	}
	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}
	public String getAccommodation_fee() {
		return accommodation_fee;
	}
	public void setAccommodation_fee(String accommodation_fee) {
		this.accommodation_fee = accommodation_fee;
	}
}
