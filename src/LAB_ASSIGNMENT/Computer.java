package LAB_ASSIGNMENT;

import java.util.Objects;

public class Computer {

        private String computerNumber;
        private String lcdModel;
        private int ramSize;
        private int hddSize;
        private boolean hasGPU;


        public Computer() {
            this.computerNumber = "Default";
            this.lcdModel = "Default";
            this.ramSize = 0;
            this.hddSize = 0;
            this.hasGPU = false;
        }


        public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
            this.computerNumber = computerNumber;
            this.lcdModel = lcdModel;
            this.ramSize = ramSize;
            this.hddSize = hddSize;
            this.hasGPU = hasGPU;
        }



        public String getComputerNumber() {
            return computerNumber;
        }

        public void setComputerNumber(String computerNumber) {
            this.computerNumber = computerNumber;
        }

        public String getLcdModel() {
            return lcdModel;
        }

        public void setLcdModel(String lcdModel) {
            this.lcdModel = lcdModel;
        }

        public int getRamSize() {
            return ramSize;
        }

        public void setRamSize(int ramSize) {
            this.ramSize = ramSize;
        }

        public int getHddSize() {
            return hddSize;
        }

        public void setHddSize(int hddSize) {
            this.hddSize = hddSize;
        }

        public boolean getHasGPU() {
            return hasGPU;
        }

        public void setHasGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
        }

        public boolean equals(Object o) {
            Computer computer = (Computer) o;
            return Objects.equals(computerNumber, computer.computerNumber);
        }

        public Computer clone() {
            return new Computer(this.getComputerNumber(),this.getLcdModel(),this.getRamSize(),this.getHddSize(),this.getHasGPU());
        }


    public String toString() {
        return "\n" +
                " Computer Number = '" + computerNumber + '\'' +
                "\n LcdModel = '" + lcdModel + "'" +
                "\n Ram Size = " + ramSize +
                "\n Hdd Size = " + hddSize +
                "\n Has GPU = " + hasGPU
                ;
    }
}
