package lab8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.ArrayList;

public class Books extends Media implements Comparable<Object>{
    private List<String> authors = new ArrayList<String>();
    private String content;
    private List<String> contentTokens;
    private Map<String, Integer> wordFrequency;
    
    public Books(String title, String category, float cost, List<String> authors, String content)
    {
        super(title,category,cost);
        setAuthors(authors);
        setContent(content);
        contentTokens = new ArrayList<>();
        wordFrequency = new TreeMap<>();
    }
    

	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public List<String> getContentTokens() {
		return contentTokens;
	}


	public void setContentTokens(List<String> contentTokens) {
		this.contentTokens = contentTokens;
	}


	public Map<String, Integer> getWordFrequency() {
		return wordFrequency;
	}

	public void processContent()
	    {
	        String regex = "[!.,? ]";
	        StringTokenizer token = new StringTokenizer(getContent(), regex);
	        TreeMap<String, Integer> tempFrequency = new TreeMap<>();
	        while(token.hasMoreElements())
	        {
	            String s = token.nextToken();
	            getContentTokens().add(s);
	            System.out.println(s);
	        }

	        for(String s : contentTokens)
	        {
	            if(tempFrequency.containsKey(s))
	            {
	                tempFrequency.replace(s, tempFrequency.get(s) + 1);
	            }else{
	                tempFrequency.put(s, 1);
	            }
	        }

	        setWordFrequency(tempFrequency);
	    }


	@Override
	public String toString() {
		String tostring ="Title: " + getTitle()+"\n Category: " + getCategory()+"\n Cost: " + getCost()+"\n Author: ";
		for(String author : getAuthors())
        {
            tostring+=author +',';
        }
		Set<String> keys = getWordFrequency().keySet();
        for (String key : keys)
        {
            tostring+='\n'+key + ": " + getWordFrequency().get(key);
        }
		return tostring;
	}


	public void setWordFrequency(Map<String, Integer> wordFrequency) {
		this.wordFrequency = wordFrequency;
	}


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
        System.out.println("TITLE : "+getTitle() + " CATREROGY:  " + getCategory() + " COST: " + getCost() + "$");
    }

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		 if(obj.getClass() != getClass()) throw new AssertionError("Error");
	        Books obj1 = (Books) obj;
		if(cost>obj1.getCost())return 1;
		if(cost<obj1.getCost())return -1;
		return 0;
	}



}
