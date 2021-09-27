public class Password {
    private String pass;
    public void addPassword(String ppass){
        this.pass = ppass;
    }

    public boolean checkPassword(String ppass){
        if(!pass.equals(ppass)) return true;
        else return false;
    }
}
