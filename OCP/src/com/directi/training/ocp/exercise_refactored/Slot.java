package com.directi.training.ocp.exercise;

public abstract class Slot
{
    public abstract String type;
    public abstract void markSlotFree(int resourceId);

    public abstract void markSlotBusy(int resourceId);

    public abstract int findFreeSlot();



}
