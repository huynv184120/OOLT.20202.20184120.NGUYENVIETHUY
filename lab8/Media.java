package lab8;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	public Media(String title, String caterogy, float cost) {
		this.title = title;
		this.category = caterogy;
		this.cost = cost;
	}
	public Media(String title, String caterogy) {
		super();
		this.title = title;
		this.category = caterogy;
	}
	
	public Media(String title) {
		super();
		this.title = title;
	}
  
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public abstract void display();
	public boolean equals(Object obj) {
		if (obj.getClass() != getClass()) throw new AssertionError("Error");
		Media obj1 =(Media)obj;
		if(getId() == obj1.getId())return true;
		return false;
	}
	
}
