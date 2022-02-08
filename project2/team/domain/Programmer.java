package team.domain;
/**
 * @Description 程序員類
 * @author Jin
 *
 */
public class Programmer extends Employee{
	private int menberId;
	private Status status = Status.FREE;
	private Equipment equipment;
	
	
	public Programmer(int id, String name, int age, double salary,Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
		// TODO Auto-generated constructor stub
	}
	public int getMenberId() {
		return menberId;
	}
	public void setMenberId(int menberId) {
		this.menberId = menberId;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	@Override
	public String toString() {
		
		return getDetails() + "\t程序員\t" + status + "\t\t\t" + equipment.getDescription();
	}
	
	public String detailsBase() {
		return menberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
	}
	
	public String getDetailsForTeam() {
		return detailsBase() + "\t程序員\t";
	}
	
}
