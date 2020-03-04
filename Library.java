package StringCollection;

import java.util.List;

public class Library {
	int id;
	String name;
	List<String> boooks;
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", boooks=" + boooks + "]";
	}
	public Library(int id, String name, List<String> boooks) {
		super();
		this.id = id;
		this.name = name;
		this.boooks = boooks;
	}

}
