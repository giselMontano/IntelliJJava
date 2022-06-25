package com.syntax.class23JavaAdvance;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(String url){
        System.out.println("Opening url"+url);
    }
    public void testLoginPage(){
        System.out.println("Checking if login page is visible");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
//SHORTCUT FOR OVERRIDE control+o
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    public void openURL(String url) {
        System.out.println("Opening the URL"+url+"on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Fire Fox");
    }

    @Override
    public void openURL(String url) {
        System.out.println("Opening the URL"+url+"on Fire Fox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Fire Fox ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Fire Fox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL"+url+" on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the  Safari");
    }
}

class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Edge");
    }

    @Override
    public void openURL(String url) {
        System.out.println("opening the URL"+url+" on Edge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Edge");
    }
}


