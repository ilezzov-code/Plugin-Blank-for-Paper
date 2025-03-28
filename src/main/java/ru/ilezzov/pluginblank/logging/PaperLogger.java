package ru.ilezzov.pluginblank.logging;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.logger.slf4j.ComponentLogger;
import ru.ilezzov.pluginblank.Main;

import java.util.List;

public class PaperLogger implements Logger {
    private final ComponentLogger logger;

    public PaperLogger(final Main plugin) {
        logger = plugin.getComponentLogger();
    }

    @Override
    public void info(final String message) {
        logger.info(Component.text(message));
    }

    @Override
    public void info(final Component component) {
        logger.info(component);
    }

    @Override
    public void info(final List<Component> components) {
        for (final Component component : components) {
            logger.info(component);
        }
    }
}
