package com.example.student.astrologyproject;

public class predictions {
private static predictions predictions;
private String[] answers;

    private predictions(){
answers = new String[] {
         "you have a personality as vibrant as a nebula",
        "you have a heart as big as jupiter"


};


}

public static predictions get() {
   if (predictions == null){
       predictions = new predictions();


   }
return predictions;

}



public String getPrediction(){
    return answers[0];
}



}
