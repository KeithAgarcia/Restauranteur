package com.theironyard;
import com.google.gson.Gson;
import com.sun.org.apache.xpath.internal.operations.Mod;
import spark.Spark;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static String customerName;
    public static HashMap<String, Order> customerBill = new HashMap<>();

    public static Gson gson = new Gson();
    public static ArrayList<Menu> customermenu = new ArrayList<Menu>();// <> has to be class inside.



    public static void main(String[] args) {

        customermenu.add(new Menu(1, "number 1", "corndog", 56.05, true));
        customermenu.add(new Menu(2, "number 2", "MacCheese", 79.06, true));


        Spark.get("/menu", (req, res) ->{
            return gson.toJson(customermenu);
        });

        Spark.post("/order/:customer", (request, response) -> {
            String payingCustomer = request.params(":customer");
            Order order = customerBill.get(payingCustomer);
            if (order == null){
                order = new Order(payingCustomer);
                customerBill.put(payingCustomer, order);
                return gson.toJson(customerBill);
            } else {
               // customerBill.put(":customer", order);
                //return gson.toJson(customerBill);
            }
        });
    }

}
