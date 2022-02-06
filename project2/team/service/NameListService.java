package team.service;

import team.domain.*;

import static team.service.Data.*;


/**
 * @Description 負責將data中的數據封裝到Employee[]數組中,同時提供相關操作Employee[]的方法。
 * @author Jin
 *
 */
public class NameListService {
	
	private Employee[] employees;

	public NameListService() {
		employees = new Employee[EMPLOYEES.length];
		
		for(int i = 0;i < employees.length;i++) {
			//獲取員工類型
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			
			//獲取Employee的4個基本信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			
			Equipment equipment;
			double bonus;
			int stock;
			
			switch(type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				stock = Integer.parseInt(EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			
			}
		}
	}
	
	/**
	 * @Description 負責幫NameListService()取得對應的設備。
	 * @param index
	 * @return
	 */
	private Equipment createEquipment(int index) {
		int key = Integer.parseInt(EQUIPMENTS[index][0]);
		String modelOrName = EQUIPMENTS[index][1];
		
		switch(key) {
		case PC://21
			String display = EQUIPMENTS[index][2];
			return new PC(modelOrName,display);
		case NOTEBOOK://22
			double price = Double.parseDouble(EQUIPMENTS[index][2]);
			return new NoteBook(modelOrName,price);
		case PRINTER://23
			String type = EQUIPMENTS[index][2];
			return new Printer(modelOrName,type);
		}
		
		return null;
	}
	/**
	 * @Description 獲取當前員工
	 * @return
	 */
	public Employee[] getAllEmployees() {
		return employees;
	}
	
	public Employee getEmployee(int id) throws TeamException {
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		
		throw new TeamException("找不到指定的員工");
	}
	
}
