/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author IT
 */
public class Planning extends Observable implements Serializable{
        private Formation formation;
	private List<Module> modules;

    public Planning() {
    }
	
}
