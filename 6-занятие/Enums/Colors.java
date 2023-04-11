package Enums;

public enum Colors {
	WHITE(1, "Белый"),
	BLACK(2, "Чёрный"),
	GRAY(3, "Серый"),
	GRAPHITE(4, "Графитовый"),
	PINK(5, "Розовый");

	private Integer key;
	private String title;

	Colors(Integer key, String title) {
		this.key = key;
		this.title = title;
	}

	public Integer getKey() {
		return this.key;
	}

	public String getTitle() {
		return this.title;
	}

	public String getMenuItemString() {
		return String.valueOf(this.getKey()) + ") " + this.getTitle();
	}
}
