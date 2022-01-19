package project1;


/**
 * @Description CustomerList為物件列表,用Array來管理Customer,提供給CustomerView增刪查改方法。
 * @author Jin
 * @version
 * @date 2021年1月19日18:36
 *
 */
public class CustomerList {
	//屬性
	private Customer[] customers; //保存客戶的Array
	private int total = 0;  //客戶總數
	/**
	 * 初始化的構造器
	 * @param totalCustomer:指定Array長度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * @Description 將指定客戶添加到Array
	 * @param customer
	 * @return true:添加成功 false:添加失敗
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length) {
			return false;
		}
		customers[total++] = customer;
		return true;
	}
	
	/**
	 * @Description 修改指定索引的客戶信息
	 * @param index
	 * @param cust
	 * @return true:修改成功 false:修改失敗
	 */
	public boolean replaceCustomer(int index,Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	
	/**
	 * @Description 刪除指定索引的客戶
	 * @param index
	 * @return true:刪除成功 false:刪除失敗
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}
		//將目標移至最後
		for(int i = index;i < total - 1;i++) {
			customers[i] = customers[i + 1];
		}
		//先將客戶總數減一,並將最後一位設為null
		customers[--total] = null;
		return true;
	}
	
	/**
	 * @Description 取得所有客戶
	 * @return
	 */
	public Customer[] getAllCustomer() {
		Customer[] cust = new Customer[total];
		for(int i = 0;i < total;i++) {
			cust[i] = customers[i];
		}
		return cust;
	}
	
	/**
	 * @Description 取得索引值的客戶
	 * @param index
	 * @return 如果找到則返回,若沒有返回null。
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	
	/**
	 * @Description 取得客戶總數
	 * @return
	 */
	public int  getTotal() {
		return total;
	}
}
