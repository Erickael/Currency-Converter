//setting combo's items to take the "key  -  value" form
public class ComboItem {
	String key, value;

	ComboItem(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return key + "  -  " + value;
	}
}
