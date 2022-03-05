package com.simpllearn.basics;

public class BackEndService {

    HttpRequestCustom requestObject;

    public void doBackUp() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("backing up the data!");
    }

    public void request(HttpRequestCustom request) {
        request.setStatus(200);
        request.setMessage("Welcome to Junit5");
        System.out.println("Processing " + request);
        this.requestObject = request;
    }
}
