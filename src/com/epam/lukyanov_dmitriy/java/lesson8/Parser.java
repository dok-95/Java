package com.epam.lukyanov_dmitriy.java.lesson8;
import com.epam.lukyanov_dmitriy.java.lesson8.Models.Nutritive;
import com.epam.lukyanov_dmitriy.java.lesson8.Models.Vegetable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Parser {

    public static Vegetable getVegetableByXML(File file, String vegetableName) {
        Vegetable vegetable = null;
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList nList = document.getElementsByTagName("vegetable");
            for (int id = 0; id < nList.getLength(); id++) {
                Node nNode = nList.item(id);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;
                    if (getTextElement(element, "name").equals(vegetableName)) {
                        int calories = Parser.parseElement(element, "calories");
                        int proteins = Parser.parseElement(element, "proteins");
                        int fats = Parser.parseElement(element, "fats");
                        int carbohydrates = Parser.parseElement(element, "carbohydrates");
                        String vitamins = getTextElement(element, "vitamins");
                        String color = getTextElement(element, "color");
                        String shape = getTextElement(element, "shape");
                        String wayForEating = getTextElement(element, "way_for_eating");
                        Class<?> vegetableClass = Class.forName("com.epam.lukyanov_dmitriy.java.lesson8.Models."+vegetableName);
                        Constructor<?> constructor = vegetableClass.getDeclaredConstructor(Nutritive.class, String.class, String.class, String.class, String.class);
                        Nutritive nutritive = new Nutritive(calories, proteins, fats, carbohydrates);
                        vegetable = (Vegetable) constructor.newInstance(nutritive, vitamins, color, shape, wayForEating);
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | InvocationTargetException |
                NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException |
                IllegalArgumentException | ClassNotFoundException | org.xml.sax.SAXException e) {
            e.printStackTrace();
        }

        return vegetable;
    }

    private static int parseElement(Element element, String tagName) {
        return Integer.parseInt(Parser.getTextElement(element, tagName));
    }

    private static String getTextElement(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }
}
