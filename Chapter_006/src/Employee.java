public class Employee {
    //create fields
    private String  Name,
                    Department,
                    Position;
    private int     ID_Number;

//Constructor that accepts values as arguments and assign them
    public Employee (String name, String department, String position, int id_number){
        Name = name;
        Department = department;
        Position = position;
        ID_Number = id_number;
    }
    //create default constructor
    public  Employee(){
            Name = "";
            Department = "";
            Position = "";
            ID_Number = 0;
    }

    //create setter constructors
    public void setName(String name){
        Name = name;
    }
    public void setDepartment(String dep){
        Department = dep;
    }
    public void setPosition(String pos){
        Position = pos;
    }
    public void setID_Number(int id){
        ID_Number = id;
    }

    //create getters constructors
    public String getName(){
        return Name;
    }
    public String getDepartment(){
        return Department;
    }
    public String getPosition(){
        return Position;
    }
    public int getID_Number(){
        return ID_Number;
    }
}
