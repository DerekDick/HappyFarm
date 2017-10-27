package com.haveacupofjava.happyfarm.field;

import com.haveacupofjava.happyfarm.visitor.AbstractFieldVisitor;

public class PigPen extends AbstractPen {

    @Override
    public void show() {
    }

    @Override
    public void acceptVisitor(AbstractFieldVisitor visitor) {
        visitor.visit(this);
    }

}
