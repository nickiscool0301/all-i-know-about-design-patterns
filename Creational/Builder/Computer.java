package Creational.Builder;

public class Computer {
    private String CPU;
    private int RAM;
    private String GPU;

    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
    }

    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}


/*
In main
Computer computer = new Computer.Builder().setCPU("a").setGPU("b").setRAM(15).build()
 */