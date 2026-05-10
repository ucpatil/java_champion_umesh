class Day13{  
	//jvm i expcting this signature only which is psvm, its case sensitive. Main is not accepted. it should be public static void main(String args[]) and you should pass args at clias many args you         have used in the code
	public static void main(String args[]){ // if no arg is passed then runtime errror
		System.out.println("hello world "+args[0]);  //if one argument is passed then only this line will run. ok boi line will not run. runtime error. args[1] expected . out of bound error.
		System.out.println("ok boi "+args[1]); //this line will be executed only if both args are passed at cli
		//if more than 2 args are passed then it will still run fine. program will end with one more blank line printed.
	}
}
