class Book 
{

    private String title;
    private String author;
    private double price; 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
	}
			
}
class info1
{
   
   boolean display()
   {
	double selectedBookPrice = 0;
	search1 s=new search1();
	Book[] fictionbooks = s.getFictionBooks();
	Book[] nonfictionbooks = s.getNonFictionBooks();
	Book[] horrorbooks = s.getHorrorBooks();
	Book[] childrenbooks = s.getChildrenBooks();
	int c=1;
	for (int i = 0; i < 2; i++) 
  	{
		 Book book = fictionbooks[i];
		 System.out.print(c+++".");
		 System.out.println(book.getTitle());
	}
	
	for (int i = 0; i < 2; i++) 
	{
		Book book = nonfictionbooks[i];
		System.out.print(c+++".");
		System.out.println(book.getTitle());
	}
	
	for (int i = 0; i < 2; i++) 
	{
		Book book = horrorbooks[i];	
		System.out.print(c+++".");
		System.out.println(book.getTitle());
	}
	System.out.println("enter 7 to search for the book you want");
        System.out.println("Enter the number of the book you want to select: ");	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int selection=sc.nextInt();
	sc.nextLine();
	boolean found = false;
	switch (selection)
	{
		case 1:
		      System.out.println("Title: " + "The Handmaid's Tale "+ ", Author: " + " Margaret Atwood" + ", Price: Rs." + 400);
		      found=true;
		      break;	
		case 2:
      		      System.out.println("Title: " + "To Kill a Mockingbird "+ ", Author: " + " Harper Lee" + ", Price: Rs." + 300);
		      found=true;
		      break;
		case 3:
		      System.out.println("Title: " + "The Elements of Style "+ ", Author: " + " William Strunk Jr. and E.B. White" + ", Price: Rs." + 500);
		      found=true;
		      break;
		case 4:
		      System.out.println("Title: " + "Sapiens: A Brief History of Humankind "+ ", Author: " + " Yuval Noah Harari" + ", Price: Rs." + 400);
		      found=true;
		      break;
		case 5:
		      System.out.println("Title: " + "The Shining"+ ", Author: " + " Stephen King" + ", Price: Rs." + 400);
     		      found=true;
		      break;
		case 6:
		      System.out.println("Title: " + "Dracula"+ ", Author: " + " Bram Stoker" + ", Price: Rs." + 500);
 	 	      found=true;
		      break;
	}
	if (selection==7)
       	{		
        	System.out.print("Enter your favorite category (e.g., 'fiction books'): ");
        	String favorites = sc.nextLine();
		System.out.print("Enter title or author to search: ");
        	String searchCriteria = sc.nextLine();
	if (favorites.equalsIgnoreCase("fiction books")) 
	{
        	for (int i = 0; i < fictionbooks.length; i++) 
  		{
			Book book = fictionbooks[i];
                	if (book.getTitle().equalsIgnoreCase(searchCriteria)|| book.getAuthor().equalsIgnoreCase(searchCriteria)) 
			{
                    		System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: Rs." + book.getPrice());
			        selectedBookPrice = book.getPrice();
                    		found = true;
                	}
            	}
	}	
	else if (favorites.equalsIgnoreCase("nonfiction books")) 
	{	
        	for (int i = 0; i < nonfictionbooks.length; i++) 
		{
			Book book = nonfictionbooks[i];
                	if (book.getTitle().equalsIgnoreCase(searchCriteria)|| book.getAuthor().equalsIgnoreCase(searchCriteria)) 
			{
                    		System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: Rs." + book.getPrice());
                    		found = true;
                	}
            	}
	}	
	else if (favorites.equalsIgnoreCase("horror books")) 
	{
        	for (int i = 0; i < horrorbooks.length; i++) 
		{
			Book book = horrorbooks[i];
                	if (book.getTitle().equalsIgnoreCase(searchCriteria)|| book.getAuthor().equalsIgnoreCase(searchCriteria)) 
			{
                    		System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: Rs." + book.getPrice());
                    		found = true;
                	}
            	}
	}	
	else if (favorites.equalsIgnoreCase("children books")) 
	{
        	for (int i = 0; i < childrenbooks.length; i++) 
		{
			Book book = childrenbooks[i];
                	if (book.getTitle().equalsIgnoreCase(searchCriteria)|| book.getAuthor().equalsIgnoreCase(searchCriteria)) 
			{
                    		System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: Rs." + book.getPrice());
                    		found = true;
                	}
            	}
	}	

        if (!found)
	{
                System.out.println("No matching books found for '" + searchCriteria + "'.");
            
        }
	}
	
	return found;
   }
}