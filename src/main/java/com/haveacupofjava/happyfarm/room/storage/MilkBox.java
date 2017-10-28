package com.haveacupofjava.happyfarm.room.storage;

import com.haveacupofjava.happyfarm.produce.AbstractProduce;
import com.haveacupofjava.happyfarm.product.AbstractProduct;

public class MilkBox extends SpecialBox {


    public MilkBox(){
        setName("milkBox");
    }

    @Override
    public void storage(AbstractProduce produce) {
        getProduces().add(produce);
        System.out.println("storage milk in the box");
    }

    @Override
    public AbstractProduct clone() {
        return null;
    }
}