public class Book{

private int bookId;
private String name;

public void setBookId(Integer bid)
{
	this.bookId= bid;
	System.out.println("BookId is set");
}
public int getBookId()
{
	return bookId;
}
public void setName(String name)
{
	this.name= name;
}
public String getName()
{
	return name;
}
}

