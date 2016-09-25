
public class Client {

	public static void main(String[] args) {
		IGamePlayer proxy = new GamePlayerProxy("张三");
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
	}
}
