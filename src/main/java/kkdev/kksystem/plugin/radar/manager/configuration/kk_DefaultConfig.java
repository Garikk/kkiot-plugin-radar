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

        RadarClusterConf rearRadar = new RadarClusterConf();
        RadarClusterConf frontRadar = new RadarClusterConf();
        RadarClusterConf sideRadar = new RadarClusterConf();

        rearRadar.Name = "Rear park radar";
        rearRadar.AreaId = 1;
        rearRadar.Sensors = new RadarSensorConf[4];
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
        rearRadar.AreaId = 2;
        frontRadar.Sensors = new RadarSensorConf[2];
        frontRadar.Sensors[0] = new RadarSensorConf();
        frontRadar.Sensors[1] = new RadarSensorConf();

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
        rearRadar.AreaId = 3;
        sideRadar.Sensors = new RadarSensorConf[2];
        sideRadar.Sensors[0] = new RadarSensorConf();
        sideRadar.Sensors[1] = new RadarSensorConf();
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

    private static RadarSensorConf initDefSensor(Integer idx, Integer range, Integer sector) {
        RadarSensorConf ret = new RadarSensorConf();
        return ret;
    }

}
