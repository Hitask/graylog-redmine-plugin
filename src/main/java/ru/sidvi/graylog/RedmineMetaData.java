package ru.sidvi.graylog;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

public class RedmineMetaData implements PluginMetaData {
    @Override
    public String getUniqueId() {
        return "ru.sidvi.graylog.RedminePlugin";
    }

    @Override
    public String getName() {
        return "Redmine Alarmcallback plugin";
    }

    @Override
    public String getAuthor() {
        return "Vitaly Sidorov";
    }

    @Override
    public URI getURL() {
        return URI.create("https://github.com/sidvi1");
    }

    @Override
    public Version getVersion() {
        return Version.from(1, 0, 0);
    }

    @Override
    public String getDescription() {
        return "Graylog stream integration plugin for Redmine.";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.from(2, 0, 0);
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}