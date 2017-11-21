package coverage;

public class Coverage {
	
	int count;

	public void someMethod() {
		if (count > 0)
			count++;
	}
	
	
	public void setCount(int count) {
		this.count = count;
	}
	
	
}