package zadanie_4_4.prak_4;

public enum ModelsOfCompucter {
    MAC_BOOK_PRO(new Processor("M1 MAX", "chip", 10, 32), new Memory("SSD", 4096), new Monitor("Retina", 14.2, 60)),
    MAC_BOOK_AIR(new Processor("M2", "chip", 10, 16), new Memory("SSD", 2048), new Monitor("Retina", 14.2, 60)),
    HP_OMEN(new Processor("Intel i7", "processor", 8), new Memory("SSD", 4096), new Monitor("2K", 17, 60)),
    LENOVO(new Processor("Intel i7", "processor", 8), new Memory("SSD", 4096), new Monitor("4K", 16, 120));
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    ModelsOfCompucter(Processor processor, Memory memory, Monitor monitor){
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }
}
