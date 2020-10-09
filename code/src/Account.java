import metadata.AccountStatus;

public class Account{
    private String id, password;
    private AccountStatus status;

    private Catalog catalog;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }
    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Catalog getCatalog() {
        return catalog;
    }
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}