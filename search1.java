class search1
{
   public Book[]fictionbooks = new Book[5];
   public Book[]nonfictionbooks =new Book[5];
   public Book[]horrorbooks = new Book[5];
   public Book[] childrenbooks = new Book[5];
   public search1()
   {
	
        fictionbooks[0] = new Book("The Handmaid's Tale", "Margaret Atwood", 400);
        fictionbooks[1] = new Book("To Kill a Mockingbird", "Harper Lee", 300);
        fictionbooks[2] = new Book("The Book Thief", "Markus Zusak", 400);
        fictionbooks[3] = new Book("Brave New World", "Aldous Huxley", 500);
        fictionbooks[4] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 300);
      	nonfictionbooks [0] = new Book("The Elements of Style", "William Strunk Jr. and E.B. White",500);
      	nonfictionbooks [1] = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 400);
      	nonfictionbooks [2] = new Book("The Power of Habit", "Charles Duhigg",450);
      	nonfictionbooks [3] = new Book("Cosmos", "Carl Sagan", 300);
      	nonfictionbooks [4] = new Book("The Immortal Life of Henrietta Lacks", "Rebecca Skloot", 200);
        horrorbooks [0] = new Book("The Shining", "Stephen King", 400);
        horrorbooks [1] = new Book("Dracula", "Bram Stoker", 500);
        horrorbooks [2] = new Book("The Haunting of Hill House", "Shirley Jackson",600);
        horrorbooks [3] = new Book("It", "Stephen King", 300);
        horrorbooks [4] = new Book("The Exorcist", "William Peter Blatty",200);
        childrenbooks[0] = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 300);
        childrenbooks[1] = new Book("Where the Wild Things Are", "Maurice Sendak", 450);
        childrenbooks[2] = new Book("The Very Hungry Caterpillar", "Eric Carle", 500);
        childrenbooks[3] = new Book("Goodnight Moon", "Margaret Wise Brown", 200);
        childrenbooks[4] = new Book("Green Eggs and Ham", "Dr. Seuss", 960);
   }
        public Book[] getFictionBooks() 
	{
        	return fictionbooks;
	}
	public Book[] getNonFictionBooks()
	{
        	return nonfictionbooks;
	}
	public Book[] getHorrorBooks() 
	{
        	return horrorbooks;
	}
	public Book[] getChildrenBooks() 
	{
        	return fictionbooks;
	}
}

	