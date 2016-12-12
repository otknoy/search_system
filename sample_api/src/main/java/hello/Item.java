package feeder;

import java.util.ArrayList;

public class Item {
    public String title;
    public Integer price;
    public ArrayList<String> keywords;

    public Item(String title, Integer price, ArrayList<String> keywords) {
	this.title = title;
	this.price = price;
	this.keywords = keywords;
    }

    public Item(String title, Integer price) {
	this(title, price, new ArrayList<String>());
    }
}
