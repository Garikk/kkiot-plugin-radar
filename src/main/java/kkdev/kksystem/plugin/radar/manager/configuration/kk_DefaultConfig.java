/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.manager.configuration;

import kkdev.kksystem.base.constants.SystemConsts;
import static kkdev.kksystem.base.constants.SystemConsts.*;


/**
 *
 * @author blinov_is
 *
 * Creating default config
 *
 * RaspberryPI_B and MIELT Display
 *
 */
public abstract class kk_DefaultConfig {

    public static RadarConf MakeDefaultConfig() {

        RadarConf DefConf = new RadarConf();
        
        RadarCluster rearRadar = new RadarCluster();
        RadarCluster frontRadar = new RadarCluster();
        RadarCluster sideRadar = new RadarCluster();
        
        rearRadar.Name = "Rear park radar";
        rearRadar.Sensors = new RadarSensor[4];
        rearRadar.Sensors[0] = initDefSensor(0,2000, 15);
        rearRadar.Sensors[1] = initDefSensor(1,2000, 15);
        rearRadar.Sensors[2] = initDefSensor(2,2000, 15);
        rearRadar.Sensors[3] = initDefSensor(3,2000, 15);

        rearRadar.Name = "Front park radar";
        frontRadar.Sensors = new RadarSensor[2];
        frontRadar.Sensors[0] = new RadarSensor();
        frontRadar.Sensors[1] = new RadarSensor();

        rearRadar.Name = "blind spot radar";
        sideRadar.Sensors = new RadarSensor[2];
        sideRadar.Sensors[0] = new RadarSensor();
        sideRadar.Sensors[1] = new RadarSensor();


        
       return DefConf;
    }
    private static RadarSensor initDefSensor(Integer idx, Integer range, Integer sector)
    {
        RadarSensor ret = new RadarSensor();
        return ret;
    }
    
}