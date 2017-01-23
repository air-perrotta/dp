package strategy.animal;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

public class Dog implements Animal{

	@Override
	public void encounter() {
		PrintUtil.print(Arrays.asList(
				"             　　　                         　　犬があらわれた！！",
				"             　　　                         　　Uo･ｪ･oU ワンッ♪"));
	}

	@Override
	public void reactComeCome() {
		PrintUtil.print(Arrays.asList(
				"       ク〜ン!!",
				"( ^-^)⊃ U>ｪ <U　)ﾉｼ ==3"));
	}

	@Override
	public void reactFeeding(Feed feed) {
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