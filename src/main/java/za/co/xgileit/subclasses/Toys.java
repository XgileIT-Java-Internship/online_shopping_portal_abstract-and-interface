package za.co.xgileit.subclasses;

import za.co.xgileit.abstractclasses.Product;

public class Toys extends Product {

    public Toys(int pid, String pname, double pcost) {
        super(pid, pname, pcost);
    }

    @Override
    public void showDetail() {

    }
}
