package strategy.skinship;

/**
 * ストラテジー解説用のクラス
 * 動物との出会い、ふれあいを実行する。
 */
public class TestStrategy1{

	/**
	 * メインメソッド 様々な動物と出会い、仲良くなるためにいろいろします。
	 * @param args
	 */
	public static void main(String args[]) {
		AbstractAnimalSkinship skinship = factorySkinship();
		// facadeのメソッドを呼び出す
		skinship.communicateAnimal();
	}

	/**
	 * AbstractAnimalEncounterを生成するためのfactoryメソッド　<br/>
	 * どの動物とのコミュニケーションを行うかを決め、
	 * それに応じたEncounterを返す。
	 * @return
	 */
	private static AbstractAnimalSkinship factorySkinship() {
		// 戦略を決定
		SkinshipStrategy strategy = factoryStrategy(); 
		return new CatSkinship(strategy);
	}
	
	private static SkinshipStrategy factoryStrategy() {
		return new PassiveSkinshipStrategy();
	}
}