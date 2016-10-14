package com.wayne.skillplugin.face;

import com.sucy.skill.SkillAPI;
import com.sucy.skill.api.SkillPlugin;
import com.wayne.skillplugin.skills.Earthquake;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginInterface extends JavaPlugin implements SkillPlugin {

	public void registerClasses(SkillAPI arg0) {
		// TODO Auto-generated method stub
		
	}

	public void registerSkills(SkillAPI arg0) {
		// TODO Auto-generated method stub
		arg0.addSkill(new Earthquake());
	}

}
