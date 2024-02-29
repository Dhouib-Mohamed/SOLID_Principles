package com.directi.training.ocp.exercise;

public class TimeSlot implements Slot
{
    public String type = "TIME"

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
