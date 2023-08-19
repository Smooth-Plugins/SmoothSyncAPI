package net.smoothplugins.smoothsyncapi.user;

import com.google.gson.annotations.SerializedName;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class User {

    @SerializedName("_id")
    private final UUID uuid;
    private ItemStack[] items;

    public User(UUID uuid, ItemStack[] items) {
        this.uuid = uuid;
        this.items = items;
    }

    public UUID getUuid() {
        return uuid;
    }

    public ItemStack[] getItems() {
        return items;
    }

    public void setItems(ItemStack[] items) {
        this.items = items;
    }
}
