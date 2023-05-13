package com.example.javaproject3.week4.day18;

public class Address {
    private String fullAddr;
    private String sido;  // 시도
    private String sigungu; // 시군구

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }

    public String getFullAddr() {
        return fullAddr;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }
}
