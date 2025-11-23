package me.tema159.ANR;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface Api {
    // blocks is empty = default value from config
    void setViewDistance(@NotNull Player sender, int... blocks);

    void reload();
}
