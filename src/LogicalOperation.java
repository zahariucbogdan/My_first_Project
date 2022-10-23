public class LogicalOperation {

    public int checkBiggerNumber(){
        int number2 = 7;
        int number1 = 21;
        if (number1>number2){
            return number1;
        }else
            return number2;
    }




    public String textComp(String textInput) {

        if (textInput.equals("FastTrack")) {
            return "Learning text comparison";
        } else {


            return "Got to try some more.";
        }
    }

    public int getGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String textAndNumberComparison(String textInput2, int numberImput) {
        if (textInput2.equals("FastTrack") && numberImput <= 3) {
            return textInput2 + numberImput;
        } else if (!textInput2.equals("FastTrack") && numberImput >= 4) {
            return numberImput + textInput2;
        } else {
            return "No condition was met";
        }

    }







}

