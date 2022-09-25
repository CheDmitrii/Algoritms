package zadanie_4_3.prak_4;

public enum Acounts {
    USER_ONE("shoper11", "kolot12"),
    USER_TWO("mr.By", "1223"),
    USER_THREE("freeMan", "hello"),
    USER_FOUR("Aligator", "godZila69"),
    USER_FIVE("akaterina", "123412"),
    USER_SIX("Sveta6791", "1111"),
    USER_SEVEN("golova", "sveta");
    private String login;
    private String pasword;
    Acounts(String login, String pasword){
        this.login = login;
        this.pasword = pasword;
    }
    public String getLogin(){
        return login;
    }
    public String getPasword(){
        return pasword;
    }
}
