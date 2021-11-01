package Workception.Work.Objects.DBExtractor;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import Workception.Work.Objects.Project;

@Component
public class ProjectExtractor implements GetFromDB<Project>{

	@Override
	public ArrayList<Project> getData() {
		
		ArrayList<Project> result = new ArrayList<Project>();
		
		LocalDate localDate = LocalDate.of(2020, 11, 10);
	    Date date = Date.valueOf(localDate);
	      
		result.add(new Project(1, "CUP-Deposit", date));
		result.add(new Project(2, "LookTV", date));
		result.add(new Project(2, "Eagle Post", date));
		result.add(new Project(2, "Workception", date));
		
		return result;
		
	}

}