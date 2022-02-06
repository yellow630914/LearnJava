package team.domain;

public class PC implements Equipment{
	private String model;//型號
	private String display;//名稱
	
	public PC(String model, String display) {
		this.model = model;
		this.display = display;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	//回傳機器屬性
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return model + "(" + display + ")";
	}
} 
