package LAB_ASSIGNMENT;

import java.util.Arrays;

public class University {
    private Lab[] labs = new Lab[100];
    public University(Lab[] labs)
    {
        this.labs = labs;
    }

    public void addLab(Lab l) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] == null) {
                labs[i] = l;
                break;
            }
        }

    }

    public void removeLab(Lab l) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i].getLabID().equals(l.getLabID()))
            {
                labs[i] = null;
            }
        }
    }

    public Lab getLab(String id) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] != null && labs[i].getLabID().equals(id)) {
                return labs[i];
            }

        }
        return null;
    }



    public String toString() {
        return "University :- \n" +
                "labs = " + Arrays.toString(labs)
                ;
    }
}





