package com.alldi.listviewexample.com.alldi.datas;

// 가게가 갖고있는 고유 정보를 저장하는 역할.
public class Store {
    public String name;
//    거리 : 가게의 좌표와 나의 좌표를 비교해서 계산!
//    위도 / 경도 => 34.333, 234.523
//    double latitude;
//    double longitude;
    public String adress;
    public String openTime;
    public String closeTime;

    public Store(String name, String adress, String openTime, String closeTime) {
        this.name = name;
        this.adress = adress;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}
