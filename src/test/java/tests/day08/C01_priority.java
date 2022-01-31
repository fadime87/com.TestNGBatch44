package tests.day08;

import org.testng.annotations.Test;

public class C01_priority {

    @Test(priority = 9)
    public  void youtubeTesti(){
        System.out.println("youtube testi calisti");
    }

    @Test
    public void amazonTesti(){//eger pririty atanmassa priority=0 kabul eder
        System.out.println("amazon testi calisti");
    }

    @Test
    public  void bestBuy(){
        System.out.println("bestbuy testi calisti");
    }
}
