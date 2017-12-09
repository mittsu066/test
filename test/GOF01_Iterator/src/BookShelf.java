import java.util.ArrayList;

public class BookShelf implements Aggregate{
	//private Book[] books;
	private int last = 0;
	private ArrayList books;
	
	/*
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}*/
	
	public BookShelf(int initialsize){
		this.books = new ArrayList(initialsize);
	}
	
	public Book getBookAt(int index){
		return (Book)books.get(index);
	}
	public void appendBook(Book book){
		books.add(book);
		last++;
	}
	public int getLength(){
		return books.size();
	}
	public Iterator iterator(){
		return new BookShelfIterator(this);
	}
}