package com.lijen.object_oriented_0131;
/*
 * 代理模式(Proxy Pattern):
 * 	代理模式是Java開發中使用較多的的一種設計模式。代理設計就是為其他物件提供一種代理,以控制這個物件的訪問。
 * 
 * 應用場景:
 * 	安全代理:屏蔽對真實角色的直接訪問。
 * 	遠程代理:通過代理類處理遠程方法調用。
 * 	延遲加載:先加載輕量級代理物件,有需要時再加載真實需要的物件。
 * 
 * 分類:
 * 	靜態代理
 * 	動態代理
 * 
 * 
 */
public class ProxyIntro {

	public static void main(String[] args) {
		Server s1 = new Server();
		//ProxyServer代理了Server做了Server自己的browser方法
		new ProxyServer(s1).browser();

	}

}

interface NetWork{
	public void browser();
}

//被代理類
class Server implements NetWork{
	@Override
	public void browser() {
		// TODO Auto-generated method stub
		System.out.println("真實的伺服器訪問網路");
	}
}

//代理類
class ProxyServer implements NetWork{
	
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	
	public void check() {
		System.out.println("聯網前的檢查");
	}
	
	@Override
	public void browser() {
		check();
		
		work.browser();
	}
	
}
