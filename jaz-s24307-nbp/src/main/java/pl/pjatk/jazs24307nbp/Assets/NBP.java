package pl.pjatk.jazs24307nbp.Assets;

public class NBP {
    private String table;
    private String code;

    private long days;

    public NBP() {
    }

    public NBP(String table, String code, long days) {
        this.table = table;
        this.code = code;
        this.days = days;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
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
