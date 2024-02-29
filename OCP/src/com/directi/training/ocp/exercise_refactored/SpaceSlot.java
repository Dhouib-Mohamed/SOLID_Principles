package com.directi.training.ocp.exercise;

public class SpaceSlot implements Slot
{
    public String type = "SPACE"
    public void markSlotFree(int resourceId)
    {
    }

    public void markSlotBusy(int resourceId)
    {
    }

    public int findFreeSlot() {
        return 0;
    }
}
