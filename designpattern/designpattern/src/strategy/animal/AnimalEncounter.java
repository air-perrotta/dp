package strategy.animal;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

/**
 * 動物との出会いクラス
 * @author kazuya.hirota
 *
 */
public class AnimalEncounter {

	private Animal animal;

	/**
	 * コンストラクター
	 * @param animal
	 */
	public AnimalEncounter(Animal animal) {
		this.animal = animal;
	}

	/**
	 * 動物とのコミュニケーションを行うfacade（窓口）メソッド
	 */
	public void communicateAnimal() {

		// 出現の予兆
		PrintUtil.print("  　  　  　  　  　  　  　ガサゴソッ");

		// 動物：出現する
		animal.encounter(); // 抽象メソッド

		// 人：おいでおいで
		comecome();

		// 動物：おいでおいでに対してリアクションする
		animal.reactComeCome(); // 抽象メソッド

		// 人：餌を与える
		Feed feed = giveFeed();
		// 動物：餌に対してリアクションする
		animal.reactFeeding(feed); // 抽象メソッド
	}

	/**
	 * おいでおいでする
	 */
	private void comecome() {
		PrintUtil.print(Arrays.asList("　・・・おいで　おいで", "( ^-^)⊃）"));
	}

	/**
	 * 餌を与える
	 * 
	 * @return feed
	 */
	private Feed giveFeed() {
		// とりあえず餌をきめる
		Feed feed = Feed.Meat;

		PrintUtil.print(Arrays.asList("ご飯だよ〜", "( ^-^)⊃⌒　" + feed.getName()));
		return feed;
	}

}