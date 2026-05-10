class Sum{
	public static void main(String[] args){         // java treats command line arguments as string, but if you are passing any other data type then you need to use parse function afterwards
		double a= Double.parseDouble(args[0]);  //so parseDouble method converts string to double. 
		double b= Double.parseDouble(args[1]);  //argument should be double, but if you pass let say '20gb' then it will throw Numberformatexception
		System.out.println("hello umesh "+(a+b));

}
}
