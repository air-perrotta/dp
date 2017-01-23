package templatemethod;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

/**
 * 猫とのふれあいの具象クラス
 * @author kazuya.hirota
 */
public class CatEncounter extends AbstractAnimalEncounter{

	@Override
	void encounter() {
		PrintUtil.print(Arrays.asList(
				"                  猫があらわれた！！",
				"                   (^･ω･^=)~"));
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