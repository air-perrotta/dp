package templatemethod;

/**
 * テンプレートメソッド解説用のクラス<br/>
 * 動物との出会い、ふれあいを実行する。
 */
public class TestTemplateMethod {

	/**
	 * メインメソッド 様々な動物と出会い、<br/>
	 * 仲良くなるためにいろいろします。
	 * @param args
	 */
	public static void main(String args[]) {
		// abstractの抽象化されたクラスで宣言する
		AbstractAnimalEncounter encounter = factoryEncounter();
		// facadeのメソッドを呼び出す
		encounter.communicateAnimal();
	}

	/**
	 * AbstractAnimalEncounterを生成するためのfactoryメソッド<br/>
	 * どの動物とのコミュニケーションを行うかを決め、<br/>
	 * それに応じたEncounterを返す。
	 * @return
	 */
	private static AbstractAnimalEncounter factoryEncounter() {
		// 具象クラスを返す
		return new CatEncounter();
	}
}