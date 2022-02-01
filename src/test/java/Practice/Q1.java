package Practice;

import org.testng.annotations.Test;
/*
  ●TestNG (default ) olarak @Test methodları ni alfabetik sıraya gore run eder ..(Yukardan asagi degil)
  ●priority annotation Testlere öncelik vermek icin kullanilir, Kucuk olan Numara daha once calisir.
  priority:  TestNG testlerinde, testler konsola alfabetik sira ile yazdirilir.
 priorty default degeri sifirdir.
  enabled = false  methodu : Testi gormezden gelmek icin @Test in yanina    '(enabled = false)' fonksiyonunu kullaniriz.
 */

public class Q1 {
    @Test(priority = 3000)
    public void b(){
        System.out.println("b");
    }
    @Test(priority =2001 ,enabled = false)
    public void a(){
        System.out.println("a");
    }
    @Test(priority =-2000 )
    public void c(){
        System.out.println("c");
    }
    @Test
    public void test1(){
        System.out.println("test1........");
    }
    @Test
    public void test2(){
        System.out.println("test2........");
    }
    @Test
    public void test3(){
        System.out.println("test3........");
    }
    @Test(enabled = false)
    public void test4(){
        System.out.println("test4........");
    }
    @Test(enabled = false)
    public void test5(){
        System.out.println("test5........");
    }
    @Test
    public void test6(){
        System.out.println("test6........");
    }
}
