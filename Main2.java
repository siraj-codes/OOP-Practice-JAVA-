class Animal {

	private char Animal_Gender  ;
	
	Animal () {
		this.Animal_Gender = 'x';	
	}

	Animal (char Animal_Gender) {
		this.Animal_Gender = Animal_Gender ;
	}
		
	void set_Animal_Gender( char Animal_Gender) {
		this.Animal_Gender = Animal_Gender;
		
	}

	char get_Animal_Gender () {
		return Animal_Gender ;
	}

}


class Dog extends Animal {
	
	private  String Dog_Sound ;
	private String  Dog_Name ;

	Dog (String Dog_Name) {
		this.Dog_Name = Dog_Name ;
	}

	Dog () {
		Dog_Name = "Tommmmmy";
	}

	void set_Dog_Sound (String Dog_Sound) {
		
		this.Dog_Sound = Dog_Sound ;

	}

	String get_Dog_Sound () {
		return Dog_Sound ;
	}

	void set_Dog_Name (String Dog_Name) {
		this.Dog_Name = Dog_Name ;
	
	}

	String get_Dog_Name () {
		return Dog_Name ;
	
	}

		

}

class Array {

	 String[] My_Array = {"ABCD" ,"EFGH" ,"IJKL" ,"LMNOP" , "1234"};
	void set_My_Array (String[] My_Array) {
		this.My_Array = My_Array; 		
	
	}
	String[] get_My_Array () {
		
		return My_Array;
	}	
}


public class Main2 {

	public static void main (String args[]) {

		Animal a1 ;
		a1 = new Animal ('x');

		Dog d1 ;
		d1 = new Dog ();
		System.out.print("\n\n\n");
		System.out.println(d1.get_Animal_Gender());
		System.out.println(d1.get_Dog_Sound());
		System.out.println(d1.get_Dog_Name()+"\n\n\n");

		Array a2 ;
		a2 = new Array () ;

		a2.set_My_Array (new String[]{"123", "45666"});
			
		for (String i : a2.get_My_Array() ){
		System.out.println(i);
					
		}



			
	}



}