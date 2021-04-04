public class DigitalVideoDisc {
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;

    public DigitalVideoDisc(String _title) {
        setTitle(_title);
    }

    public DigitalVideoDisc(String _title, String _category){
        setTitle(_title);
        setCategory(_category);
    }

    public DigitalVideoDisc(String _title, String _category, String _directory){
        setTitle(_title);
        setCategory(_category);
        setDirectory(_directory);
    }

    public DigitalVideoDisc(String _title, String _category, String _directory, int _length, float _cost){
        setTitle(_title);
        setCategory(_category);
        setDirectory(_directory);
        setLength(_length);
        setCost(_cost);
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

            tmp = d1.getCategory();
            d1.setCategory(d2.getCategory());
            d2.setCategory(tmp);

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
        String[] wordsSplit = title.split(" ", 10);
        boolean result = true;

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

    public String getCategory() {
        return category;
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

    public void setCategory(String category) {
        this.category = category;
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
        System.out.println(getTitle() + " - " + getCategory() + " - " + getDirectory() + " - " + getLength()
         + ": " + getCost() + "$");
    }
}
