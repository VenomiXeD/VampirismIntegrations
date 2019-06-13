package de.teamlapen.vampirism_integrations;

import de.teamlapen.lib.lib.util.IInitListener;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;

import javax.annotation.Nullable;

/**
 * Handles compatibility for a single mod.
 * Should not load any classes outside of init
 * Updated copy of {@link de.teamlapen.lib.lib.util.IModCompat}
 */
public interface IModCompat extends IInitListener {
    /**
     * Can be null if all versions are accepted
     * {@link net.minecraftforge.fml.common.versioning.VersionRange} String
     */
    @Nullable
    default String getAcceptedVersionRange() {
        return null;
    }

    String getModID();

    void loadConfigs(Configuration config, ConfigCategory category);
}