package com.syntax.class23JavaAdvance;



public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver web=new Safari();
        web.startBrowser();
        web.openURL("www.google.com");
        web.testLoginPage();
        web.closeBrowser();


        System.out.println("-------------------------------------------------");


        WebDriver[] allWebs ={new Chrome(),new Safari(),new Edge(),new FireFox()};
        for(WebDriver driver:allWebs){
            driver.startBrowser();
            driver.openURL("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }
        for (int i=0; i<allWebs.length; i++){
            allWebs[i].startBrowser();
            allWebs[i].openURL("www.google.com");
            allWebs[i].testLoginPage();
            allWebs[i].closeBrowser();
        }
    }
}
