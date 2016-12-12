package feeder;

import java.util.ArrayList;

public class Response {
    public Integer status;
    public String message;
    public ArrayList<Item> items;

    public Response(Integer status, String message, ArrayList<Item> items) {
	this.status = status;
	this.message = message;
	this.items = items;
    }

    public Response(Integer status, String message) {
	this(status, message, new ArrayList<Item>());
    }

    public void addItem(Item i) {
	this.items.add(i);
    }

}
