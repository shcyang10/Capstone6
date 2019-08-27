package co.grandcircus.Capstone6.task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasklist")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskid;
	private String description;
	private String duedate;
	private String complete;
	@Column(name = "useremail_fk")
	private String useremail;

	@ManyToOne
	@JoinColumn(name = "useremail_fk", insertable = false, updatable = false)
	private User user;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(String description, String duedate, String complete, String useremail, User user) {
		super();
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
		this.useremail = useremail;
		this.user = user;
	}

	public Task(Integer taskid, String description, String duedate, String complete, String useremail, User user) {
		super();
		this.taskid = taskid;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
		this.useremail = useremail;
		this.user = user;
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
