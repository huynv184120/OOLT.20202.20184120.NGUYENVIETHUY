package lab7;

import java.util.List;
import java.util.ArrayList;

public class Books extends Media{
    private List<String> authors = new ArrayList<String>();

    
    public Books(String title, String category, float cost, List<String> authors)
    {
        super(title,category,cost);
        setAuthors(authors);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String author)
    {
        if(authors.contains(author))
        {
            authors.add(author);
            System.out.println(author + "already in the list");
        }else{
            System.out.println("Add author successfully");
        }
    }

    public void removeAuthor(String author)
    {
        if(authors.contains(author))
        {
            authors.remove(authors.indexOf(author));
            System.out.println("Remove successfull");
        }else{
            System.out.println(author + "does not exist in the list");
        }
    }

    public void display()
    {
        System.out.println("TITLE : "+getTitle() + " CATREROGY:  " + getCaterogy() + " COST: " + getCost() + "$");
    }
}
