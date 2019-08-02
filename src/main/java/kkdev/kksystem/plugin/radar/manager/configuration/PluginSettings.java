/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.manager.configuration;

import kkdev.kksystem.base.classes.plugins.simple.SettingsManager;

/**
 *
 * @author Garikk
 */
public abstract class PluginSettings {

    public static String RADAR_CONF;

    public static RadarConf MainConfiguration;

    public static void InitConfig(String GlobalConfigUID, String MyUID) {
        RADAR_CONF = GlobalConfigUID + "_" + MyUID + ".json";

        SettingsManager settings = new SettingsManager(RADAR_CONF, RadarConf.class);

        //   System.out.println("[LCDDisplay][CONFIG] Load configuration");
        MainConfiguration = (RadarConf) settings.loadConfig();

        if (MainConfiguration == null) {
            System.out.println("[KKRDR][CONFIG] Error Load configuration, try create default config");
            settings.saveConfig(kk_DefaultConfig.MakeDefaultConfig());
            MainConfiguration = (RadarConf) settings.loadConfig();
        }
        if (MainConfiguration == null) {
            System.out.println("[KKRDR][CONFIG] Load configuration, fatal");
            return;
        }

    }

}
