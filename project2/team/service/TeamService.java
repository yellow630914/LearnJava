package team.service;

import team.domain.*;

public class TeamService {
	private static int counter = 1;
	private final int MAX_MENBER = 5;
	private Programmer[] team = new Programmer[MAX_MENBER];
	private int total;
	
	
	public TeamService() {
		super();
	}
	
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for (int i = 0; i < team.length; i++) {
			team[i] = this.team[i];
		}
		return team;
	}
	/**
	 * @Description 將指定員工加入成員。
	 * @param e
	 * @throws TeamException
	 */
	public void addMember(Employee e) throws TeamException {
//		成员已满，无法添加
		if(total >= MAX_MENBER) {
			throw new TeamException("成员已满，无法添加");
		}
//		该成员不是开发人员，无法添加
		if(!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}
//		该员工已在本开发团队中
		if(isExist(e)) {
			throw new TeamException("该员工已在本开发团队中");
		}
//		该员工已是某团队成员 
//		该员正在休假，无法添加
		
		Programmer p = (Programmer)e;
		if("BUSY".equals(p.getStatus().getNAME())) {
			throw new TeamException("该员工已是某团队成员 ");
		}else if("VOCATION".equals(p.getStatus().getNAME())) {
			throw new TeamException("该员正在休假，无法添加");
		}
//		团队中至多只能有一名架构师
//		团队中至多只能有两名设计师
//		团队中至多只能有三名程序员
		
		//獲取team中,架構師,設計師,程序員的人數
		int numOfArch = 0,numOfDes = 0,numOfPro = 0;
		for (int i = 0; i < total; i++) {
			if(team[i] instanceof Architect) {
				numOfArch++;
			}else if(team[i] instanceof Designer) {
				numOfDes++;
			}else if(team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		
		if(p instanceof Architect) {
			if(numOfArch >= 1) {
				throw new TeamException("团队中至多只能有一名架构师");
			}
		}else if(p instanceof Designer) {
			if(numOfDes >= 2) {
				throw new TeamException("团队中至多只能有两名设计师");
			}
		}else if(p instanceof Programmer) {
			if(numOfPro >= 3) {
				throw new TeamException("团队中至多只能有三名程序员");
			}
		}
		
		//將p(或e)添加到現有的team中
		team[total++] = p;
		//p的屬性賦值
		p.setStatus(Status.BUSY);
		p.setMenberId(counter++);

	}
	/**
	 * @Description 從團隊當中刪除成員。
	 * @param memberId
	 */
	public void removeMember(int memberId) throws TeamException {
		int i;
		//遍歷團隊找到對應員工
		for (i = 0; i < total; i++) {
			if(team[i].getMenberId() == memberId) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		//未找到指定menberId的情況
		if(i == total) {
			throw new TeamException("未找到指定團隊成員");
		}
		//找到後開始刪除,先依次將後元素覆蓋前元素
		for(int j = i + 1;j < total;j++) {
			team[j - 1] = team[j];
		}
		//最後將最後一個元素改為null,同時total-1
		team[--total] = null;
		
	}
	
	/**
	 * @Description 判斷指定員工是否在團隊內
	 * @param e
	 * @return
	 */
	private boolean isExist(Employee e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < total; i++) {
			if(team[i].getId() == e.getId()) {
				return true;
			}
		}
		
		return false;
	}
}
