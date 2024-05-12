package xyz.kardosk.multiblocklib.configs;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import pl.mikigal.config.Config;
import pl.mikigal.config.annotation.ConfigName;
import xyz.kardosk.multiblocklib.MultiblockLib;

@ConfigName("config.yml")
public interface MainConfig extends Config {
    default ItemStack getHammerItem() {
        ItemStack is = new ItemStack(Material.STICK);

        ItemMeta im = is.getItemMeta();
        im.setDisplayName("&c&lMultiblock Hammer");
        im.setUnbreakable(true);
        im.setCustomModelData(1);
        is.setItemMeta(im);

        return is;
    }
    public void setHammerItem(ItemStack hammerItem);

}
