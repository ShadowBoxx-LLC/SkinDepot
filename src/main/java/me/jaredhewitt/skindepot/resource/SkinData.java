package me.jaredhewitt.skindepot.resource;

import java.util.List;
import java.util.UUID;

import net.minecraft.util.ResourceLocation;

@SuppressWarnings("unused")
class SkinData {

    List<Skin> skins;
}

@SuppressWarnings("unused")
class Skin {

    String name;
    UUID uuid;
    String skin;

    public ResourceLocation getTexture() {
        return new ResourceLocation("skindepot", String.format("textures/skins/%s.png", skin));
    }
}
