/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.knights;

import static org.mockito.Mockito.*;

import org.junit.Test;

/**
 *
 * @author Teodor Todorov
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        Minstrel mockMinstrel = mock(Minstrel.class);
        BraveKnight knight = new BraveKnight(mockQuest, mockMinstrel);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}
