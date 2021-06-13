/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Musico.InventorySystem;

/**
 *
 * @author windows
 */
public class InstrumentData {
    
    //attributes
    private String idNo;
    private String itemName;
    private int totalItem;
    private String itemRange;
    private String category;
    private String brand;
    private int price;
    private String discount;

    // constructor
    
    public InstrumentData(String idNo, String itemName, int totalItem, String itemRange, String category, String brand, int price, String discount) {
        this.idNo = idNo;
        this.itemName = itemName;
        this.totalItem = totalItem;
        this.itemRange = itemRange;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
    }

    //getter methods 
    
    public String getIdNo() {
        return idNo;
    }

    public String getItemName() {
        return itemName;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public String getItemRange() {
        return itemRange;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public int getprice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }
    
}
