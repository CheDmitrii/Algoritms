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
            case (32):
                return "Kid's size";
            case (34):
                return "Adult's Size";
            case (36):
                return "Adult's Size";
            case (38):
                return "Adult's Size";
            case (40):
                return "Adult's Size";
            case (42):
                return "Adult's Size";
            case (44):
                return "Adult's Size";
            case (46):
                return "Adult's Size";
            default:
                return "no size";
        }
    }
}
