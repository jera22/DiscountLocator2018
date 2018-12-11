package air18.foi.hr.database.entities;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.Date;
import java.util.List;

import air18.foi.hr.database.MainDatabase;

@Table(database = MainDatabase.class)
public class Discount extends BaseModel {

    @PrimaryKey(autoincrement = true)
    @Column int id;
    @Column String name;
    @Column String description;
    @Column int storeId;
    @Column Date startDate; // java.util.Date
    @Column Date endDate;
    @Column int discount_value;

    @Column
    @ForeignKey(tableClass = Store.class)
    Store store;

    public Discount() {
    }

    public Discount(int id, String name, String description, int storeId, Date startDate, Date endDate, int discount_value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.storeId = storeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount_value = discount_value;
    }
    public static List<Discount> getAll() {
        return SQLite.select().from(Discount.class).queryList();
    }

        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getDiscount_value() {
        return discount_value;
    }

    public void setDiscount_value(int discount_value) {
        this.discount_value = discount_value;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public static Discount getDiscountById(int id){
        return SQLite.select().from(Discount.class).where(Discount_Table.id.eq(id)).querySingle();
    }
}
