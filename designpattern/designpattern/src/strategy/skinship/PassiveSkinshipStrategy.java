package strategy.skinship;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

/**
 * 受け身なスキンシップ
 * @author kazuya.hirota
 */

public class PassiveSkinshipStrategy implements SkinshipStrategy {

	@Override
	public Feed giveFeed() {
		Feed feed;
		int randam = (int) (Math.random() * 10);
		if (randam < 2) {
			feed = Feed.Fish;
		}else if(randam < 8){
			feed = Feed.Meat;
		}else{
			feed = Feed.Fodder;
		}
		PrintUtil.print(Arrays.asList("モグモグ。おししい〜", feed.getName() + "(o^ )チラッ"));
		return feed;
	}

}
