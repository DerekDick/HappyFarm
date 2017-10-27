package com.haveacupofjava.happyfarm.farmerhand;

import com.haveacupofjava.happyfarm.product.AbstractTool;
import com.haveacupofjava.happyfarm.room.StorageRoom;

public abstract class AbstractFarmHand {

    protected AbstractTool tool;

    /**
     * get one tool
     * @param tool
     * @return
     */
    public AbstractTool getTool(String tool){
        StorageRoom storageRoom = new StorageRoom();
        return storageRoom.getTool(tool);
    }
}
