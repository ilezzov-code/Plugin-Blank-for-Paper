package ru.ilezzov.pluginblank.database;

import org.bukkit.entity.Player;
import ru.ilezzov.pluginblank.models.PluginPlayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

public interface DBConnection {
    void connect() throws SQLException;
    void checkTables() throws SQLException;
    void updateUser(final Player player) throws SQLException;
    void insertUser(final Player player) throws SQLException;
    void insertUser(final PluginPlayer myPlayer) throws SQLException;
    void close() throws SQLException;

    boolean checkUser(final UUID playerUniqueId) throws SQLException;

    Connection getConnection() throws SQLException;

    PluginPlayer getPlayer(final Player player) throws SQLException;
}
