package lv.anna;

import lv.anna.bookstore.Author;
import lv.anna.bookstore.Book;

public class TestBookStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Author rowling = new Author("J.K.Rowling" , "rowling@gmail.com" , 'f'); 
		Author rainis = new Author("Rainis" , "rainis@gmail.com" , 'm'); 
		System.out.println(rowling.getEmail());
		rowling.setEmail("rowli@gmail.com");
		System.out.println(rowling.getEmail());
		Author test20 = new Author("Test20");
		Book testBook = new Book ("Books", new Author("Author1", "email@email", 'm'))
		Book harrypotter = new Book("Harry Potter" , rowling, 20.3, 1000);
		System.out.println(harrypotter.toString());
		System.out.println();
		
		
		
		
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Author test1 = new Author("name" , "name@name" , 'f');
		Author test2 = new Author("name" , "name@name1" , 'o');
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println("______________________________________");
		char checkGender = 'm';
		
		boolean testBool = checkGender();
		
		char m = 'm';
		char f = 'f';
		char o = 'o';
		
		if(m == o || f == o){
			System.out.println("It is M or F");
		}else{
			System.out.println("It is not M or F");
		}
		
		switch(o){
		case 'm':
			System.out.println("It's m");
			break; 
		case 'f': 
			System.out.println("It's f");
			break; 
			default:
				System.out.println("Not in the list");
			
		}

	}

	private static boolean checkGender() {
		// TODO Auto-generated method stub
		return false;
	}

}
