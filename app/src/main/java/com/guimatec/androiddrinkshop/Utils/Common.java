package com.guimatec.androiddrinkshop.Utils;

import com.guimatec.androiddrinkshop.Model.User;
import com.guimatec.androiddrinkshop.Retrofit.IDrinkShopAPI;
import com.guimatec.androiddrinkshop.Retrofit.RetrofitClient;

public class Common {
    //No Emulador, localhost = 10.0.2.2

    private static final String BASE_URL = "http://192.168.0.10/drinkshop/";

    public static User currentUser = null;

    public static IDrinkShopAPI getAPI()
    {
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);

    }
}
