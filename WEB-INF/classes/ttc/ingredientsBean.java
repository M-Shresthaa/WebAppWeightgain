package ttc;

import java.io.Serializable;

public class ingredientsBean implements Serializable{
	private String foods[];
	
	public ingredientsBean(){
	}
	public void setFood(String foods[]){
		this.foods = foods;
	}
	public String[] getFood(){
		return foods;
	}
}
	