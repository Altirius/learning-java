package Enums;

import Interfaces.ISelectebleItem;

public enum RAM implements ISelectebleItem {
	GB_2(1, "2 Гб"),
	GB_4(2, "4 Гб"),
	GB_8(3, "8 Гб"),
	GB_16(4, "16 Гб");

	private Integer key;	
	private String title;

	RAM(Integer key, String title) {
		this.key = key;
		this.title = title;
	}

	static public RAM getEntityByKey(Integer key) {
		RAM[] options = RAM.values();
		for (int i = 1; i < options.length; i++) {
			if (options[i].getKey() == key) {
				return options[i];
			}
		}

		return options[0];
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
