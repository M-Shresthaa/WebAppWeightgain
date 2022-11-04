package ttc;

import java.io.Serializable;

public class ParameterBean implements Serializable{
	private String name;
	private String gender;
	private String age;
	private String weight;	
	public ParameterBean(){
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setGender(String selectedFruit){
		this.gender = selectedFruit;
	}
	public String getGender(){
		return gender;
	}
	public void setAge(String age){
		this.age=age;
	}
	public String getAge(){
		return age;
	}
	public void setWeight(String weight){
		this.weight = weight;
	}
	public String getWeight(){
		return weight;
	}

}
	