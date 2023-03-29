public class Age {

    public int AgeId = 29;

    public String age(){
        String newString = String.format("\"---<%d>---\"%n",AgeId);
        System.out.println(newString);
        return newString;


    }
}