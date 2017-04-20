package com.theironyard;

/**
 * Created by Keith on 4/20/17.
 */
public class Bill {
   String table_id;
    int id;
    String name;
    int price;

    public Bill(String table_id, int id, String name, int price) {
        this.table_id = table_id;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getTable_id() {
        return table_id;
    }

    public void setTable_id(String table_id) {
        this.table_id = table_id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
