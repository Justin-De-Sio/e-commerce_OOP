package fr.justin.article;

public class Pc extends Article {
    Article cpu, gpu, powerSupply, case1, motherboard, ram, disk;
    PcBuilder builder;

    public Pc(PcBuilder builder) {
        super(builder.nom, builder.prix);
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.powerSupply = builder.powerSupply;
        this.case1 = builder.pcCase;
        this.motherboard = builder.motherboard;
        this.ram = builder.ram;
        this.disk = builder.disk;
        setTotalPrice();
    }

    public void setTotalPrice() {
        float cpt = 0;
        if (null != cpu) cpt = cpt + cpu.prix;
        if (null != gpu) cpt = cpt + gpu.prix;
        if (null != powerSupply) cpt = cpt + powerSupply.prix;
        if (null != case1) cpt = cpt + case1.prix;
        if (null != motherboard) cpt = cpt + motherboard.prix;
        if (null != ram) cpt = cpt + ram.prix;
        if (null != disk) cpt = cpt + disk.prix;
        this.setPrix(cpt);
    }

    public static class PcBuilder {
        String nom;
        Float prix;
        Article cpu, gpu, powerSupply, pcCase, motherboard, ram, disk;

        public PcBuilder(String nom, Float prix) {
            this.nom = nom;
            this.prix = prix;
        }

        public PcBuilder addGpu(Article gpu) {
            this.gpu = gpu;
            return this;
        }

        public PcBuilder addCpu(Article cpu) {
            this.cpu = cpu;
            return this;
        }

        public PcBuilder addPowerSupply(Article powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public PcBuilder addPcCase(Article pcCase) {
            this.pcCase = pcCase;
            return this;
        }

        public PcBuilder addMotherboard(Article motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public PcBuilder addRam(Article ram) {
            this.ram = ram;
            return this;
        }

        public PcBuilder addDisk(Article disk) {
            this.disk = disk;
            return this;
        }

        public Pc build() {
            return new Pc(this);
        }
    }
}
