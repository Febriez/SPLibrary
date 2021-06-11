package com.splendor.builder;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemBuilder extends ItemStack {

    private Material material;
    private ItemMeta itemMeta;

    public ItemBuilder(Material material) {
        this.material = material;
        this.setType(material);
        this.itemMeta = this.getItemMeta();
        this.setAmount(1);
    }

    public ItemBuilder(ItemStack item) {
        this.material = item.getType();
        this.setType(item.getType());
        this.itemMeta = item.getItemMeta();
        this.setAmount(item.getAmount());
    }

    public ItemBuilder setData(short a) {
        this.setDurability(a);
        return this;
    }

    public ItemBuilder setItemMetas(ItemMeta meta) {
        this.itemMeta = meta;
        this.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setTypes(Material material) {
        this.material = material;
        this.setType(material);
        return this;
    }

    public ItemBuilder setAmounts(int amount) {
        this.setAmount(amount);
        return this;
    }

    public ItemStack build() {
        this.setType(material);
        this.setItemMeta(itemMeta);
        return this;
    }
}
