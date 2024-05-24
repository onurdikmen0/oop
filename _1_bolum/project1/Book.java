package project1;
public class Book {
    private String name;
    private int page;
    private String author;

    public String getName(){
        return this.name;
    }
    public void setName(String value){
        this.name = value;
    }

    public int getPage(){
        return this.page;
    }
    public void setPage(int value){
        this.page = value;
    }

    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String value){
        this.author = value;
    }

    
    public Book(String name, int page, String author){
        this.name = name;
        this.page = page;
        this.author = author;
    }

    

}
