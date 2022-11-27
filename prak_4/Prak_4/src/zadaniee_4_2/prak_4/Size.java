package zadaniee_4_2.prak_4;

public enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40),
    XL(42),
    XXL(44),
    XXXL(46);
    private int euroSize;
    Size(int euroSize){
        this.euroSize = euroSize;
    }
    public String getDescription(){
        switch (euroSize){
            case 32:
                return "Kid's size";
            case 34:
            case 38:
            case 36:
            case 40:
            case 42:
            case 44:
            case 46:
                return "Adult's Size";
            default:
                return "no size";
        }
    }
}
