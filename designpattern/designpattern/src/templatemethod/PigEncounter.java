package templatemethod;

import java.util.Arrays;
import common.Feed;
import common.PrintUtil;


/**
 * 猫とのふれあいの具象クラス
 * @author kazuya.hirota
 */
public class PigEncounter extends AbstractAnimalEncounter {

	@Override
	void encounter() {
		PrintUtil.print(Arrays.asList("             　　　                         　　豚があらわれた！！",
				"             　　　                         　　(´(00)` )ﾌﾞﾋ"));
	}

	@Override
	void reactComeCome() {
		PrintUtil.print(Arrays.asList("             　　　                         　　ブーブーブーッ!!",
				"             　　　                            (○｀（●●）´○)"));
	}

	@Override
	void reactFeeding(Feed feed) {
		PrintUtil.print(Arrays.asList("     ぶひぃーん。", "　　　" + feed.getName() + "(>(oo) < ).:｡+ﾟ＝3＝3＝3＝3＝3＝3＝3＝3"));
	}

}