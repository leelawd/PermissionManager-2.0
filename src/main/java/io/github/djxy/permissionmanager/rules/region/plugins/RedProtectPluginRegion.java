package io.github.djxy.permissionmanager.rules.region.plugins;

import br.net.fabiozumbi12.redprotect.API.RedProtectAPI;
import br.net.fabiozumbi12.redprotect.Region;
import io.github.djxy.permissionmanager.logger.Logger;
import io.github.djxy.permissionmanager.rules.region.RegionPlugin;
import org.spongepowered.api.entity.living.player.Player;

import java.util.Collection;

/**
 * Created by Samuel on 2016-08-19.
 */
public class RedProtectPluginRegion implements RegionPlugin {

    private static final Logger LOGGER = new Logger(RedProtectPluginRegion.class);

    @Override
    public boolean isPlayerInRegion(Player player, Collection<String> regions) {
        Region region = RedProtectAPI.getRegion(player.getLocation());

        if(region != null)
            LOGGER.info(region.getName());

        return region != null && regions.contains(region.getName());
    }

}
