/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkdev.kksystem.plugin.radar.manager;

/**
 *
 * @author garikk
 */
public interface IRadarCallback {
    void DistanceInform(RadarMessage message);
    void DistanceAlert(RadarMessage message);
}
