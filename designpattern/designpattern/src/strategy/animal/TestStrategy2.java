package strategy.animal;

/**
 * テンプレートメソッド解説用のクラス
 * 動物との出会い、ふれあいを実行する。
 */
public class TestStrategy2{

	/**
	 * メインメソッド 様々な動物と出会い、仲良くなるためにいろいろします。
	 * @param args
	 */
	public static void main(String args[]) {
		Animal animal = factoryAnimal();
		AnimalEncounter encounter = new AnimalEncounter(animal); 
		// facadeのメソッドを呼び出す
		encounter.communicateAnimal();
	}

	/**
	 * AbstractAnimalEncounterを生成するためのfactoryメソッド どの動物とのコミュニケーションを行うかを決め、
	 * それに応じたEncounterを返す。
	 * @return
	 */
	private static Animal factoryAnimal() {
		return  new Cat();
	}
}