package LAB_ASSIGNMENT;

import javax.lang.model.util.ElementScanner14;

public class Demo {
    public static void main(String[] args) {
        Computer c1 = new Computer("Amaan" , "12344" , 8 , 45 , true);
        Computer c2 = new Computer("Ali" , "123098" , 10 , 99 , false);
        Computer c3 = c1.clone();


        Computer[] c4 = new Computer[5] ;
        c4[0] = c2;
        c4[1] = c1;
        c4[2] = c3;
        Computer c5 = new Computer("Ahmad" , "345678" , 6,23,true);
        Employee e1 = new Employee("Azhar123" ,"Azhar");

        Lab l1 = new Lab("69", c4,LabStatus.OPERATIONAL,e1 );
        Lab l3 = new Lab("556" , c4,LabStatus.FAULTY_MULTIMEDIA, e1);
        l1.addComputer(c5);
        l1.addComputer(c1);
        System.out.println(l1);
        l1.removeComputer(c2);
        System.out.println("\nAfter removal of computer \n" +l1);
        l1.changeStatus(LabStatus.FAULTY_MULTIMEDIA);
        System.out.println("\n After change of status \n Lab Status : " +l1.getStatus());
        Lab[] l2 = new Lab[3];
        l2[0] = l1;
        University u1 = new University(l2);
        u1.addLab(l3);
        System.out.println(u1);




    }

}
