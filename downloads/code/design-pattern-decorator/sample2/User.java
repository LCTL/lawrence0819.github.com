public class User {

    private String name;
    private boolean vip;
    private boolean company;

    public User(String name, boolean vip, boolean company) {
        super();
        this.name = name;
        this.vip = vip;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean isCompany() {
        return company;
    }

    public void setCompany(boolean company) {
        this.company = company;
    }

}
