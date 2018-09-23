package com.example.administrator.retrofitdemo.Retrofit2;

public class APIUtils {
    public static final String Base_Url = "http://10.2.24.195/quanlysinhvien/";

    public static DataClient getData() {
        return RetrofitClient.getClient(Base_Url).create(DataClient.class);
    }
}
