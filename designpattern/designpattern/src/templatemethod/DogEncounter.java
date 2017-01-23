package templatemethod;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

/**
 * 犬とのふれあいの具象クラス
 * @author kazuya.hirota
 */
public class DogEncounter extends AbstractAnimalEncounter{

	@Override
	void encounter() {
		PrintUtil.print(Arrays.asList(
				"             　　　                         　　犬があらわれた！！",
				"             　　　                         　　Uo･ｪ･oU ワンッ♪"));
	}

	@Override
	void reactComeCome() {
		PrintUtil.print(Arrays.asList(
				"       ク〜ン!!",
				"( ^-^)⊃ U>ｪ <U　)ﾉｼ ==3"));
	}

	@Override
	void reactFeeding(Feed feed) {
		if(Feed.Meat == feed){
			PrintUtil.print(Arrays.asList(
					"      わんわん!!",
					"　　　"+ feed.getName() +"U>ｪ <U　)ﾉｼ"));
		}else{
			PrintUtil.print(Arrays.asList(
					"            　　　　　　　　　　     　     　     　     　　 キャイ〜ン!!",
					"　　　　　　　　ε== ε== ε== ε== ε== ε== ε== ε== ε== ε== ε== ε==(　　U＞ω＜）"));
		}
	}
		
}