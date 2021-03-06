package nukkitcoders.mobplugin.entities.animal.flying;

import cn.nukkit.item.Item;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import nukkitcoders.mobplugin.entities.animal.FlyingAnimal;
import nukkitcoders.mobplugin.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Parrot extends FlyingAnimal {

    public static final int NETWORK_ID = 30;

    public Parrot(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Override
    public float getWidth() {
        return 0.5f;
    }

    @Override
    public float getHeight() {
        return 0.9f;
    }

    @Override
    public void initEntity() {
        super.initEntity();
        this.setMaxHealth(6);
    }

    @Override
    public Item[] getDrops() {
        List<Item> drops = new ArrayList<>();

        for (int i = 0; i < Utils.rand(1, 2); i++) {
            drops.add(Item.get(Item.FEATHER, 0, 1));
        }

        return drops.toArray(new Item[0]);
    }

    @Override
    public int getKillExperience() {
        return Utils.rand(1, 3);
    }
}
