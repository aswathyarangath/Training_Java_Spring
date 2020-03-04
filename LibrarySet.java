package StringCollection;

import java.util.Set;

public class LibrarySet {



	public class Library {
		int id;
		String name;
	Set<String> boooks;
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", boooks=" + boooks + "]";
	}
	public Library(int id, String name, Set<String> boooks) {
		super();
		this.id = id;
		this.name = name;
		this.boooks = boooks;
	}
		

	}

}
