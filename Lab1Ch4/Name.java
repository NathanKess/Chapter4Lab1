
/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Name
{
    private String first;
    private String second;
    private String last;
    /**
     * Constructor for objects of class Name
     */
    public Name(String fr, String sc, String lst)
    {
        // initialise instance variables
        this.first = fr;
        this.second = sc;
        this.last = lst;
    }
    public String getFirst(){
        return this.first;
    }
    public String getSecond(){
        return this.second;
    }
    public String getLast(){
        return this.last;
    }
    public String firstMiddleLast(){
        return this.first+" "+this.second+" "+this.last;
    }
    public String lastFirstMiddle(){
        return this.last+" "+this.first+" "+this.second;
    }
    public boolean equals(Name otherName){
        if (this.first.equals(otherName.first)){
            return true;
        }
        else{
            return false;
        }
    }
    public String initials(){
        return this.first.substring(0,1)+" "+this.second.substring(0,1)+" "+this.last.substring(0,1);
        
    }
}
