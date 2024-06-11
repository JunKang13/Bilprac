package com.kj.test10;
/*
 * @Author: Kj
 * @version: 1.0
 */
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

public class testdecodexml {
    /**
     *
     * @param a first element
     * @param b second element
     * @param c third element
     * @return sum of three elements
     */
    public int add3(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        // decode xml using dom4j
        SAXReader reader = new SAXReader();
        Document document;
        try {
            // read xml file
            document = reader.read("E:\\Java_workspace\\Bili_practice\\Module1\\src\\students.xml");
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        // get root element
        Element root = document.getRootElement();
        // get children
        Iterator<Element> it = root.elementIterator();

        // get all student elements
        while (it.hasNext()) {
            Element student = it.next();
            // get student attributes
            System.out.println("id: " + student.attributeValue("id"));
            // get student children
            Iterator<Element> itt = student.elementIterator();
            while (itt.hasNext()) {
                Element child = itt.next();
                System.out.println(child.getName() + ": " + child.getText());
            }
            System.out.println();
        }

    }
}
