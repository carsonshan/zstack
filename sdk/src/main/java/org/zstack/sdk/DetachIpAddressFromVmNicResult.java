package org.zstack.sdk;

import org.zstack.sdk.VmNicInventory;

public class DetachIpAddressFromVmNicResult {
    public VmNicInventory inventory;
    public void setInventory(VmNicInventory inventory) {
        this.inventory = inventory;
    }
    public VmNicInventory getInventory() {
        return this.inventory;
    }

}
