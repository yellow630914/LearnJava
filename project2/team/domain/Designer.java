package team.domain;

public class Designer extends Programmer{
	private double bonus;
	
	public Designer(int id, String name, int age, double salary, Equipment equipment,double bonus) {
		super(id, name, age, salary, equipment);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		
		return getDetails() + "\t設計師\t" + getStatus() + "\t" + getBonus() + "\t\t" + getEquipment().getDescription();
	}
	
	public String getDetailsForTeam() {
		return detailsBase() + "\t設計師\t" + getBonus();
	}
	
}
