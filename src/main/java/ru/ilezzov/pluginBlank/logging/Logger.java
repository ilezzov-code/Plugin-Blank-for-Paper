package ru.ilezzov.pluginBlank.logging;

import net.kyori.adventure.text.Component;

public interface Logger {
    void info(final Component component);
    void info(final String message);
}
