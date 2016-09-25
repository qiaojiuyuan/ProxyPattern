/**
 * 代理类
 * @author qiaojy
 *
 */
public class GamePlayerProxy implements IGamePlayer{

	private IGamePlayer gamePlayer = null;
	public GamePlayerProxy(String name) {
		try {
			gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
