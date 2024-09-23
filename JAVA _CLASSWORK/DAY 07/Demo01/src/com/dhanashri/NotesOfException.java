package com.dhanashri;

public class NotesOfException {

}


Object 
|- Throwable 
    |- Error 
    |   |- AssertionError 
    |   |- VirtualMachineError 
    |           |- StackOverflowError 
    |           |- OutOfMemoryError     
    |- Exception     //checked exception , compulsary to write try and catch
        |- CloneNotSupportedException 
        |- IOException 
        |       |- EOFException 
        |       |- FileNotFoundException 
        |- SQLException 
        |- InterruptedException 
        |- RuntimeException //unchecked exception , not compulsary to write try and catch
            |- NullPointerException
            |- ArithmeticException 
            |- NoSuchElementException 
            |       |- InputMismatchException 
            |- IndexOutOfBoundsException 
                    |- ArrayIndexOutOfBoundsException 
                    |- StringIndexOutOfBoundsException 


//     try {
//     ---> the block where exception can be happpen.
//          write inside main() method 
//     }
    
//     throw  
//     ---> throw is write inside the method to throw a exception with new keyword 
//         and message with it normally we cant use throw in the unchecked exception 
//         it will automatically throws it .
    
//     throws 
//     ---> it is write in the method declaration line to throws the exception
//          it is used in checked exception .
         
//     catch()
//     ---> it is the block where we handle exception. 
//          catch block is write below try block 
//          inside catch block we write a message to handle the exception 
//          we creat reference(object) of exception
