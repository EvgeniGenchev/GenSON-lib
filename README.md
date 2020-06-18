# GenSON
Non-string based JSON parsering library for JAVA.

## Downloads
Download [GenSON-1.0](https://github.com/EvgeniGenchev/GenSON-lib/tree/master/realise)

## Functions

GenSON-1.0 has four simple functions.

**CleanJson** is a function that removes part of the JSON String. The openBrackets options are "\[" and "{". If square open bracket is passed the function will remove the highest rank array or arrays and return a string without them.


```java
cleanJson(String json ,String openBrackets) // if openBrackets doesn't equal [ or { 
                                           //  the function will return the json string not changed
```


**GetArray** is a function that returns a ArrayList<String> of all of the highest rank arrays. Don't forget to use `.get(0)` if getArray returns only JSONarray.
  


```java
getArray(String json)
```


**GetSubClass** is a function  that returns a ArrayList<String> of all of the highest rank nested objects. Don't forget to use `.get(0)` if getArray returns only JSONarray.
  
  
  ```java
getSubClass(String json)
```


**ParseKeys** is a function that returns a HashMap<String, String> of all of keys and their values. Don't forget that if your JSON string contains multiple occurances of a key with different values you have to parse the JSON file with one of the functions above before trying to parse the keys.Otherwise, you keys will have the last value that is used for it.


```java
getArray(String json)
```


## Usage

GenSON is non-string based parser which means that it should be used only if you have an idea on the contents of it. You can see few [examples](https://github.com/EvgeniGenchev/GenSON-lib/tree/master/test) on OpenWeather API's retrieved JSON files.



