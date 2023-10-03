package LAB_ASSIGNMENT;

import java.util.Arrays;

public class Lab {
    private String labID;
    private Computer[] computers ;
    private LabStatus status;
    private Employee labAttendant;

    public Lab() {
        this.labID = "Default";
        this.computers = null;
        this.status = null;
        this.labAttendant = null;
    }

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public Computer[] getComputers() {
        return computers;
    }



    public LabStatus getStatus() {
        return status;
    }



    public Employee getLabAttendant() {
        return labAttendant ;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }
public String getLabID()
{
    return labID;
}


    public void changeStatus(LabStatus l){
        this.status = l;
    }
    public void addComputer(Computer c)
    {
       for(int i = 0 ; i < computers.length ; i++)
       {
           if(computers[i] == null)
           {
               computers[i] = c;
               break;
           }
       }
    }
    public void removeComputer(Computer c)
    {
        for(int i = 0 ; i < computers.length ; i++)
        {
            if(computers[i].getComputerNumber().equals(c.getComputerNumber()) )
            {
                computers[i] = null;
            }
        }
    }
    public Computer getComputer(String number)
    {
        for(int i = 0 ; i < computers.length ; i++)
        {
            if(computers[i] != null && computers[i].getComputerNumber().equals(number))
            {
                return computers[i];
            }

        }
        return null;
    }


    public String toString() {
        return "Lab details :- \n" +
                " LabID='" + labID + '\'' +
                "\n Computer Details :- \n" + Arrays.toString(computers) +
                "\n status = " + status +
                "\n " + labAttendant
                ;
    }
}


