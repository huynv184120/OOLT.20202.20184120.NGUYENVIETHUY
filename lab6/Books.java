package lab6;

import java.util.ArrayList;
import java.util.List;

public class Books extends Media {


    private ArrayList<String> authors = new ArrayList<String>();

    public Books(String title)
    {
        super(title);
    }

    public Books(String title, String category, List<String> authors)
    {
        super(title, category);
        setAuthors(authors);
    }

    public Books(String title, String category, float cost)
    {
        super(title, category, cost);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = (ArrayList<String>) authors;
    }
    public void addAuthor(String author) {
    	if(authors.indexOf(author)!=-1) {
    		authors.add(author);
    		System.out.println(author + "already in the list");
    	}
    	else  System.out.println("Add author successfully");
    }
    public void removeAuthor(String author) {
    	if(authors.indexOf(author)!=-1) {
    		authors.remove(authors.indexOf(author));
            System.out.println("Remove successfully");
    	}
    	else  System.out.println(author + "does not exist in the list");
    }
    public void display()
    {
        System.out.println(getTitle() + " - " + getCaterogy() + ": " + getCost() + "$");
    }

}
