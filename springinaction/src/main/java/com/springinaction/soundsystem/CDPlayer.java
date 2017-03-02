/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Teodor Todorov
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisk cd;

    @Autowired
    public CDPlayer(CompactDisk cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

}
