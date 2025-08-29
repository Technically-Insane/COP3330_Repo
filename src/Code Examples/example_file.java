class example_file
{
    /* 
    |Methods| (Also called functions)

    Methods follow a very specific structure, a head and a body.
    Starting with the method head, we can look at the simple "HelloWorld" function. 
    */

    public void HelloWorld()
    {
        System.out.println("Hello, World!");
    }

    /* 
    The head is "public void HelloWorld()". This head has 3 basic parts.
        - The Access Modifier
        - The Return Type
        - The Method Name

    The access modifer determines the scope, or what parts of your code can access the method.
    The most basic access modifiers are thus:
        - public : Method can be accessed by outside classes
        - private : Method can be accessed by only the class that contains it

    The return type determines the type of data the method will output.
    Notably, methods with a return type of "void" don't output data, but just run code.
    Usually, a method will have a return type mirroring a datatype.
    Here, we see a method with a reurn type of int, meaning calling this function will equate to an int datatype.
    */ 

    public int Add(int x, int y)
    {
        return x + y;
    }

    /*
    This method, notably also contains the "return" keyword.
    This signifies what value to output from the function.
    Unless the method is "void", you must have a return statement in the body.

    Noticably, this function also has "arguments" housed in the parenthesis.
    Arguments are your "inputs". Here, we input an integer x and y.
    When the method is called, these arguments must be filled in order to be typed properly.
    */

   int ex = Add(1, 2);

   /*
   Here, I call the method with x = 1, and y = 2. 
   based on the function, it will return x + y, or in this case 1 + 2.
   We know this is equal to 3.
   Therefore, you can assign this directly to a value or do operations with it.

   Example:
   */

  int example_num_1 = Add(7, 8);         //Results in 15
  int example_num_2 = 4 + Add(5, 6);     //Results in 15
  int example_num_3 = Add(Add(1, 2), 3); //Reults in 6

  /*
  Back to the head, we also see in this case "Add", which is the function name.
  The function name is what we type to "call" it, or refer to it in our code.

  Now, diving deeper into the body. The body is entirely housed in the braces.
  The body holds all the "code". Computations, a return statements, variable redefinitions, etc.
  */

  public int Subtract(int x, int y)
  {
    return x - y;
  }

  /* In this method's body, we simply house a return statement. Most methods may have 
     hundreds of lines, internal method calls, and variable references.

     I hope this helps!
     */
}