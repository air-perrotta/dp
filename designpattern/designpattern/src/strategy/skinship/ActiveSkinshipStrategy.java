package strategy.skinship;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

/**
 * スキンシップの戦略 <br/>
 * 積極的なスキンシップ
 * @author kazuya.hirota
 */
public class ActiveSkinshipStrategy implements SkinshipStrategy {

	@Override
	public Feed giveFeed() {
		Feed feed;
		int randam = (int) (Math.random() * 10);
		feed = Feed.Fish;
		if (randam < 2) {
			feed = Feed.Meat;
		}
		PrintUtil.print(Arrays.asList("ご飯だよ〜", "( ^-^)⊃⌒　" + feed.getName(),
				"( ^-^)⊃⌒　" + feed.getName() + " ⌒" + feed.getName() + " ⌒" + feed.getName(),
				"( ^-^)⊃⌒　" + feed.getName() + " ⌒" + feed.getName() + " ⌒" + feed.getName() + " ⌒" + feed.getName()
						+ " ⌒" + feed.getName()));

		return feed;
	}

}
