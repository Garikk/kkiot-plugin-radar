/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.manager.configuration;

import java.util.HashMap;
import kkdev.kksystem.base.constants.SystemConsts;
import static kkdev.kksystem.base.constants.SystemConsts.*;
import kkdev.kksystem.plugin.radar.manager.configuration.AlertRule.AlertType;
import static kkdev.kksystem.plugin.radar.manager.configuration.AlertRule.AlertType.WARNING;

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
        rearRadar.Sensors[0] = initDefSensor(0, 2000, 15);
        rearRadar.Sensors[1] = initDefSensor(1, 2000, 15);
        rearRadar.Sensors[2] = initDefSensor(2, 2000, 15);
        rearRadar.Sensors[3] = initDefSensor(3, 2000, 15);

        rearRadar.AlertRules = new AlertRule[1];
        AlertRule aRule = new AlertRule();
        aRule.alert_type = new AlertType[1];
        aRule.alert_type[0] = AlertType.PARKING;
        aRule.name = "Default rear radar range";
        aRule.range_alerts = new HashMap();
        aRule.range_alerts.put(0.1, 10);
        aRule.range_alerts.put(0.2, 9);
        aRule.range_alerts.put(0.3, 8);
        aRule.range_alerts.put(0.5, 7);
        aRule.range_alerts.put(0.7, 6);
        aRule.range_alerts.put(1d, 5);
        aRule.range_alerts.put(1.5d, 3);
        aRule.range_alerts.put(2d, 1);
        rearRadar.AlertRules[0] = aRule;

        frontRadar.Name = "Front park radar";
        frontRadar.Sensors = new RadarSensor[2];
        frontRadar.Sensors[0] = new RadarSensor();
        frontRadar.Sensors[1] = new RadarSensor();

        frontRadar.AlertRules = new AlertRule[2];
        aRule = new AlertRule();
        aRule.alert_type = new AlertType[1];
        aRule.alert_type[0] = AlertType.PARKING;
        aRule.name = "Default front radar range";
        aRule.range_alerts = new HashMap();
        aRule.range_alerts.put(0.01, 10);
        aRule.range_alerts.put(0.05, 9);
        aRule.range_alerts.put(0.1, 8);
        aRule.range_alerts.put(0.2, 7);
        aRule.range_alerts.put(0.5, 6);
        aRule.range_alerts.put(1d, 5);
        aRule.range_alerts.put(1.5d, 3);
        aRule.range_alerts.put(2d, 1);
        rearRadar.AlertRules[0] = aRule;
        aRule = new AlertRule();
        aRule.alert_type = new AlertType[1];
        aRule.alert_type[0] = AlertType.INFORM;
        aRule.name = "front radar range Inform";
        aRule.range_alerts = new HashMap();
        aRule.range_alerts.put(1d, 4);
        aRule.range_alerts.put(1.5d, 3);
        aRule.range_alerts.put(2d, 2);
        aRule.range_alerts.put(3d, 1);
        rearRadar.AlertRules[1] = aRule;

        sideRadar.Name = "blind spot radar";
        sideRadar.Sensors = new RadarSensor[2];
        sideRadar.Sensors[0] = new RadarSensor();
        sideRadar.Sensors[1] = new RadarSensor();
        sideRadar.AlertRules = new AlertRule[2];
        aRule = new AlertRule();
        aRule.alert_type = new AlertType[1];
        aRule.alert_type[0] = AlertType.INFORM_WARN;
        aRule.name = "BlindSpot rule Sector 1";
        aRule.sectors = new Integer[1];
        aRule.sectors[0] = 1;
        aRule.range_alerts = new HashMap();
        aRule.range_alerts.put(1.5d, 5);
        sideRadar.AlertRules[0] = aRule;
        aRule = new AlertRule();
        aRule.alert_type = new AlertType[1];
        aRule.alert_type[0] = AlertType.INFORM_WARN;
        aRule.name = "BlindSpot rule Sector 2";
        aRule.sectors = new Integer[1];
        aRule.sectors[0] = 2;
        aRule.range_alerts = new HashMap();
        aRule.range_alerts.put(1.5d, 5);
        sideRadar.AlertRules[1] = aRule;

        return DefConf;
    }

    private static RadarSensor initDefSensor(Integer idx, Integer range, Integer sector) {
        RadarSensor ret = new RadarSensor();
        return ret;
    }

}
