package strategy.skinship;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

public class CatSkinship extends AbstractAnimalSkinship{

	public CatSkinship(SkinshipStrategy strategy) {
		super(strategy);
	}

	@Override
	void encounter() {
		PrintUtil.print(Arrays.asList(
				"                       猫があらわれた！！",
				"                     にゃ〜 (^･ω･^=)~"));
	}

	@Override
	void reactComeCome() {
		PrintUtil.print(Arrays.asList(
				"                  　　　 ビクッ!!",
				"             　　　        (^･ω･^=)~"));
	}

	@Override
	void reactFeeding(Feed feed) {
		if(Feed.Fish == feed){
			PrintUtil.print(Arrays.asList(
					"      にゃーん!!",
					"　　　"+ feed.getName() +"(^･ω･^=)~　＝＝＝＝＝＝＝＝＝＝＝3"));
		}else{
			PrintUtil.print(Arrays.asList(
					"            　　　　　　　　　　　 フーッ!!",
					"　　　　　　　　　　　　　　　　　　         　　　　　　　s== ~(=^･"));
		}
	}
		
}