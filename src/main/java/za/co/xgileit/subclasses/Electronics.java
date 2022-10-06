package za.co.xgileit.subclasses;

import za.co.xgileit.abstractclasses.Product;

public class Electronics extends Product {

    public Electronics(int pid, String pname, double pcost) {
        super(pid, pname, pcost);
    }

    @Override
    public void showDetail() {

    }
}
