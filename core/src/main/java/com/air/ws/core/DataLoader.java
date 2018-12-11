package com.air.ws.core;

import java.util.ArrayList;

import air18.foi.hr.database.entities.Discount;
import air18.foi.hr.database.entities.Store;

public abstract class DataLoader {


    public ArrayList<Store> getStores() {
        return stores;
    }

    public void setStores(ArrayList<Store> stores) {
        this.stores = stores;
    }

    public ArrayList<Store> stores;

    public ArrayList<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(ArrayList<Discount> discounts) {
        this.discounts = discounts;
    }

    public ArrayList<Discount> discounts;

    protected DataLoadedListener mDataLoadedListener;

    public void loadData(DataLoadedListener dataLoadedListener){
        this.mDataLoadedListener = dataLoadedListener;
    }

    public boolean dataLoaded(){
        if(stores == null || discounts == null){
            return false;
        }
        else{
            return true;
        }
    }
}
