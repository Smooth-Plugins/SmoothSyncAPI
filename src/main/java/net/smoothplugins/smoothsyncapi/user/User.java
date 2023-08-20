package net.smoothplugins.smoothsyncapi.user;

import com.google.gson.annotations.SerializedName;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Statistic;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class User {

    @SerializedName("_id")
    private final UUID uuid;
    private ItemStack[] inventoryItems;
    private ItemStack[] enderChestItems;
    private GameMode gameMode;
    private float exp;
    private Collection<PotionEffect> potionEffects;
    private double healthScale;
    private double health;
    private int foodLevel;
    private float saturation;
    private float exhaustion;
    private int maximumAir;
    private int remainingAir;
    private Location location;
    private Set<AdvancementProgress> advancements;
    private Set<Statistic> statistics;

    public User(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public ItemStack[] getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(ItemStack[] inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public ItemStack[] getEnderChestItems() {
        return enderChestItems;
    }

    public void setEnderChestItems(ItemStack[] enderChestItems) {
        this.enderChestItems = enderChestItems;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }

    public Collection<PotionEffect> getPotionEffects() {
        return potionEffects;
    }

    public void setPotionEffects(Collection<PotionEffect> potionEffects) {
        this.potionEffects = potionEffects;
    }

    public double getHealthScale() {
        return healthScale;
    }

    public void setHealthScale(double healthScale) {
        this.healthScale = healthScale;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }

    public float getSaturation() {
        return saturation;
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }

    public float getExhaustion() {
        return exhaustion;
    }

    public void setExhaustion(float exhaustion) {
        this.exhaustion = exhaustion;
    }

    public int getMaximumAir() {
        return maximumAir;
    }

    public void setMaximumAir(int maximumAir) {
        this.maximumAir = maximumAir;
    }

    public int getRemainingAir() {
        return remainingAir;
    }

    public void setRemainingAir(int remainingAir) {
        this.remainingAir = remainingAir;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<AdvancementProgress> getAdvancements() {
        return advancements;
    }

    public void setAdvancements(Set<AdvancementProgress> advancements) {
        this.advancements = advancements;
    }

    public Set<Statistic> getStatistics() {
        return statistics;
    }

    public void setStatistics(Set<Statistic> statistics) {
        this.statistics = statistics;
    }
}
