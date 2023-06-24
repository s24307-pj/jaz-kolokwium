package pl.pjatk.jazs24307nbp.Assets;

public class NBP {
    private long id;
    private String code;

    private long days;

    public NBP() {
    }

    public NBP(long id, String code, long days) {
        this.id = id;
        this.code = code;
        this.days = days;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getDays() {
        return days;
    }

    public void setDays(long days) {
        this.days = days;
    }
}
