package by.it.a_dubatovka.lesson03;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;

public class Lesson3Test {
    /*
    для прохождения тестов создайте JUnit-конфигурацию на свой пакет:
    Поля:
    Name:               Test a_khmelov (тут ваша фамилия)
    Test kind:          All in package
    Package:            by.it.a_khmelov (тут ваша фамилия)
    Search for test:    In whole project
    */

    @Test
    public void A() throws Exception {
        String root = System.getProperty("user.dir") + "/src/";
        File f = new File(root + "by/it/a_dubatovka/lesson03/dataHuffman.txt");
        A_Huffman instance = new A_Huffman();

        String result = instance.encode(f);

        //boolean ok=result.equals("01001100100111");
        //assertTrue("A failed", ok);
        Assert.assertEquals("A failed", "01001100100111", result);
    }

    @Test
    public void A_oneChar() throws Exception {
        String root = System.getProperty("user.dir") + "/src/";
        File f = new File(root + "by/it/a_dubatovka/lesson03/dataHuffman_oneChar.txt");
        A_Huffman instance = new A_Huffman();

        String result = instance.encode(f);

        Assert.assertEquals("A failed", "0", result);
    }

    @Test
    public void B() throws Exception {
        String root = System.getProperty("user.dir") + "/src/";
        File f = new File(root + "by/it/a_dubatovka/lesson03/encodeHuffman.txt");
        B_Huffman instance = new B_Huffman();

        String result = instance.decode(f);

        boolean ok = result.equals("abacabad");
        assertTrue("B failed", ok);
    }

    @Test
    public void B_oneChar() throws Exception {
        String root = System.getProperty("user.dir") + "/src/";
        File f = new File(root + "by/it/a_dubatovka/lesson03/encodeHuffman_oneChar.txt");
        B_Huffman instance = new B_Huffman();

        String result = instance.decode(f);

        Assert.assertEquals("B failed", "a", result);
    }

    @Test
    public void C() throws Exception {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/a_dubatovka/lesson03/heapData.txt");
        C_HeapMax instance = new C_HeapMax();

        Long res = instance.findMaxValue(stream);

        boolean ok = (res == 500);
        assertTrue("C failed", ok);
    }

}