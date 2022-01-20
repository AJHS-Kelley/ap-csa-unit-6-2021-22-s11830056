public class Arrays {

    public static void main(String[]args) {
        String[] strArr = new String[10];
        int[] IntArr = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9};
        double[] doubArr = {1.5,2.6,7,8.9,9.5,10.2,12.3,16.3,20.6,22.4};

        strArr[0] = "dog";
        strArr[1] = "cat";
        strArr[2] = "fish";
        strArr[3] = "dove";
        strArr[4] = "dragon";
        strArr[5] = "parrot";
        strArr[6] = "grasshopper";
        strArr[7] = "wasp";
        strArr[8] = "falcon";
        strArr[9] = "eagle";

        
        stringMethod(strArr);
    }

public static void stringMethod(){
for(int i = 0; i < 10; i++){
    String currentString = strArr[i];
    int stringLength = currentString.length();
    if(stringLength % 2 == 0)
        System.out.printLn("the string length is even");
    else if(stringLength % 2 == 1)
    System.out.printLn("The String Length is odd.");

}





}

public static void intMethod(int[] intArr){
    for(int i = 9; i >= 0; i--){
        int currInt = intArr[i];
        System.out.println(Math.pow(currInt, 2));
    }
}


}


public static void doubleMethod(){




}

}