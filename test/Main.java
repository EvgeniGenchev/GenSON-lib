//Evgeni Genchev
//18.06.2020
//GenSon-1.0 examples

// this is a reader class which is used to read the exmpleJSON's text files
import static com.java.Reader.read;
import genSON.GSParser.*;

public class Main {

    //The example JSON files are retrieved from OpenWeather APIs
    public static void main(String[] args) {
        //the first and third test is on JSON example from 5 day / 3 hour Forecast API.
        //the second test is on JSON example from Current Weather Data API.
        test1();
        test2();
        test3();

    }
    // this test extracts the data for the keys of the element 0 in the main list[]
    private static void test1(){
        var json = read("exampleJSON/Json2");
        var gsp = new GSParser();
        var array = gsp.getArray(json);
        var subClasses = gsp.getSubClass(array.get(0));
        var keys = gsp.parseKeys(subClasses.get(0));

        for (var e : keys.entrySet()) {
            System.out.println(e.getKey() +" : "+  e.getValue());
        }
    }

    // this test extracts the data for the keys of the whole JSON
    //NOTE: be sure that every key name is unique. Otherwise, first parse the JSON String to get specific object or array!
    private static void test2(){
        var json = read("exampleJSON/Json1.txt");
        var gsp = new GSParser();
        var keys = gsp.parseKeys(json);

        for (var e : keys.entrySet()) {
            System.out.println(e.getKey() +" : "+  e.getValue());
        }
    }
    // this test extracts the data for the keys of everything expect the list[] array
    private static void test3(){
        var json = read("exampleJSON/Json2");
        var gsp = new GSParser();
        var cJson = gsp.cleanJson(json, "[");

        var keys = gsp.parseKeys(cJson);

        for (var e : keys.entrySet()) {
            System.out.println(e.getKey() +" : "+  e.getValue());
        }
    }
}

