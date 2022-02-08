package team.view;

import team.domain.*;
import team.service.*;

public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	public void enterMainMenu() {
		
		boolean loopFlag = true;
		char menu = 0;
		
		while(loopFlag) {
			if(menu != '1') {
				listAllEmployees();
			}
			
			
			System.out.println("1-團隊列表 2-添加團隊成員 3-刪除團隊成員 4-退出 請選擇(1-4):");
			menu = TSUtility.readMenuSelection();
			switch (menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.println("是否退出(Y/N):");
				char isExit = TSUtility.readConfirmSelection();
				if(isExit == 'Y') {
					loopFlag = false;
				}
				break;
			
			}
		}
	}
	
	private void listAllEmployees() {
		System.out.println("----------------------------------員工開發調度系統----------------------------------");
		
		Employee[] employees = listSvc.getAllEmployees();
		if(employees == null || employees.length == 0) {
			System.out.println("公司中沒有任何員工信息!");
		}else {
			System.out.println("ID\t姓名\t年齡\t工資\t職位\t狀態\t獎金\t股票\t領用設備");
			for (int i = 0; i < employees.length; i++) {
				System.out.println(employees[i]);
			}
		}
		System.out.println("------------------------------------------------------------------------------");
	}
	
	private void getTeam() {
		System.out.println("----------------------------------團隊列表----------------------------------");
		
		Programmer[] team =  teamSvc.getTeam();
		if(team == null || team.length == 0) {
			System.out.println("團隊中沒有成員");
		}else {
			System.out.println("TID/ID\t姓名\t年齡\t工資\t職位\t狀態\t獎金\t股票\n");
			for (int i = 0; i < team.length; i++) {
				System.out.println(team[i].getDetailsForTeam());
			}
		}
		
		System.out.println("------------------------------------------------------------------------------");

	}
	
	private void addMember() {
		System.out.println("----------------------------------添加團隊成員----------------------------------");
		System.out.println("請輸入要增加的員工ID");
		int id = TSUtility.readInt();
		
		try {
			Employee emp = listSvc.getEmployee(id);
			
			teamSvc.addMember(emp);
			
			System.out.println("添加成功");
			
			TSUtility.readReturn();
		} catch (TeamException e) {
			System.out.println("刪除失敗,原因:" + e.getMessage());
		}
	}
	
	private void deleteMember() {
		System.out.println("----------------------------------刪除團隊成員----------------------------------");
		System.out.println("請輸入要刪除的員工TID");
		int memberId = TSUtility.readInt();
		
		System.out.println("是否要刪除?(Y/N):");
		char isDelete = TSUtility.readConfirmSelection();
		if('N' == isDelete) {
			return;
		}
		try {
			teamSvc.removeMember(memberId);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("刪除失敗,原因:" + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}
}
