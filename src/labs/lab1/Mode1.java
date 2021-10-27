package labs.lab1;

public class Mode1{

    /**
     * Constructor #1 (default constructor)
     * Returns null, for this constructor, user should no place any input
     *
     * @author      Gabo Segura
     * @param       first_name The first name of the person
     * @param       last_name The second name of the person
     * @param       height The height of the person
     * @param       weight The weight of the person
     * @param       travel Tell if the person will travel or not
     * @param       smokes Tell if the person smokes or not
     * @return      Returns null info
     */

    private String first_name;
    private String last_name;
    private int height;
    private double weight;
    private boolean travel;
    private boolean smokes;

    public Mode1() {
        // this does nothing
    }

    public void printDetails1() {
        System.out.println(get_First_name());
    }

    /**
     * Constructor #2 (default constructor)
     * Input should be like this -> first name + last name + height + weight
     * Example output:
     * Name: Sarah Connor
     * Height: 25 inches
     * Weight: 100 pounds
     *
     * @author      Gabo Segura
     * @param       first_name The first name of the person
     * @param       last_name The second name of the person
     * @param       height The height of the person
     * @param       weight The weight of the person
     * @return      Returns name (fisrt name) + (last name) + height in inches + weight in pounds
     */

    public Mode1(String first_name, String last_name, int height, double weight){
        set_First_Name(this.first_name);
        set_Last_Name(this.last_name);
        set_Height(this.height);
        set_Weight(this.weight);
    }

    public String get_First_name() {
        return first_name;
    }

    public void set_First_Name(String first_name){
        int stringLength = first_name.length();
        if (stringLength > 3 && stringLength < 20) {
            System.out.println(this.first_name);
        }
        else{
            System.out.println("Please enter your first name with 3 to 20 characters");
        }
    }

    public String get_Last_name() {
        return last_name;
    }

    public void set_Last_Name(String last_name){
        int stringLength = last_name.length();
        if (stringLength > 3 && stringLength < 20) {
            System.out.println(this.last_name);
        }
        else{
            System.out.println("Please enter your last name with 3 to 20 characters");
        }
    }

    public int get_Height() {
        return height;
    }

    public void set_Height(int height){
        if (height > 24 && height < 84) {
            System.out.println(this.height);
        }
        else {
            System.out.println("Your height must be between 24 inches to 84 inches");
        }
    }

    public double get_Weight() {
        return weight;
    }

    public void set_Weight(double weight){
        if (weight > 80 && weight < 280) {
            System.out.println(this.weight);
        }
        else {
            System.out.println("Your weight must be between 80 pounds to 280 pounds");
        }
    }

    public void printDetails2() {
        System.out.println("Name: " + get_First_name() + " " + get_Last_name());
        System.out.println("Height: " + get_Height() + " inches");
        System.out.println("Weight: " + Math.round(get_Weight()) + " pounds");
    }

    /**
     * Constructor #3 (default constructor)
     * Constructor #2 (default constructor)
     * Input should be like this -> first name + last name + height + weight + smokes + travel
     * Example output:
     * Name: Sarah Connor
     * Height: 25 inches
     * Weight: 100 pounds
     *
     * @author      Gabo Segura
     * @param       first_name The first name of the person
     * @param       last_name The second name of the person
     * @param       height The height of the person
     * @param       weight The weight of the person
     * @param       travel Tell if the person will travel or not
     * @param       smokes Tell if the person smokes or not
     * @return      the image at the specified URL
     */

    public Mode1(String first_name, String last_name, int height, double weight, boolean travel, boolean smokes){
        this.first_name = first_name;
        this.last_name = last_name;
        this.height = height;
        this.weight = weight;
        this.travel = travel;
        this.smokes = smokes;
    }

    public boolean get_travel() {
        return travel;
    }

    public void set_Travel(boolean travel){
        if (travel == true) {
            System.out.println("Does travel ");
        } else {
            System.out.println("Does not travel ");
        }
    }

    public boolean get_smokes() {
        return smokes;
    }

    public void set_Smokes(boolean smokes){
        if (smokes == true) {
            System.out.println("Does smoke ");
        } else {
            System.out.println("Does not smoke ");
        }
    }


    // adding part literally like the exercise says

    public String getHeightInFeetAndInches() {
        return null;
    }
    // e.g. "5 feet", or
    // e.g. "5 feet 1 inch", or
    // e.g. "5 feet 6 inches", or

    public long getWeightKg() {
        return 0;
    }
    // e.g. 103 (Math.round() the number)

    public void getFirst_name(String first_name ) {
    }

    public void setWeight(long kilograms) {
    }

    public void setWeight(double pounds) {

    }

    public void setHeight(int feet, int inches) {

    }

    public void setHeight(int inches) {

    }



    public int calculatePayDollarsPerHour() {
        return 0;
    }

    public void displayModelDetails() {

    }

    public void printDetails3() {
        System.out.println("Name: " + get_First_name() + " " + get_Last_name());
        System.out.println("Height: " + get_Height() + " inches");
        System.out.println("Weight: " + Math.round(get_Weight()) + " pounds");
        if (travel == true) {
            System.out.println("Does travel ");
        } else {
            System.out.println("Does not travel ");
        }
        if (smokes == true) {
            System.out.println("Does smoke ");
        } else {
            System.out.println("Does not smoke ");
        }

    }


}

