package com.wayne.skillplugin.skills;


import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.sucy.skill.api.skills.Skill;
import com.sucy.skill.api.skills.SkillAttribute;
import com.sucy.skill.api.skills.SkillShot;

public class Earthquake extends Skill implements SkillShot, Listener {
	
	public static String NAME = "Thunder";
	public static Double RANGE_BASE = 5.0;
	public static Double DAMAGE_BASE = 10.0;
	
	public Earthquake(){
		super(NAME, "AOE", Material.WOOD, 5);
		settings.set(SkillAttribute.LEVEL , 1, 1);
		settings.set(SkillAttribute.COST , 1, 1);
		settings.set(SkillAttribute.MANA , 0, 0);
		settings.set(SkillAttribute.COOLDOWN , 1, 0);
		
		settings.set("Damage", 10);
		settings.set("Range", 5);
	}
	public boolean cast(LivingEntity user, int level) {
		// TODO Auto-generated method stub
		List<Entity> entitys = user.getNearbyEntities(RANGE_BASE, RANGE_BASE, RANGE_BASE);
		
		
		for(Entity e : entitys){
			if(e instanceof LivingEntity && !(e instanceof Player)){
				LivingEntity _e = (LivingEntity)e;
				_e.damage(DAMAGE_BASE+level*5);
			}
		}
		return false;
	}

}
