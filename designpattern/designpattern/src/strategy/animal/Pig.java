package strategy.animal;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

public class Pig implements Animal{

	@Override
	public void encounter() {
		PrintUtil.print(Arrays.asList(
				"             　　　                         　　豚があらわれた！！",
				"             　　　                         　　(´(00)` )ﾌﾞﾋ"));
	}

	@Override
	public void reactComeCome() {
		PrintUtil.print(Arrays.asList(
				"             　　　                         　　ブーブーブーッ!!",
				"             　　　                            (○｀（●●）´○)"));
	}

	@Override
	public void reactFeeding(Feed feed) {
			PrintUtil.print(Arrays.asList(
					"     ぶひぃーん。",
					"　　　"+ feed.getName() +"(>(oo) < ).:｡+ﾟ＝3＝3＝3＝3＝3＝3＝3＝3"));
	}
		
}