package project1;
/**
 * @Description CustomerView主要提供用戶介面。
 * @author Jin
 * @version
 * @date 2021年1月19日18:36
 *
 */
public class CustomerView {
	/**
	 * @Descrition 主程序
	 * @author Jin
	 */
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
	
	
	//屬性
	private CustomerList customerList = new CustomerList(10);
	
	public CustomerView() {
		Customer cust = new Customer("張三",'男',23,"0928170123","chang3@gmail.com");
		customerList.addCustomer(cust);
	}
	/**
	 * @Descrition 進入主菜單的方法
	 * @author Jin
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("\n------------------客戶管理系統------------------\n");
			System.out.println("                      1.添加客戶");
			System.out.println("                      2.修改客戶");
			System.out.println("                      3.刪除客戶");
			System.out.println("                      4.客戶列表");
			System.out.println("                      5.退出");
			System.out.println("                   請選擇(1-5): ");
			
			char menu = CMUtility.readMenuSelection();
			switch(menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("確認是否退出:(y/n)");
				char isExit = CMUtility.readConfirmSelection();
				if(isExit == 'Y') {
					isFlag = false;
				}
			}
		}
	} 
	
	/**
	 * @Descrition 顯示加入新客戶介面的方法
	 * @author Jin
	 */
	private void addNewCustomer() {
		System.out.println("\n------------------添加客戶------------------\n");
		System.out.print("姓名: ");
		String name = CMUtility.readString(30);
		
		System.out.print("性別: ");
		char gender = CMUtility.readChar();
		
		System.out.print("年齡: ");
		int age = CMUtility.readInt();
		
		System.out.print("電話: ");
		String phone = CMUtility.readString(10);
		
		System.out.print("郵箱: ");
		String email = CMUtility.readString(30);
		
		//將上述數據封裝到物件中
		Customer cust = new Customer(name,gender,age,phone,email);
		
		boolean isSuccess = customerList.addCustomer(cust);
		if(isSuccess) {
			System.out.println("\n------------------添加完成------------------\n");
		}else {
			System.out.println("\n------------------客戶已滿------------------\n");
		}
	}
	
	/**
	 * @Descrition 顯示修改客戶信息介面的方法
	 * @author Jin
	 */
	private void modifyCustomer() {
		System.out.println("\n------------------修改客戶------------------\n");
		Customer cust;
		int ID;
		for(;;) {
			System.out.println("請選擇待修改客戶的編號(-1退出): ");
			ID = CMUtility.readInt();
			
			if(ID == -1) {
				return;
			}
			cust = customerList.getCustomer(ID - 1);
			if(cust == null) {
				System.out.println("無法找到相應客戶。");
			}else {
				break;
			}
		}
		System.out.print("姓名(" + cust.getName() + "): ");
		String name = CMUtility.readString(30,cust.getName());
		
		System.out.print("性別(" + cust.getGender() + "): ");
		char gender = CMUtility.readChar(cust.getGender());
		
		System.out.print("年齡(" + cust.getAge() + "): ");
		int age = CMUtility.readInt(cust.getAge());
		
		System.out.print("電話(" + cust.getPhone() + "): ");
		String phone = CMUtility.readString(10,cust.getPhone());
		
		System.out.print("郵件(" + cust.getEmail() + "): ");
		String email = CMUtility.readString(30,cust.getEmail());
		
		Customer newCustomer = new Customer(name,gender,age,phone,email);
		
		boolean isRepalaced = customerList.replaceCustomer(ID - 1, newCustomer);
		if(isRepalaced) {
			System.out.println("\n------------------修改成功------------------\n");
		}else {
			System.out.println("\n------------------未知錯誤------------------\n");
		}
	}
	
	/**
	 * @Descrition 顯示刪除客戶介面的方法
	 * @author Jin
	 */
	private void deleteCustomer() {
		System.out.println("\n------------------刪除客戶------------------\n");
		Customer cust;
		int ID;
		for(;;) {
			System.out.println("請選擇欲刪除客戶的編號(-1退出): ");
			ID = CMUtility.readInt();
			
			if(ID == -1) {
				return;
			}
			cust = customerList.getCustomer(ID - 1);
			if(cust == null) {
				System.out.println("無法找到相應客戶。");
			}else {
				break;
			}
		}
		System.out.println("是否確定刪除客戶(y/n): ");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y') {
			boolean isDelSuccess = customerList.deleteCustomer(ID - 1);
			if(isDelSuccess) {
				System.out.println("\n------------------刪除成功------------------\n");
			}else {
				System.out.println("\n------------------未知錯誤------------------\n");
			}
		}else {
			return;
		}
		
	}
	
	/**
	 * @Descrition 顯示所有客戶介面的方法
	 * @author Jin
	 */
	private void listAllCustomers() {
		System.out.println("-------------------------------客戶列表-------------------------------\n");
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("沒有客戶紀錄");
		}else{
			System.out.println("編號\t姓名\t性別\t年齡\t電話\t\t郵箱");
			Customer[] cust = customerList.getAllCustomer();
			for (int i = 0; i < cust.length; i++) {
				System.out.println(i + 1 + "\t" + cust[i].name + "\t" + cust[i].gender + "\t" + cust[i].age + "\t" + cust[i].phone + "\t" + cust[i].email);
			}
		}
		System.out.println("-----------------------------客戶列表完成------------------------------\n");
	}

}
