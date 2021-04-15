package lab7;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	private int id;
	private String caterogy;
	public Media(String title, String caterogy, float cost) {
		super();
		this.title = title;
		this.caterogy = caterogy;
		this.cost = cost;
	}
	public Media(String title, String caterogy) {
		super();
		this.title = title;
		this.caterogy = caterogy;
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
	public String getCaterogy() {
		return caterogy;
	}
	
}
