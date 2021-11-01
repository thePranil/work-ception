package Workception.Work.Objects;

public class Skill {

	private String skill;
	
	private int sid;
	
	public Skill(int sid, String skill) {
		this.skill = skill;
		this.sid = sid;
	}
	
	public String getSkill () {
		return this.skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
}
