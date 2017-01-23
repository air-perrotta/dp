package strategy.animal;

import common.Feed;

/**
 * 動物のインターフェイス
 * @author kazuya.hirota
 *
 */
public interface Animal {
	
	void encounter();

	void reactComeCome();
	
	void reactFeeding(Feed feed);
}
