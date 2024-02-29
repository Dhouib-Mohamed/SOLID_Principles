package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Slot slot)
    {
        if (slot.type === null) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
        }
        int resourceId = slot.findFreeSlot();
        slot.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Slot slot, int resourceId)
    {
        if (slot.type === null) {
            System.out.println("ERROR: attempted to free invalid resource");
        }
        slot.markSlotFree();
    }
}
