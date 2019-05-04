import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.*;

public class Soal1 {
    private String name;
    private String address;
    private String[] hobbies;
    private boolean isMarried;
    private Map<String, String> school;
    private List<String> skills;
   
    public Soal1(){
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public Map<String, String> getSchool() {
        return school;
    }

    public void setSchool(Map<String, String> school) {
        this.school = school;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
	
	 public JSONObject toJSON() {
		
        try{
			JSONObject jo = new JSONObject();
			jo.put("Nama", name);
			jo.put("alamat", address);
			jo.put("hobi", hobbies);
			jo.put("isMarried", isMarried);
			for (String name: school.keySet()){
				String key =name.toString();
				String value = school.get(name).toString();  
				jo.put(key,value);
			}
			for(int i=0; i < skills.size();i++){
				jo.put("skills", skills);
			}
			
			

			return jo;
		}catch(JSONException e){
			
		}
		return null;
    }


	public static void main(String[] args){
		Soal1 biodata = new Soal1();
		
		Map<String, String> school = new HashMap<>();
		school.put("highSchool", "MAN Purwakarta");
		school.put("university", "UNSIKA");
		List<String> skills = new ArrayList<>();
		skills.add("Pemrograman Java Desktop");
		skills.add("Pemrograman Android Dasar");
		
		biodata.setName("Ihsan Husaeri");
		biodata.setAddress("Purwakarta");
		biodata.setHobbies(new String[]{"nonton yutup"});
		biodata.setSchool(school);
		biodata.setSkills(skills);
		
		System.out.println(biodata.toJSON());
		
	}
}
