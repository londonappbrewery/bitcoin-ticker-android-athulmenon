package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONObject;
import org.json.JSONException;

/**
 * Created by athul on 29/3/18.
 */


public class PriceTicker {

    //Variables to hold prices
    private String mLastPrice;

    //Create a PriceTicker, We will call this instead of the standard constructor.
    public static PriceTicker fromJson(JSONObject jsonObject) {
        // JSON parsing is risky business. Need to surround the parsing code with a try-catch block.
        try {
            PriceTicker ticker = new PriceTicker();
            //Taking value from Json format with Id "last"
            ticker.mLastPrice = jsonObject.getString("last");
            Log.d("Bitcoin","Last price "+ ticker.mLastPrice);
            return ticker;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Getter Methods. To get the variables in MainActivity

    public String getLastPrice() {
        return mLastPrice;
    }
}
