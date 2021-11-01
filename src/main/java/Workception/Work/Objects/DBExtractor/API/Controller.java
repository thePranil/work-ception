package Workception.Work.Objects.DBExtractor.API;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Workception.Work.Objects.DBExtractor.DBFactory;
import Workception.Work.Objects.DBExtractor.GetFromDB;

@RestController
@RequestMapping("/database")
public class Controller {

	@Autowired
	DBFactory factory;
	
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public ArrayList<?> getAllProjects() {
		GetFromDB<?> result = factory.getData('p');
		
		return result.getData();
	}
	
	@RequestMapping(value = "/skills", method = RequestMethod.GET)
	public ArrayList<?> getAllSkills() {
		GetFromDB<?> result = factory.getData('s');
		
		return result.getData();
	}
	
	
}
