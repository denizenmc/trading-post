package com.denizen.tradingpost.components;

import com.denizen.tradingpost.TradingPost;
import me.denizen.guiengine.blueprint.MenuBlueprint;
import me.denizen.guiengine.menu.Menu;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

public abstract class Component {
    private String id, name;
    private Long creationTime;
    private List<String> description;
    public Component (String id) {
        this.id = id;
        name = "&dDefault Name";
        description = Arrays.asList("&7This is the default", "&fdescription &7for this component");
        creationTime = System.currentTimeMillis();
    }
    public String getName() { return name; }
    public List<String> getDescription() { return description; }
    public String getID() { return id; }
    public abstract ItemStack getIcon();
    public abstract Menu<TradingPost> getMenu(Menu<TradingPost> previous, Player player, MenuBlueprint<TradingPost> blueprint);
}
