// package 0DSA.3String;

public class String_Pool {
    // String pool is a special memory region in Java where string literals are stored. 
    // When a string literal is created, it is stored in the string pool in head of creating a new object.
    //  If another string literal with the same content is created,
    //  it will reference the same memory location in the string pool instead of creating a new object.
}






/* String Pool 

Heap Memory                                            Stack Memory 
|------------------|                                   |------------------|
| String Pool      |                                   | main()            |
| "Hello"          |                                   | String str1       |
| "World"          |                                   | String str2       |
| "Hello World"    |                                   | String str3       |



*/





String str = "hi"; // str references the string literal "hi" in the string pool

// when multiple string using same stringlitrals then it will reference the same memory location

String str1 = "hi"; 
String str2 = "hi"; // str2 also references the same string literal "hi" in the string pool




              /* Usecase of String Pool */

String str3 = "Hello"; // 
// str3 references the string literal "Hello" in the string pool


/* 
Now the Hello is in the String pool ( heap memory ) and
 str3 is in the stack memory and it is referencing the Hello in the string pool.



Now if we create another string literal with the same content "Hello", 
it will reference the same memory location in the string pool instead of creating a new object.
*/



/* 
When a String created , it does not instantly get a place in the string pool.
First - It checked whether the string literal already exists in the pool.

if yes
 then the reference of the existing string literal is returned and NO new object is created in the string pool.
if no 
 then a new string literal is created in the string pool and its reference is returned.



 The Variable st3 which is the reference variable is stored in the stack memory and it points to the string literal "Hello" which is stored in the string pool in the heap memory.


*/