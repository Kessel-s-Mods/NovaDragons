package com.kesselot.novadragons;

import com.GACMD.isleofberk.entity.base.dragon.ADragonBase;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("novadragons")
@Mod.EventBusSubscriber(modid = "novadragons")
public class NovaDragons {

	
	public static final ResourceLocation ARMORWING_SPAWNS = new ResourceLocation("archipelagoadditions", "armorwing_spawns");
	public static final ResourceLocation BONEKNAPPER_SPAWNS = new ResourceLocation("archipelagoadditions", "boneknapper_spawns");
	public static final ResourceLocation BUTTERFLYWING_SPAWNS = new ResourceLocation("archipelagoadditions", "butterflywing_spawns");
	public static final ResourceLocation CHANGEWING_SPAWNS = new ResourceLocation("archipelagoadditions", "changewing_spawns");
	public static final ResourceLocation CRIMSON_GOREGUTTER_SPAWNS = new ResourceLocation("archipelagoadditions", "crimson_goregutter_spawns");
	public static final ResourceLocation DEADLY_NADDER_SPAWNS = new ResourceLocation("archipelagoadditions", "deadly_nadder_spawns");
	public static final ResourceLocation DEATHGRIPPER_SPAWNS = new ResourceLocation("archipelagoadditions", "deathgripper_spawns");
	public static final ResourceLocation DEVILISH_DERVISH_SPAWNS = new ResourceLocation("archipelagoadditions", "devilish_dervish_spawns");
	public static final ResourceLocation DRAMILLION_SPAWNS = new ResourceLocation("archipelagoadditions", "dramillion_spawns");
	public static final ResourceLocation EIGHT_LEGGED_NADDER_SPAWNS = new ResourceLocation("archipelagoadditions", "eight_legged_nadder_spawns");
	public static final ResourceLocation FIREWORM_SPAWNS = new ResourceLocation("archipelagoadditions", "fireworm_spawns");
	public static final ResourceLocation FLAME_WHIPPER_SPAWNS = new ResourceLocation("archipelagoadditions", "flame_whipper_spawns");
	public static final ResourceLocation FLIGHTMARE_SPAWNS = new ResourceLocation("archipelagoadditions", "flightmare_spawns");
	public static final ResourceLocation GALESLASH_SPAWNS = new ResourceLocation("archipelagoadditions", "galeslash_spawns");
	public static final ResourceLocation GRONCKLE_SPAWNS = new ResourceLocation("archipelagoadditions", "gronckle_spawns");
	public static final ResourceLocation HELSTRYKE_SPAWNS = new ResourceLocation("archipelagoadditions", "helstryke_spawns");
	public static final ResourceLocation HOBBLEGRUNT_SPAWNS = new ResourceLocation("archipelagoadditions", "hobblegrunt_spawns");
	public static final ResourceLocation HOTBURPLE_SPAWNS = new ResourceLocation("archipelagoadditions", "hotburple_spawns");
	public static final ResourceLocation HUSHBOGGLE_SPAWNS = new ResourceLocation("archipelagoadditions", "hushboggle_spawns");
	public static final ResourceLocation LIGHT_FURY_SPAWNS = new ResourceLocation("archipelagoadditions", "light_fury_spawns");
	public static final ResourceLocation MAGMA_BREATHER_SPAWNS = new ResourceLocation("archipelagoadditions", "magma_breather_spawns");
	public static final ResourceLocation MONSTROUS_NIGHTMARE_SPAWNS = new ResourceLocation("archipelagoadditions", "monstrous_nightmare_spawns");
	public static final ResourceLocation PRICKLEBOGGLE_SPAWNS = new ResourceLocation("archipelagoadditions", "prickleboggle_spawns");
	public static final ResourceLocation RAZORWHIP_SPAWNS = new ResourceLocation("archipelagoadditions", "razorwhip_spawns");
	public static final ResourceLocation RUMBLEHORN_SPAWNS = new ResourceLocation("archipelagoadditions", "rumblehorn_spawns");
	public static final ResourceLocation SANDWRAITH_SPAWNS = new ResourceLocation("archipelagoadditions", "sandwraith_spawns");
	public static final ResourceLocation SCAULDRON_SPAWNS = new ResourceLocation("archipelagoadditions", "scaul­dron_spawns");
	public static final ResourceLocation SCUTTLECLAW_SPAWNS = new ResourceLocation("archipelagoadditions", "scuttleclaw_spawns");
	public static final ResourceLocation SENTINEL_SPAWNS = new ResourceLocation("archipelagoadditions", "sentinel_spawns");
	public static final ResourceLocation SHOCKJAW_SPAWNS = new ResourceLocation("archipelagoadditions", "shockjaw_spawns");
	public static final ResourceLocation SILVER_PHANTOM_SPAWNS = new ResourceLocation("archipelagoadditions", "silver_phantom_spawns");
	public static final ResourceLocation SINGETAIL_SPAWNS = new ResourceLocation("archipelagoadditions", "singetail_spawns");
	public static final ResourceLocation SKRILL_SPAWNS = new ResourceLocation("archipelagoadditions", "skrill_spawns");
	public static final ResourceLocation SKRILLCUTTER_SPAWNS = new ResourceLocation("archipelagoadditions", "skrillcutter_spawns");
	public static final ResourceLocation SKRILLKNAPPER_SPAWNS = new ResourceLocation("archipelagoadditions", "skrillknapper_spawns");
	public static final ResourceLocation SLITHERWING_SPAWNS = new ResourceLocation("archipelagoadditions", "slitherwing_spawns");
	public static final ResourceLocation SMOKEBREATH_SPAWNS = new ResourceLocation("archipelagoadditions", "smokebreath_spawns");
	public static final ResourceLocation SNAPTRAPPER_SPAWNS = new ResourceLocation("archipelagoadditions", "snaptrapper_spawns");
	public static final ResourceLocation SNOW_WRAITH_SPAWNS = new ResourceLocation("archipelagoadditions", "snow_wraith_spawns");
	public static final ResourceLocation SONGWING_SPAWNS = new ResourceLocation("archipelagoadditions", "songwing_spawns");
	public static final ResourceLocation STINGER_SPAWNS = new ResourceLocation("archipelagoadditions", "stinger_spawns");
	public static final ResourceLocation STORMCUTTER_SPAWNS = new ResourceLocation("archipelagoadditions", "stormcutter_spawns");
	public static final ResourceLocation STORMINGNIGHTMARE_SPAWNS = new ResourceLocation("archipelagoadditions", "stormingnightmare_spawns");
	public static final ResourceLocation TERRIBLE_TERROR_SPAWNS = new ResourceLocation("archipelagoadditions", "terrible_terror_spawns");
	public static final ResourceLocation THUNDERBOTTOM_SPAWNS = new ResourceLocation("archipelagoadditions", "thunderbottom_spawns");
	public static final ResourceLocation TIMBERJACK_SPAWNS = new ResourceLocation("archipelagoadditions", "timberjack_spawns");
	public static final ResourceLocation TRIPLE_STRYKE_SPAWNS = new ResourceLocation("archipelagoadditions", "triple_stryke_spawns");
	public static final ResourceLocation WHISPERING_DEATH_SPAWNS = new ResourceLocation("archipelagoadditions", "whispering_death_spawns");
	public static final ResourceLocation WINDWALKER_SPAWNS = new ResourceLocation("archipelagoadditions", "windwalker_spawns");
	public static final ResourceLocation WOLF_FANG_SPAWNS = new ResourceLocation("archipelagoadditions", "wolf_fang_spawns");
	public static final ResourceLocation WOOLLY_HOWL_SPAWNS = new ResourceLocation("archipelagoadditions", "woolly_howl_spawns");
	public static final ResourceLocation ZIPPLEBACK_SPAWNS = new ResourceLocation("archipelagoadditions", "zippleback_spawns");
	
