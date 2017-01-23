package strategy.animal;

import java.util.Arrays;

import common.Feed;
import common.PrintUtil;

public class Cat implements Animal{

	@Override
	public void encounter() {
		PrintUtil.print(Arrays.asList(
				"                  猫があらわれた！！",
				"                   (^･ω･^=)~"));
	}

	@Override
	public void reactComeCome() {
		PrintUtil.print(Arrays.asList(
				"                  　　　 ビクッ!!",
				"             　　　        (^･ω･^=)~"));
	}

	@Override
	public void reactFeeding(Feed feed) {
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