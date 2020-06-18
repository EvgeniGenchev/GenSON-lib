# GenSON
Non-string based JSON parsering library for JAVA.

## Downloads
Download [GenSON-1.0](https://github.com/EvgeniGenchev/GenSON/tree/master/realise)

### Functions

GenSON-1.0 has four simple functions.

CleanJson is a function that removes part of the JSON String. The openBrackets options are "\[" and "{". If square open bracket is passed the function will remove the highest rank array or arrays and return a string without them.
```java
cleanJson(String json ,String openBrackets) // if openBrackets doesn't equal [ or { 
                                           //  the function will return the json string not changed
```

GetArray is a function that returns a ArrayList<String> of all of the highest rank arrays. Don't forget to use `.get(0)` if getArray returns only JSONarray.
  
```java
getArray(String json)
```




#### Usage

GenSON is non-string based parser which means that it should be used only if you have an idea on the contents of it.