    public NovaDragons() {}

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {

        if (event.getName() == null) return;

        ResourceLocation biomeId = event.getName();

        for (EntityType<?> entityType : ForgeRegistries.ENTITIES.getValues()) {

            Class<?> entityClass = entityType.getBaseClass();
            if (entityClass == null) continue;

            if (!ADragonBase.class.isAssignableFrom(entityClass)) continue;

            ResourceLocation entityId = entityType.getRegistryName();
            if (entityId == null) continue;

            String dragonname = entityId.getPath();

            // Celestial dragons
            if (dragonname.contains("celestial")) {

                addSpawns(
                        event,
                        biomeId,
                        entityType,
                        WOOLLY_HOWL_SPAWNS,
                        2000,
                        1,
                        2
                );

            } else {

 

                // Example default values for noncelestial (expandable per dragon later)
                addSpawns(
                        event,
                        biomeId,
                        entityType,
                        WOOLLY_HOWL_SPAWNS,
                        2000,
                        1,
                        3
                );
            }
            
            
            
        }
    }

    private static void addSpawns(
            BiomeLoadingEvent event,
            ResourceLocation biomeId,
            EntityType<?> entity,
            ResourceLocation tagId,
            int weight,
            int min,
            int max
    ) {

        TagKey<Biome> biomeTag = TagKey.create(Registry.BIOME_REGISTRY, tagId);

        Biome biome = ForgeRegistries.BIOMES.getValue(biomeId);
        if (biome == null) return;

        if (ForgeRegistries.BIOMES.tags().getTag(biomeTag).contains(biome)) {

            event.getSpawns()
                    .getSpawner(MobCategory.CREATURE)
                    .add(new MobSpawnSettings.SpawnerData(entity, weight, min, max));
        }
    }
}