package until;

import java.util.ArrayList;
import java.util.List;

public class PageList<T> {
    public int total = 0;
    private List<T> rows = new ArrayList<T>();

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
