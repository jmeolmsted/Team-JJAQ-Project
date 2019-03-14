package View;

public class Difficulty {
	private String displayValue;
	private Double sortValue;
	
	public Difficulty() {
		
	}
	
	public Difficulty(Double s, Double t) {
		sortValue = (s*t)/100;
		
		if(sortValue <= 10) {
			displayValue = "Low";
		}else if(sortValue <= 20) {
			displayValue = "Medium";
		}else {
			displayValue = "High";
		}
	}
	
	public String getDisplay() {
		return displayValue;
	}
	
	public void update(Double s, Double t) {
		sortValue = (s*t)/100;
		
		if(sortValue <= 10) {
			displayValue = "Low";
		}else if(sortValue <= 20) {
			displayValue = "Medium";
		}else {
			displayValue = "High";
		}
	}
	
	public Double getSort() {
		return sortValue;
	}

}