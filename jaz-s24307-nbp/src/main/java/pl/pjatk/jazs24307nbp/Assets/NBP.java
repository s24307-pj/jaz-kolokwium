package pl.pjatk.jazs24307nbp.Assets;

import io.swagger.v3.oas.annotations.media.Schema;

public class NBP {
    @Schema(description = "The table needed to get currency results", example = "A",title = "Currency table")
    private String table;
    @Schema(description = "Currency what we looking for", example = "gbp", title = "Currency code")
    private String code;
    @Schema(description = "Date start provided in YYYY/MM/DD format", example = "2023-06-22", title = "Start date")
    private String dateStart;
    @Schema(description = "Date end provided in YYYY/MM/DD format", example = "2023-06-24", title = "Start date")
    private String dateEnd;

    public NBP() {
    }

    public NBP(String table, String code, String dateStart, String dateEnd) {
        this.table = table;
        this.code = code;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
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

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
