package com.Java;


/* a value which can assigned for variables is called as Literals.
Types of Literals :
					1.Integral Literals
					2.Floating Literals
					3.Char Literals
					4.Boolean Literals
					5.String Literals
		1. Integral Literals:
			i} decimal Literals =allowed digits are 0-9.
								int x= 1, int x= 10, int x=100;
			ii} octal Literals = allowed digits are 0-7.
								starts with 0[zero]
					int x =010;
			iii} Hexa decimal Literals = allowed digits are 0-9, A-F, a-f
								starts with 0x, OX
					int x = 0x10, X = 0X10
					
ex : */

//class Literals
//{

	//public static void main(String[] args)
	//{
		// int x=10;
		// int y=010;
		 //int z=0X10;
		//System.out.println(x+"  "+y+"   "+z);
	//}
//}

/*		
		2.Floating Point Literals
		- by default floating point is double hence we cant assigned to float variables.
		- but we can specify explicitely floating point literals is float type by suffix with f or F.
		ex. float f = 123.456f;
			float f = 123.456F;
		
		- we can specify floating point literals explicitely as double type by suffix with d or D.
			ex. double d= 123.456D;
				double d = 123.456d;
				
ex.
*/
//class Literals
//{
//	public static void main(String[] args)
//	{
//		float f= 123.456f;
//		double d= 123.456d;
//		
//		System.out.println(f+ "....."+d);
//	}
//}

/*
			3.Boolean Literals:
				only true / false values

*/


//ex1.class Literals
//{
	//public static void main(String[] args)
	//{
	//	boolean b = true;
	//	System.out.println(b);
	//}
//}

//ex2
//class Literals
//{
	//public static void main(String[] args)
	//{
		//int x = 10;
		//if(x = 20) error int cannot be converted to boolean
		//if(x ==20) output Hi
		//if(x ==10)   output Hello
		//{
		//	System.out.println("Hello");
		//}
		//else
		//{
		//	System.out.println("Hi");
		//}
	//}
//
//}

/*
		4.Character Literals : single character withing single quotes.
			it also represented unicode of that character.
*/
	//Ex.
	class Literals
	{
		public static void main(String[] args)
		{
			//char a = 'x'; // output x
			char a = 97; //output a
			System.out.println(a);
		}
	}
			