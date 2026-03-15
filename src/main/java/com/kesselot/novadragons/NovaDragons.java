package com.kesselot.novadragons;

import com.GACMD.isleofberk.entity.base.dragon.ADragonBase;

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

	private static final int WEIGHT = 2000;
	private static final int MIN = 1;
	private static final int MAX = 3;

	public NovaDragons() {
	}

	@SubscribeEvent
	public static void onBiomeLoad(BiomeLoadingEvent event) {

		for (EntityType<?> entityType : ForgeRegistries.ENTITIES.getValues()) {

			Class<?> entityClass = entityType.getBaseClass();

			if (entityClass != null && ADragonBase.class.isAssignableFrom(entityClass)) {

				String id = entityType.getRegistryName().getPath();

				// Celestial -> End only
				if (id.contains("celestial")) {

					if (event.getCategory() == Biome.BiomeCategory.THEEND) {
						addSpawn(event, entityType);
					}

				} else {

					// All other dragons -> non-End biomes
					if (event.getCategory() != Biome.BiomeCategory.THEEND) {
						addSpawn(event, entityType);
					}

				}
			}
		}
	}

	private static void addSpawn(BiomeLoadingEvent event, EntityType<?> entity) {

		event.getSpawns().getSpawner(MobCategory.CREATURE)
				.add(new MobSpawnSettings.SpawnerData(entity, WEIGHT, MIN, MAX));
	}
}