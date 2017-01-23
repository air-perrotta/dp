package common;

public enum Feed {
	Meat("肉"), Fish("魚"), Fodder("飼い葉");
	private String name;

	private Feed(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}