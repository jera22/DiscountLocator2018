package com.air.ws.core;

import java.util.ArrayList;

import air18.foi.hr.database.entities.Discount;
import air18.foi.hr.database.entities.Store;

public abstract class DataLoader {

   static public final ArrayList<Store> stores = null;
   static public final ArrayList<Discount> discounts = null;

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
