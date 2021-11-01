package Workception.Work.Objects.DBExtractor;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import Workception.Work.Objects.Skill;

@Component
public class SkillExtractor implements GetFromDB<Skill> {

	@Override
	public ArrayList<Skill> getData() {
		
		ArrayList<Skill> result = new ArrayList<Skill>();
		
		result.add(new Skill(1, "java"));
		result.add(new Skill(2, "mySQL"));
		result.add(new Skill(3, "JS"));
		result.add(new Skill(4, "Python"));
		result.add(new Skill(5, "maven"));
		result.add(new Skill(6, "boot"));
		
		return result;
		
	}

}
