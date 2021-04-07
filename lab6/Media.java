package lab6;

public class Media {
	public String title;
	public String caterogy;
	public float cost;
	public int id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCaterogy() {
		return caterogy;
	}
	public void setCaterogy(String caterogy) {
		this.caterogy = caterogy;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public void display() {
		
	}

	
}
