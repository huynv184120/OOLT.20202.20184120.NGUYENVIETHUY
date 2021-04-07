package lab6;
public class DigitalVideoDisc extends Media {
	private String directory;
	private int length;
    
    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category){
        super(title,category);
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super(title,category,cost);
    }
    public DigitalVideoDisc(String title, String category, float cost, String directory, int length)
    {
        super(title, category, cost);
        setLength(length);
        setDirectory(directory);
    }

    
    public static void swap(Object o1, Object o2)
    {
        DigitalVideoDisc d1 = (DigitalVideoDisc) o1;
        DigitalVideoDisc d2 = (DigitalVideoDisc) o2;

        DigitalVideoDisc d3 = null;
        if(d1 != null && d2 != null)
        {
            String tmp = d1.getTitle();
            d1.setTitle(d2.getTitle());
            d2.setTitle(tmp);

            tmp = d1.getCaterogy();
            d1.setCaterogy(d2.getCaterogy());
            d2.setCaterogy(tmp);

            tmp = d1.getDirectory();
            d1.setDirectory(d2.getDirectory());
            d2.setDirectory(tmp);

            tmp = String.valueOf(d1.getLength());
            d1.setLength(d2.getLength());
            d2.setLength(Integer.parseInt(tmp));

            tmp = String.valueOf(d1.getCost());
            d1.setCost(d2.getCost());
            d2.setCost(Float.parseFloat(tmp));
        }
    }

	public boolean search(String title)
    {
        String[] wordsSplit = title.split(" ");
        for (String s : wordsSplit)
        {
            if(getTitle().indexOf(s) == -1)
                return false;
        }

        return true;
    }

    
 
    public String getTitle() {
        return title;
    }



    public String getDirectory() {
        return directory;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

  
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void display()
    {
        System.out.println(getTitle() + " - " + getCaterogy() + " - " + getDirectory() + " - " + getLength()
         + ": " + getCost() + "$");
    }
}
