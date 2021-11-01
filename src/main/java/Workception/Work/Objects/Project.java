package Workception.Work.Objects;

import java.sql.Date;

public class Project {

	private int pid;
	
	private String name;
		
	private Date date;
	
	public Project (int pid, String name, Date date) {
		this.name = name;
		this.date = date;
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
}
