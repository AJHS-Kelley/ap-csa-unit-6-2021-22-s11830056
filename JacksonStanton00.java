// Johann Burke, Array practice, v0.4, 01.26.22 //#endregion



public class JacksonStanton00 {

    public static void main(String[]args) {
        String[] strArr = {"dog","cat","fish","dove","dragon"};
        int[] IntArr = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9};
        double[] doubArr = {1.5,2.6,7,8.9,9.5,10.2,12.3,16.3,20.6,22.4};

        strArr[0] = "poodle";
        //System.out.println(strArr[0]);




        
        /*for (current_element = 0 ; current_element < strArr.length(); current_element += 1) {
        }
        */
        for (int i = 0; i < strArr.length; i++) {
            //System.out.println(i);
            System.out.println(strArr[i]);
        }
        /*for (String i : strArr ) {
            System.out.println(i);
        }
        */
    


for(int i = 0; i < 10; i++){
    String currentString = strArr[i];
    int stringLength = currentString.length();
    if(stringLength % 2 == 0)
    System.out.println("the string length is even");
    else if(stringLength % 2 == 1)
    System.out.println("The String Length is odd.");







}
/*
public static void intMethod(int[] intArr){
    for(int i = 9; i >= 0; i--){
        int currInt = intArr[i];
        System.out.println(Math.pow(currInt, 2));
    }
}
*/




/*public static void doubleMethod(){
}
*/
}}