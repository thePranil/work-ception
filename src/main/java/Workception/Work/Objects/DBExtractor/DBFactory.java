package Workception.Work.Objects.DBExtractor;

import org.springframework.stereotype.Component;

@Component
public class DBFactory {

	public GetFromDB<?> getData(char type) {
	
	chooseType result = (input) ->  {
		if (type == 'p') {
			return new ProjectExtractor();
		}
		if (type == 's') {
			return new SkillExtractor();
		}
		return null;
	};
	
	return result.choose(type);
		
	}

}

@FunctionalInterface
interface chooseType {
	public GetFromDB<?> choose(char input);
}