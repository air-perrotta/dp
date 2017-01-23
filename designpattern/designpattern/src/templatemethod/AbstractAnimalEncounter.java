package templatemethod;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

/**
 * 動物との出会いクラス <br/>
 * 抽象クラス
 * @author kazuya.hirota
 */
public abstract class AbstractAnimalEncounter {

	abstract void encounter();

	abstract void reactComeCome();

	abstract void reactFeeding(Feed feed);

	/**
	 * 動物とのコミュニケーションを行うfacade（窓口）メソッド
	 */
	public void communicateAnimal() {

		// 出現の予兆
		PrintUtil.print("  　  　  　  　  　  　  　ガサゴソッ");

		// 動物：出現する
		encounter(); // 抽象メソッド

		// 人：おいでおいで
		comecome();

		// 動物：おいでおいでに対してリアクションする
		reactComeCome(); // 抽象メソッド

		// 人：餌を与える
		Feed feed = giveFeed();

		// 動物：餌に対してリアクションする
		reactFeeding(feed); // 抽象メソッド
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