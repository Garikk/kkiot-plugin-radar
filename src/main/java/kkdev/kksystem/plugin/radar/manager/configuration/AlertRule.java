/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.manager.configuration;

import java.util.Map;

/**
 *
 * @author garikk
 */
public class AlertRule {
    public enum AlertType {
        INFORM,
        INFORM_WARN,
        PARKING
    }
    String name;
    Integer[] sectors;
    AlertType[] alert_type;
    Map<Double,Integer> range_alerts;
}
